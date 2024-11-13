package com.telusko.services;

import com.telusko.services.IDeliveryService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
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
