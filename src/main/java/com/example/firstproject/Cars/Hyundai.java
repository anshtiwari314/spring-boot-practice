package com.example.firstproject.Cars;

import org.springframework.stereotype.Component;

@Component("hyundai")
public class Hyundai implements Car {
    @Override
    public void showSpeed() {
        System.out.println("speed is 100km/h");
    }
}
