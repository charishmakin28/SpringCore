package com.telusko.main;

import com.telusko.config.Password;
import com.telusko.services.Service;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchMainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationConfig.xml");

        Password ps =context.getBean(Password.class);
//        //Password ps = (Password) context.getBean("pass");
        ps.generatePass();
//       //Service sr= (Service) context.getBean("ser");
//        Service sr=  context.getBean("ser",Service.class);
//       sr.create();


    }
}
