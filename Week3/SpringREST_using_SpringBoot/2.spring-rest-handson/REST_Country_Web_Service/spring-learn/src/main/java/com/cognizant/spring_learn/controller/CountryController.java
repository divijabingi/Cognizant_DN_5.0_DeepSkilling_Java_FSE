package com.cognizant.spring_learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.model.Country;

@RestController
public class CountryController {

    @GetMapping("/country")
    public Country getCountry() {

        System.out.println("getCountry() method STARTED");

        Country country = new Country();
        country.setCode("IN");
        country.setName("India");

        System.out.println("getCountry() method COMPLETED");

        return country;
    }
}