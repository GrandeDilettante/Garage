package com.company.model.twowheeled;


public class Bike extends TwoWheeled {

    private String pedals;

    public Bike() {

    }

    @Override
    public void drive() {
        System.out.println("Велосипед едет");
    }
}
