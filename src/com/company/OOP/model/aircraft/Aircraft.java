package com.company.OOP.model.aircraft;

import com.company.OOP.interfaces.Breakable;
import com.company.OOP.interfaces.Drivable;
import com.company.OOP.model.Transport;


public abstract class Aircraft extends Transport implements Breakable, Drivable {

    public Aircraft(String color, String serialNumber, int capacity, int maxDistance, String country) {
        super(color);
        this.serialNumber = serialNumber;
        this.capacity = capacity;
        this.maxDistance = maxDistance;
        this.country = country;
    }

    private String serialNumber;
    private int capacity;
    private int maxDistance;
    private String country;
}
