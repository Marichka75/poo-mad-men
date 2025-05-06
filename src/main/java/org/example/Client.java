package org.example;

public class Client extends Person {
    private String company;

    public Client(String name, byte age, String company) {
        super(name, age);
        this.company = company;
    }

    public void requestCampaign() {
        System.out.println(getName() + " from " + company + " is requesting a new campaign.");
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}

