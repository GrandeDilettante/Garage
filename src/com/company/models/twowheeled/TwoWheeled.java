package com.company.models.twowheeled;

import com.company.interfaces.Breakable;
import com.company.interfaces.Drivable;


public abstract class TwoWheeled implements Breakable, Drivable {

    public TwoWheeled() {

    }

    private int maxSpeed;
    private int weightLimit;
    private String brand;
    private String color;
}


