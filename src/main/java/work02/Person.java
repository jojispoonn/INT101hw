package work02;

import work01.Utilitor;

import java.util.Objects;

public class Person {
    private static int nextID = 1;
    private final int id;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        this.id = nextID++;
        this.firstName = Utilitor.testString(firstName);
        this.lastName = Utilitor.testString(lastName);
    }
    public int getId(){
        return this.id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = Utilitor.testString(firstName);
    }
    public void setLastName(String lastName){
        this.lastName = Utilitor.testString(lastName);
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Person {");
        sb.append("id = ").append(this.id);
        sb.append(", firstname =").append(this.firstName);
        sb.append(", lastname =").append(this.lastName);
        sb.append(" }");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }
}
