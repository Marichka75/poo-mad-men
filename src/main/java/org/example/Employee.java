package org.example;

public class Employee extends Person {
    private String position;

    public Employee(String name, byte age, String position) {
        super(name, age);
        this.position = position;
    }

    public void work() {
        System.out.println(getName() + " is working as a " + position + ".");
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

