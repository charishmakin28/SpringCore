package com.telusko.services;

import org.springframework.stereotype.Component;


public class FirstFlight implements IDeliveryService {
    public FirstFlight() {
        System.out.println("FirstFlight Constructor");
    }

    @Override
    public boolean deliverProduct(Double amount) {
        System.out.println("Product is delivered using FirstFlight and amount is "+amount);
        return true;
    }
}
