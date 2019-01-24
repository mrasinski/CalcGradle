package com.kodilla.firstcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstcalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstcalculatorApplication.class, args);

        Calculator calc = new Calculator();

        System.out.println(calc.add(23.3, 45.3));
        System.out.println(calc.minus(67.0, 23.6));
    }

}

