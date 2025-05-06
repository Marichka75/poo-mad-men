package org.example;

public class Secretary extends Employee {

    public Secretary(String name, byte age) {
        super(name, age, "Secretary");
    }

    public void answerPhone() {
        System.out.println(getName() + " is answering the phone.");
    }
}

