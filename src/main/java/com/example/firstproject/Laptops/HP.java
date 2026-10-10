package com.example.firstproject.Laptops;

public class HP implements Brand{

    Processors processor;
    public HP(Processors processor) {
        this.processor = processor;
    }
    @Override
    public void showDetails() {
        System.out.println("HP with"+ processor.showProcessorDetails());
    }
}
