package com.example.firstproject.Laptops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

//@SpringBootApplication
public class LaptopDealer {
    public static void main(String[] args) {
        SpringApplication.run(LaptopDealer.class, args);
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

        System.out.print("Please Select Brand:\n1. Dell\n2. HP\n3. Lenovo\n");
        Scanner sc = new Scanner(System.in);
        int brandSelection = sc.nextInt();

        System.out.print("Please Select Processor:\n1. i3\n2. i5\n3. i7\n");
        int processorSelection = sc.nextInt();

        switch(brandSelection){
            case 1:{

                switch(processorSelection){
                    case 1:{
                       Brand delli3 = (Brand) context.getBean("dellwithi3");
                       delli3.showDetails();
                       break;
                    }
                    case 2:{
                        Brand delli5 = (Brand) context.getBean("dellwithi5");
                        delli5.showDetails();
                        break;
                    }
                    case 3:{
                        Brand delli7 = (Brand) context.getBean("dellwithi7");
                        delli7.showDetails();
                        break;
                    }
                }
                break;
            }
            case 2:{
                switch(processorSelection){
                    case 1:{
                        Brand hpi3 = (Brand) context.getBean("hpwithi3");
                        hpi3.showDetails();
                        break;
                    }
                    case 2:{
                        Brand hpi5 = (Brand) context.getBean("hpwithi5");
                        hpi5.showDetails();
                        break;
                    }
                    case 3:{
                        Brand hpi7 = (Brand) context.getBean("hpwithi7");
                        hpi7.showDetails();
                        break;
                    }
                }
                break;
            }
            case 3:{
                switch(processorSelection){
                    case 1:{
                        Brand lenovoi3 = (Brand) context.getBean("lenovowithi3");
                        lenovoi3.showDetails();
                        break;
                    }
                    case 2:{
                        Brand lenovoi5 = (Brand) context.getBean("lenovowithi5");
                        lenovoi5.showDetails();
                        break;
                    }
                    case 3:{
                        Brand lenovoi7 = (Brand) context.getBean("lenovowithi7");
                        lenovoi7.showDetails();
                        break;
                    }
                }
                break;
            }
        }
    }
}
