package com.telusko.main;

import com.telusko.services.IDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Amazon {

    @Autowired
    @Qualifier("fedEx")
    private IDeliveryService service;

    //setter injection
    @Autowired
    @Qualifier("fedEx")
    public void setService(IDeliveryService service) {
        this.service = service;
    }

    public Amazon() {
        super();
        System.out.println("Amazon constructor is invoked");
    }

    @Autowired
    //constructor injection
    //public Amazon(@Qualifier("fedEx") IDeliveryService)
    public Amazon(IDeliveryService service) {
        super();
        this.service = service;
    }


    public boolean deliverTheProduct(Double amount){
        return service.deliverProduct(amount);

    }
}
