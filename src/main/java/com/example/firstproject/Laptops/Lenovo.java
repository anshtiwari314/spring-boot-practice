package com.example.firstproject.Laptops;

public class Lenovo implements Brand{

    Processors processor;

    public Lenovo(Processors processor) {
        this.processor = processor;
    }

    @Override
    public void showDetails() {
        System.out.println("Lenovo with"+ processor.showProcessorDetails());
    }
}
