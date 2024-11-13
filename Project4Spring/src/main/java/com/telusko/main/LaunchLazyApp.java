package com.telusko.main;

import com.telusko.beans.Employee;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class LaunchLazyApp {
    public static void main(String[] args) {
//        Resource res = new ClassPathResource("ApplicationConfig.xml");
//        BeanFactory container2 = new XmlBeanFactory(res);
//        Employee emp1 = container2.getBean("emp3",Employee.class);
//        System.out.println(emp1);
//        emp1.taskEmployee();

        DefaultListableBeanFactory container = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader read = new XmlBeanDefinitionReader(container);
        read.loadBeanDefinitions("ApplicationConfig.xml");
        read.loadBeanDefinitions("ApplicationConfig2.xml");
        Employee emp1 = container.getBean("emp1",Employee.class);
        System.out.println(emp1);
        System.out.println("*****************************************");
        Employee emp2 = container.getBean("emp2",Employee.class);
        System.out.println(emp2);
    }
}
