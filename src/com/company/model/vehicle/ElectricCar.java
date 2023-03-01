package com.company.model.vehicle;


public class ElectricCar extends Vehicle {

    private String electricEngine;

    public ElectricCar(String color, int payment, String vin, int horsePower, double engineVolume, String electricEngine) {
        super(color,payment, vin, horsePower, engineVolume);
        this.electricEngine = electricEngine;
    }

    @Override
    public void breakDown() {
        System.out.println("Машина с гибридным двигателем сломалась");
    }

    @Override
    public void drive() {
        System.out.println("Машина с гибридным двигателем едет");
    }
}
