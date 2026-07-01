package com.cognizant.spring_learn.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.model.Country;

@RestController
public class CountryController {

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {

        System.out.println("getCountry() method STARTED");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        @SuppressWarnings("unchecked")
        List<Country> countryList =
                (List<Country>) context.getBean("countryList");

        for (Country country : countryList) {

            if (country.getCode().equalsIgnoreCase(code)) {

                System.out.println("getCountry() method COMPLETED");
                return country;

            }
        }

        System.out.println("Country not found");
        return null;
    }
}