package com.company.OOP.model.twowheeled;


public class Bike extends TwoWheeled {

    private String pedals;

    public Bike(String color, int maxSpeed, int weightLimit, String brand, String pedals) {
        super(color, maxSpeed, weightLimit, brand);
        this.pedals = pedals;
    }

    @Override
    public void drive() {
        System.out.println("Велосипед едет");
    }
}
