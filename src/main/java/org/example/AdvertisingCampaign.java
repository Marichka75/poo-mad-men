package org.example;

public class AdvertisingCampaign {
    private String name;
    private Client client;
    private CreativeDirector director;

    public AdvertisingCampaign(String name, Client client, CreativeDirector director) {
        this.name = name;
        this.client = client;
        this.director = director;
    }

    public void launch() {
        System.out.println("Launching campaign '" + name + "' for client " +
                client.getName() + " directed by " + director.getName() + ".");
    }
}

