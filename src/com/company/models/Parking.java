package com.company.models;

import com.company.models.aircraft.Aircraft;
import com.company.models.twowheeled.TwoWheeled;
import com.company.models.vehicle.Vehicle;

public class Parking {

    public Parking() {

    }

    private Aircraft aircraft;
    private Vehicle vehicle;
    private TwoWheeled twoWheeled;

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
