package com.example.firstproject.Laptops;

public class Dell implements Brand{

    Processors processor;

//    public Dell(Processors processor) {
//        this.processor = processor;
//    }
    @Override
    public void showDetails() {
        System.out.println("Dell with"+ processor.showProcessorDetails());
    }

    public void setProcessors(Processors processor) {
        this.processor = processor;
    }
}
