package com.telusko.main;

import com.telusko.services.IDeliveryService;

public class Amazon {
    private IDeliveryService service;

    //setter injection
    public void setService(IDeliveryService service) {
        this.service = service;
    }

    public Amazon() {
        super();
        System.out.println("Amazon constructor is invoked");
    }

    //constructor injection
    public Amazon(IDeliveryService service) {
        super();
        this.service = service;
    }


    public boolean deliverTheProduct(Double amount){
        return service.deliverProduct(amount);

    }
}
