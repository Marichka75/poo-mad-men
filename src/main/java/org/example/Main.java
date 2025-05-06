package org.example;

public class Main {
    public static void main(String[] args) {
        CreativeDirector don = new CreativeDirector("Don Draper", (byte) 40);
        AccountExecutive roger = new AccountExecutive("Roger Sterling", (byte) 45);
        Secretary joan = new Secretary("Joan Holloway", (byte) 35);
        Employee peggy = new Employee("Peggy Olson", (byte) 30, "Copywriter");

        Client luckyStrike = new Client("Lee Garner Jr.", (byte) 50, "Lucky Strike");

        Agency sCDP = new Agency("Sterling Cooper Draper Pryce");
        sCDP.addEmployee(don);
        sCDP.addEmployee(roger);
        sCDP.addEmployee(joan);
        sCDP.addEmployee(peggy);

        sCDP.showEmployees();

        roger.meetClient();
        joan.answerPhone();
        luckyStrike.requestCampaign();

        AdvertisingCampaign campaign1 = new AdvertisingCampaign("Smoke with Style", luckyStrike, don);
        campaign1.launch();

        don.createCampaign();
    }
}
