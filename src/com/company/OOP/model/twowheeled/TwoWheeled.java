package com.company.OOP.model.twowheeled;

import com.company.OOP.interfaces.Drivable;
import com.company.OOP.model.Transport;


public abstract class TwoWheeled extends Transport implements Drivable {

    private int maxSpeed;
    private int weightLimit;
    private String brand;

    public TwoWheeled(String color, int maxSpeed, int weightLimit, String brand) {
        super(color);
        this.maxSpeed = maxSpeed;
        this.weightLimit = weightLimit;
        this.brand = brand;
    }
}


