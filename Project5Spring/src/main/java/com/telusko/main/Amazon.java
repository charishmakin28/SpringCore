package com.telusko.main;

import com.telusko.services.IDeliveryService;

public class Amazon {
    private IDeliveryService service;


    public void setService(IDeliveryService service) {

        this.service = service;
        System.out.println("Setter injection");
    }

    public Amazon() {
        super();
        System.out.println("Amazon constructor is invoked");
    }


    public Amazon(IDeliveryService service) {
        super();
        this.service = service;
        System.out.println("Constructor injection");
    }


    public boolean deliverTheProduct(Double amount){
        return service.deliverProduct(amount);

    }
}
