package com.company.OOP;


import com.company.OOP.model.Transport;
import com.company.OOP.service.ParkingService;

public class Worker extends Thread {

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(60 * 60 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (Transport transport : ParkingService.getInstance().getTransports())
                transport.setPayment(transport.getPayment() + 100);
        }
    }
}

