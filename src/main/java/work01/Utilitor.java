package work01;

public class Utilitor {
    public static String testString(String value){
        if (value == null){
            throw new NullPointerException("Is null");
        }
        if (value.isBlank()){
            throw new RuntimeException("Is blank");
        }
        return value;
    }
    public static double testPositive(double value){
        if(value < 0){
            throw new IllegalArgumentException("Must be positive");
        }
        return value;
    }
    public static long computeIsbn10(long isbn10){
        int count = 0;
        long thisIsbn10 = isbn10;
        while (isbn10 != 0){
            count++;
            isbn10 /= 10;
        }
        if(count !=9){
            throw new IllegalArgumentException();
        }
        long result = 0;
        for (int i= 2; i <= 10; i++ ){
            long digit = thisIsbn10 % 10;
            result += digit * 1;
            thisIsbn10 /= 10;
        }
        if (result % 11 == 0){
            return 0;
        }
        if (result % 11 == 1){
            return 0;
        }
        return 11 - (result % 11);
    }
}
