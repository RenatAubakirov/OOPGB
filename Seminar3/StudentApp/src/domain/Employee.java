package domain;

public class Employee extends WorkingPerson{
    private String special;
    public Employee(String name, int age, String special) {
        super(name, age);
        this.special = special;
    }
}