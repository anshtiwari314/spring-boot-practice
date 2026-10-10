package com.example.firstproject.Cars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class ShowSpeed {
    public static void main(String[] args) {

        SpringApplication.run(ShowSpeed.class, args);
        //System.out.println("hello world");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Car car = (Car) context.getBean("hyundai");
        car.showSpeed();
    }
}
