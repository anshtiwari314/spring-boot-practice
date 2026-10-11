package com.example.firstproject.DataInjectionViaAnnotations;
import com.example.firstproject.Cars.Car;
import org.springframework.stereotype.Component;

@Component("commersestudent")
public class CommerseStudent implements Student {


    @Override
    public String getCollegeName() {
        return "college of arts & commerse";
    }
}
