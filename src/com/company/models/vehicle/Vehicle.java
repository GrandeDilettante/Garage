package com.company.models.vehicle;

public abstract class Vehicle {

    public Vehicle(String vin, int horsePower, double engineVolume, String color) {
        this.vin = vin;
        this.horsePower = horsePower;
        this.engineVolume = engineVolume;
        this.color = color;
    }

    private String vin;
    private int horsePower;
    private double engineVolume;
    private String color;
}
