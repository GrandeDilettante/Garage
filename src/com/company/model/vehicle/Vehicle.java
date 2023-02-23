package com.company.model.vehicle;

import com.company.interfaces.Breakable;
import com.company.interfaces.Drivable;
import com.company.model.Transport;

public abstract class Vehicle extends Transport implements Breakable, Drivable {

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
