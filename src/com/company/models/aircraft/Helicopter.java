package com.company.models.aircraft;


public class Helicopter extends Aircraft {

    public Helicopter(String serialNumber, int capacity, int maxDistance, String country, String helix) {
        super(serialNumber, capacity, maxDistance, country);
        this.helix = helix;
    }

    private String helix;

    @Override
    public void breakDown() {
        System.out.println("Вертолёт сломался");
    }

    @Override
    public void drive() {
        System.out.println("Вертолёт летит");
    }
}
