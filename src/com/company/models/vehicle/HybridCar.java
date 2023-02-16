package com.company.models.vehicle;

import com.company.interfaces.Breakable;
import com.company.interfaces.Drivable;

public class HybridCar extends Vehicle implements Breakable, Drivable {

    private String hybridEngine;

    public HybridCar(String vin, int horsePower, double engineVolume, String color,String hybridEngine) {
        super(vin, horsePower, engineVolume, color);
        this.hybridEngine = hybridEngine;
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
