package com.company.model.twowheeled;


public class Bike extends TwoWheeled {

    private String pedals;

    public Bike() {  // todo конструктор?

    }

    @Override
    public void drive() {
        System.out.println("Велосипед едет");
    }
}
