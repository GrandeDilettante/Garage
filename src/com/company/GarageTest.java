package com.company;

import com.company.service.ParkingService;
import com.company.service.TransportService;
import com.company.model.aircraft.Aircraft;
import com.company.model.aircraft.Airplane;
import com.company.model.aircraft.Helicopter;
import com.company.model.twowheeled.Bike;
import com.company.model.twowheeled.Moped;
import com.company.model.twowheeled.TwoWheeled;
import com.company.model.vehicle.ElectricCar;
import com.company.model.vehicle.HybridCar;
import com.company.model.vehicle.Vehicle;

public class GarageTest {

    public static void main(String[] args) {

        TransportService transportService = new TransportService();
        ParkingService parkingService = new ParkingService();

        Aircraft airplane = new Airplane("S-01", 180, 4500, "Australia", "2 wings");
        Aircraft helicopter = new Helicopter("S-02", 4, 600, "Singapore", "2 helix");
        airplane.drive();
        System.out.println("Самолёт в движении");
        airplane.breakDown();
        System.out.println("Самолёт ломается");
        transportService.add(airplane);
        System.out.println("Самолет отправлен на ремонт");
        parkingService.add(helicopter);
        System.out.println("Вертолёт находится на стоянке");

        Vehicle electricCar = new ElectricCar("S-03", 600, 3.5, "green", "electricEngine");
        Vehicle hybridCar = new HybridCar("S-04", 400, 2.5, "green", "hybridEngine");
        parkingService.add(electricCar);
        System.out.println("Электрокар находится на стоянке");
        parkingService.add(hybridCar);
        System.out.println("Гибрид находится на стоянке");

        TwoWheeled moped = new Moped();
        TwoWheeled bike = new Bike();
        parkingService.add(moped);
        System.out.println("Мопед находится на стоянке");
        parkingService.add(bike);
        System.out.println("Велосипед находится на стоянке");
    }
}
