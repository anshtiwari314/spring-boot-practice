package com.example.firstproject.DataInjectionViaAnnotations;

import org.springframework.stereotype.Component;

@Component("sciencestudent")
public class ScienceStudent implements Student {

    @Override
    public String getCollegeName() {
        return "college of Applied science";
    }
}
