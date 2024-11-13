package com.telusko.services;

public class Fedex implements IDeliveryService{
    public Fedex() {
        System.out.println("Fedex Constructor");
    }

    @Override
    public boolean deliverProduct(Double amount) {
        System.out.println("Product is delivered using Fedex and amount is "+amount);
        return true;

    }
}
