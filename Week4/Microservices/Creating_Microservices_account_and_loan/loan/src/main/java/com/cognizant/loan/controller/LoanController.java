package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan.model.Loan;

@RestController
public class LoanController {

    @GetMapping("/loans/{loan_number}")
    public Loan getLoan(@PathVariable("loan_number") String number) {

        System.out.println("getLoan() method STARTED");

        Loan loan = new Loan(
                number,
                "Car",
                400000.00,
                3258,
                18);

        System.out.println("getLoan() method COMPLETED");

        return loan;
    }
}