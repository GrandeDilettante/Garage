package com.company.model.twowheeled;


public class Moped extends TwoWheeled {

    private String motor;

    public Moped() {

    }

    @Override
    public void drive() {
        System.out.println("Мопед едет");
    }
}
