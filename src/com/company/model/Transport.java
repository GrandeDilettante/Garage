package com.company.model;


public abstract class Transport {

    public Transport(String color) {
        this.color = color;
    }

    private String color;
    private int payment;

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }
}
