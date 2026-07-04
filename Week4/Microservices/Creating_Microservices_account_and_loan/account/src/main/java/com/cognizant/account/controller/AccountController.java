package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.model.Account;

@RestController
public class AccountController {

    @GetMapping("/accounts/{number}")
    public Account getAccount(@PathVariable String number) {

        System.out.println("getAccount() method STARTED");

        Account account = new Account(
                number,
                "Savings",
                545300.00);

        System.out.println("getAccount() method COMPLETED");

        return account;
    }
}