package org.example;

public class AccountExecutive extends Employee {

    public AccountExecutive(String name, byte age) {
        super(name, age, "Account Executive");
    }

    public void meetClient() {
        System.out.println(getName() + " is meeting with a client.");
    }
}

