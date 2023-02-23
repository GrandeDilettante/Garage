package com.company.models.aircraft;

import com.company.interfaces.Breakable;
import com.company.interfaces.Drivable;


public abstract class Aircraft implements Breakable, Drivable {

    public Aircraft(String serialNumber, int capacity, int maxDistance, String country) {
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
