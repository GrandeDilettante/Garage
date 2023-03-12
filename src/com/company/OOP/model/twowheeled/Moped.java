package com.company.OOP.model.twowheeled;


public class Moped extends TwoWheeled {

    private String motor;

    public Moped(String color, int maxSpeed, int weightLimit, String brand, String motor) {
        super(color, maxSpeed, weightLimit, brand);
        this.motor = motor;
    }

    @Override
    public void drive() {
        System.out.println("Мопед едет");
    }
}
