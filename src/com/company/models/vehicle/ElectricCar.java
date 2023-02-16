package com.company.models.vehicle;

import com.company.interfaces.Breakable;
import com.company.interfaces.Drivable;


public class ElectricCar extends Vehicle implements Breakable, Drivable {

    private String electricEngine;

    public ElectricCar(String vin, int horsePower, double engineVolume, String color, String electricEngine) {
        super(vin, horsePower, engineVolume, color);
        this.electricEngine = electricEngine;
    }

    @Override
    public void breakDown() {
        System.out.println("Машина с гибридным двигателем сломалась");
    }

    @Override
    public void drive() {
        System.out.println("Машина с гибридным двигателем едет");
    }
}
