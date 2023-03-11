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

import java.time.LocalDateTime;

public class GarageTest {

    public static void main(String[] args) throws InterruptedException {

        TransportService transportService = new TransportService();

        Aircraft airplane = new Airplane("black", "S-01", 180, 4500, "Australia", "2 wings");
        Aircraft helicopter = new Helicopter("white", "S-02", 4, 600, "Singapore", "2 helix");
        airplane.drive();
        System.out.println("Самолёт в движении");
        airplane.breakDown();
        System.out.println("Самолёт ломается");
        transportService.add(airplane);
        System.out.println("Самолет отправлен на ремонт");
        ParkingService.getInstance().add(helicopter);
        System.out.println("Вертолёт находится на стоянке");

        Vehicle electricCar = new ElectricCar("red", "S-03", 600, 3.5, "electricEngine");
        Vehicle hybridCar = new HybridCar("blue", "S-04", 400, 2.5, "hybridEngine");
        ParkingService.getInstance().add(electricCar);
        System.out.println("Электрокар находится на стоянке");
        ParkingService.getInstance().add(hybridCar);
        System.out.println("Гибрид находится на стоянке");

        TwoWheeled moped = new Moped("orange", 70, 120, "Specialized", "Shimano");
        TwoWheeled bike = new Bike("pink", 30, 90, "Honda", "2 pedals");
        ParkingService.getInstance().add(moped);
        System.out.println("Мопед находится на стоянке");
        ParkingService.getInstance().add(bike);
        System.out.println("Велосипед находится на стоянке");

        Thread myThread = new Worker();
        myThread.start();

        String a = "Roma";
        String b = new String("Roma");
        String с = "Matvey";

        StringComparator stringComparator = new StringComparator();

        System.out.println(stringComparator.stringCompare(a, b));
        System.out.println(stringComparator.stringCompare(b, с));
    }
}