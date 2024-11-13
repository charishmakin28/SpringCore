package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("ApplicationConfig.xml");
        Amazon amz =container.getBean(Amazon.class);
        boolean status = amz.deliverTheProduct(670.09);
        if(status){
            System.out.println("Delivered");
        }else{
            System.out.println("Failed");
        }

    }
}
