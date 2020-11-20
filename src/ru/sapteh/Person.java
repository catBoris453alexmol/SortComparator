package ru.sapteh;

public class Person {
    private String lastName;
    private String firstName;
    private String patronomic;
    private int age;
    private int pricework;

    public Person (String lastName,String firstName, String patronomic , int age, int pricework){
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronomic = patronomic;
        this.age = age;
        this.pricework = pricework;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronomic() {
        return patronomic;
    }

    public int getAge() {
        return age;
    }

    public int getPricework() {
        return pricework;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %d", getLastName(),getFirstName(),getPatronomic(),getAge(),getPricework());
    }
}
