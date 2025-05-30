package org.example;

public class CreativeDirector extends Employee {

    public CreativeDirector(String name, byte age) {
        super(name, age, "Creative Director");
    }

    public void createCampaign() {

        System.out.println(getName() + " is creating a brilliant campaign.");
    }
}

