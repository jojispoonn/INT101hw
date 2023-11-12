package int101.homework02;
import work01.Utilitor;
import work02.Person;
import work03.Account;
public class Int101Homework02Updated {
    public static void main(String[] args) {
        work01Utilitor();
        work02Person();
        work03Account();
    }
    public static void work01Utilitor(){
        System.out.println(Utilitor.testString("Thep"));
        System.out.println(123456789);
        System.out.println(698.4);
    }
    public static void work02Person(){
        Person person1 = new Person("Thepthai", "Udomvuthinunt");
        Person person2 = new Person("Joji","Spoon");
        Person person3 = new Person("Kanye","West");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());

        person2.setFirstName("Jeejo");
        person2.setLastName("Joji");
        System.out.println(person2.getFirstName());
        System.out.println(person2.getLastName());

        System.out.println(person1.equals(person2));
    }
    public static void work03Account(){
        Person person1 = new Person("Thepthai", "Udomvuthinunt");
        Person person2 = new Person("Joji","Spoon");
        Person person3 = new Person("Kanye","West");
        Account account1 = new Account(person1);
        Account account2 = new Account(person2);
        Account account3 = new Account(person3);

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);

        System.out.println(account1.getNo());
        System.out.println(account1.getBalance());
        System.out.println(account1.getOwner());

        account1.deposit(15000);
        System.out.println(account1);

        account1.transfer(1000,account3);
        System.out.println(account1);
        System.out.println(account3);

        System.out.println(account1.equals(account2));
    }
}
