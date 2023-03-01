package com.company.service;

import com.company.model.Transport;
import com.company.model.aircraft.Aircraft;
import com.company.model.twowheeled.TwoWheeled;
import com.company.model.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingService {

    private List<Aircraft> aircrafts = new ArrayList<>();
    private List<Vehicle> vehicles = new ArrayList<>();
    private List<TwoWheeled> twoWheeleds = new ArrayList<>();
    private List<Transport> transports = new ArrayList<>();

    public void add(Aircraft aircraft) {
        aircrafts.add(aircraft);
        aircraft.setPayment(100);
    }

    public void add(Vehicle vehicle) {
        vehicles.add(vehicle);
        vehicle.setPayment(100);
    }

    public void add(TwoWheeled twoWheeled) {
        twoWheeleds.add(twoWheeled);
        twoWheeled.setPayment(100);
    }

    public void add(Transport transport) {
        transports.add(transport);
        transport.setPayment(100);
    }
}
