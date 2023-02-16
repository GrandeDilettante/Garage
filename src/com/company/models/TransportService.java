package com.company.models;

import com.company.models.aircraft.Aircraft;
import com.company.models.twowheeled.TwoWheeled;
import com.company.models.vehicle.Vehicle;

public class TransportService {

    private Aircraft aircraft;
    private Vehicle vehicle;
    private TwoWheeled twoWheeled;

    public TransportService() {

    }

    public void setTwoWheeled(TwoWheeled twoWheeled) {
        this.twoWheeled = twoWheeled;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }
}
