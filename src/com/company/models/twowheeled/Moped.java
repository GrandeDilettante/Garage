package com.company.models.twowheeled;


public class Moped extends TwoWheeled {

    private String motor;

    public Moped() {

    }

    @Override
    public void breakDown() {
        System.out.println("Мопед никогда не ломается");
    }

    @Override
    public void drive() {
        System.out.println("Мопед едет");
    }
}
