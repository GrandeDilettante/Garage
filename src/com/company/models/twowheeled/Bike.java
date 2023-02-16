package com.company.models.twowheeled;


public class Bike extends TwoWheeled {

    private String pedals;

    public Bike() {

    }

    @Override
    public void breakDown() {
        System.out.println("Велосипед никогда не ломается");
    }

    @Override
    public void drive() {
        System.out.println("Велосипед едет");
    }
}
