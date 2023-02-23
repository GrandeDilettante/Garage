package com.company.model.twowheeled;

import com.company.interfaces.Drivable;
import com.company.model.Transport;


public abstract class TwoWheeled extends Transport implements Drivable {

    private int maxSpeed;
    private int weightLimit;
    private String brand;
    private String color;
}


