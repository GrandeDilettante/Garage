package com.company.model.twowheeled;


public class Bike extends TwoWheeled {

    private String pedals;

    public Bike(String color, int payment, int maxSpeed, int weightLimit, String brand, String pedals) {
        super(color, payment, maxSpeed, weightLimit, brand);
        this.pedals = pedals;
    }

    @Override
    public void drive() {
        System.out.println("Велосипед едет");
    }
}
