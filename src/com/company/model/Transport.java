package com.company.model;


public abstract class Transport {

    public Transport(String color, int payment) {
        this.color = color;
        this.payment = payment;
    }

    private String color;
    private int payment;

    public void setPayment(int payment) {
        this.payment = payment;
    }
}
