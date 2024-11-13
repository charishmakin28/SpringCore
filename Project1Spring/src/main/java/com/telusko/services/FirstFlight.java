package com.telusko.services;

public class FirstFlight implements IDeliveryService{
    public FirstFlight() {
        System.out.println("FirstFlight Constructor");
    }

    @Override
    public boolean deliverProduct(Double amount) {
        System.out.println("Product is delivered using FirstFlight and amount is "+amount);
        return true;
    }
}
