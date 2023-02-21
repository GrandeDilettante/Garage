package com.company.models;

import com.company.models.aircraft.Aircraft;
import com.company.models.twowheeled.TwoWheeled;
import com.company.models.vehicle.Vehicle;

public class Parking {  // todo где методы добавления на паркинг twoWheeled? и пакет сервис

    public Parking() {

    }

    private Aircraft aircraft;  // todo List
    private Vehicle vehicle;  // todo List
    private TwoWheeled twoWheeled;  // todo List

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
