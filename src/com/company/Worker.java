package com.company;


import com.company.model.Transport;
import com.company.model.aircraft.Aircraft;
import com.company.service.ParkingService;

public class Worker extends Thread {

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(60 * 60 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ParkingService parkingService = new ParkingService();
            for (Transport transport : parkingService.getTransports())
                transport.setPayment(transport.getPayment() + 100);
        }
    }
}

