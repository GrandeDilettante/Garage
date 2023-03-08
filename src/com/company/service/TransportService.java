package com.company.service;

import com.company.model.Transport;
import com.company.model.aircraft.Aircraft;
import com.company.model.twowheeled.TwoWheeled;
import com.company.model.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class TransportService {

    ParkingService parkingService = ParkingService.getInstance();

    private List<Aircraft> aircrafts = new ArrayList<>();
    private List<Vehicle> vehicles = new ArrayList<>();
    private List<TwoWheeled> twoWheeleds = new ArrayList<>();
    private List<Transport> transports = new ArrayList<>();

    public void add(Aircraft aircraft) throws InterruptedException {
        aircrafts.add(aircraft);
        Thread.sleep(180000);
        aircrafts.remove(aircraft);
        parkingService.add(aircraft);
    }

    public void add(Vehicle vehicle) throws InterruptedException {
        vehicles.add(vehicle);
        Thread.sleep(180000);
        vehicles.remove(vehicle);
        parkingService.add(vehicle);
    }

    public void add(TwoWheeled twoWheeled) throws InterruptedException {
        twoWheeleds.add(twoWheeled);
        Thread.sleep(180000);
        twoWheeleds.remove(twoWheeled);
        parkingService.add(twoWheeled);
    }

    public void add(Transport transport) throws InterruptedException {
        transports.add(transport);
        Thread.sleep(180000);
        transports.remove(transport);
        parkingService.add(transport);
    }
}
