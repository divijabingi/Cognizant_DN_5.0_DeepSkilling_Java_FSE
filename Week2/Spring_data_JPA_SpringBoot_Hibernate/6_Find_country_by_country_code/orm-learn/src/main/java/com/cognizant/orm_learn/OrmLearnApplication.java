package com.cognizant.orm_learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.springframework.boot.Banner;


@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;
    @Override
    public void run(String... args) {

        Country country = countryService.getCountry("IN");

        System.out.println("Country Details");
        System.out.println(country.getCode() + " - " + country.getName());

    }

    public static void main(String[] args) {
    
        SpringApplication app = new SpringApplication(OrmLearnApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    
    
}