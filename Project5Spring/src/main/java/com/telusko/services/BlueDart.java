package com.telusko.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class BlueDart implements IDeliveryService {
    public BlueDart() {
        System.out.println("Bluedart constructor");
    }

    @Override
    public boolean deliverProduct(Double amount) {
        System.out.println("Product is delivered using Bluedart and amount is "+amount);
        return true;
    }
}
