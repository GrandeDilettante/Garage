package com.company.service;

import com.company.model.Transport;
import com.company.model.aircraft.Aircraft;
import com.company.model.twowheeled.TwoWheeled;
import com.company.model.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingService {

    ParkingService parkingService = new ParkingService();

    private int payment;

    private List<Aircraft> aircrafts = new ArrayList<>();
    private List<Vehicle> vehicles = new ArrayList<>();
    private List<TwoWheeled> twoWheeleds = new ArrayList<>();
    private List<Transport> transports = new ArrayList<>();

    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public void add(Aircraft aircraft) throws InterruptedException {     // как делать увеличение каждый час понятно
        aircrafts.add(aircraft);                                         // когда я использу contains, он проверяет наличие только что добавленного мною обьекта ?
        while (parkingService.getAircrafts().contains(aircraft)) {       // или он в целом проверит есть ли хоть какой-нибудь обьект такого типа
            Thread.sleep(60000);                                    // может сделать так, что если транспорт попадает на сервис, он будет удаляться с парковки
            payment = payment + 100;                                     // а то  так из цикла не выйду
        }
    }

    public void add(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void add(TwoWheeled twoWheeled) {
        twoWheeleds.add(twoWheeled);
    }

    public void add(Transport transport) {
        transports.add(transport);
    }
}
