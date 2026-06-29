package com.cognizant.orm_learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    @Override
    public void run(String... args) {

        Country country = new Country("TS", "Test Country");

        countryService.addCountry(country);

        System.out.println("Country added successfully.");

    }

    public static void main(String[] args) {

        SpringApplication.run(OrmLearnApplication.class, args);

    }

}