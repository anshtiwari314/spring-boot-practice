package com.example.firstproject.Cars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class ShowSpeed {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(ShowSpeed.class, args);
        //System.out.println("hello world");
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example.firstproject.Cars");
        Car car = (Car) context.getBean("hyundai");
        car.showSpeed();
    }
}
