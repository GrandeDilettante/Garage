package com.company;

import com.company.models.Parking;
import com.company.models.TransportService;
import com.company.models.aircraft.Aircraft;
import com.company.models.aircraft.Airplane;
import com.company.models.aircraft.Helicopter;
import com.company.models.twowheeled.Bike;
import com.company.models.twowheeled.Moped;
import com.company.models.twowheeled.TwoWheeled;
import com.company.models.vehicle.ElectricCar;
import com.company.models.vehicle.HybridCar;
import com.company.models.vehicle.Vehicle;

public class GarageTest {

    public static void main(String[] args) {

        TransportService transportService = new TransportService();
        Parking parking = new Parking();

        Aircraft airplane = new Airplane("S-01", 180, 4500, "Australia", "2 wings");
        Aircraft helicopter = new Helicopter("S-02", 4, 600, "Singapore", "2 helix");
        airplane.drive();
        System.out.println("Самолёт в движении");
        airplane.breakDown();
        System.out.println("Самолёт ломается");
        transportService.setAircraft(airplane);
        System.out.println("Самолет отправлен на ремонт");
        parking.setAircraft(helicopter);
        System.out.println("Вертолёт находится на стоянке");

        Vehicle electricCar = new ElectricCar("S-03", 600, 3.5, "green", "electricEngine");
        Vehicle hybridCar = new HybridCar("S-04", 400, 2.5, "green", "hybridEngine");
        parking.setVehicle(electricCar);
        System.out.println("Электрокар находится на стоянке");
        parking.setVehicle(hybridCar);
        System.out.println("Гибрид находится на стоянке");

        TwoWheeled moped = new Moped();
        TwoWheeled bike = new Bike();
        transportService.setTwoWheeled(moped);
        System.out.println("Мопед отправлен на ремонт");
        transportService.setTwoWheeled(bike);
        System.out.println("Велосипед отправлен на ремонт");
    }
}
