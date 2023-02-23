package com.company.model.aircraft;


public class Airplane extends Aircraft {

    public Airplane(String serialNumber, int capacity, int maxDistance, String country, String wings) {
        super(serialNumber, capacity, maxDistance, country);
        this.wings = wings;
    }

    private String wings;

    @Override
    public void breakDown() {
        System.out.println("Самолёт сломался");
    }

    @Override
    public void drive() {
        System.out.println("Самолёт летит");
    }
}
