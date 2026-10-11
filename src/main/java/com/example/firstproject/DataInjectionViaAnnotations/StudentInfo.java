package com.example.firstproject.DataInjectionViaAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component("studentinfo")
public class StudentInfo {

    @Autowired
    @Qualifier("sciencestudent")
    Student student;

    public void getCollegeName(){
        System.out.println(student.getCollegeName());
    }
}
