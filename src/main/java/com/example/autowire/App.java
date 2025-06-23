package com.example.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

       // Bean creation using xml file
        ApplicationContext context = new ClassPathXmlApplicationContext("componentScan.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee.toString());

       //Components Scanning using Annotation class
       ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
       Employee employee1 = context1.getBean("employee", Employee.class);
       System.out.println(employee1.toString());

       Manager manager = context1.getBean("manager", Manager.class);
        System.out.println(manager.toString());


    }
}
