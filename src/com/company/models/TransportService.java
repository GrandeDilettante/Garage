package com.company.models;

import com.company.models.aircraft.Aircraft;
import com.company.models.twowheeled.TwoWheeled;
import com.company.models.vehicle.Vehicle;

public class TransportService { // todo где метод, чтобы поставить на ремонт vehicle? и пакет сервис

    private Aircraft aircraft; // todo List
    private Vehicle vehicle; // todo List
    private TwoWheeled twoWheeled; // todo List

    public TransportService() {

    }

    public void setTwoWheeled(TwoWheeled twoWheeled) {
        this.twoWheeled = twoWheeled;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }
}
