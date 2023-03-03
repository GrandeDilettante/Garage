package com.company.model.vehicle;


public class HybridCar extends Vehicle {

    private String hybridEngine;

    public HybridCar(String color, String vin, int horsePower, double engineVolume, String hybridEngine) {
        super(color, vin, horsePower, engineVolume);
        this.hybridEngine = hybridEngine;
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
