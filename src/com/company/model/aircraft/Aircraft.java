package com.company.model.aircraft;

import com.company.interfaces.Breakable;
import com.company.interfaces.Drivable;
import com.company.model.Transport;


public abstract class Aircraft extends Transport implements Breakable, Drivable {

    public Aircraft(String color, int payment, String serialNumber, int capacity, int maxDistance, String country) {
        super(color,payment);
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
