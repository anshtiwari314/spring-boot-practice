package com.example.firstproject.DataInjectionViaAnnotations;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class MainClass {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
    new AnnotationConfigApplicationContext("com.example.firstproject.DataInjectionViaAnnotations");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Stream:\n1. Science \n2. Commerse");

        int choice = scanner.nextInt();
        String beanId = "";

        switch(choice) {
            case 1:{
                beanId = "sciencestudent";
                break;
            }
            case 2: {
                beanId = "commersestudent";
                break;
            }
        }

        Student student = (Student) context.getBean(beanId);
        //get bean via class , u can also via id
        StudentInfo studentInfo = (StudentInfo) context.getBean(StudentInfo.class);
        studentInfo.student = student;
        studentInfo.getCollegeName();

    }
}
