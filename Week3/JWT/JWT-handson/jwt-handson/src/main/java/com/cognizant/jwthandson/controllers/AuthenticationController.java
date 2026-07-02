package com.cognizant.jwthandson.controllers;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.jwthandson.model.AuthenticationResponse;
import com.cognizant.jwthandson.util.JwtUtil;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestHeader("Authorization") String authHeader) {

        System.out.println("authenticate() method STARTED");

        String username = getUser(authHeader);

        String token = jwtUtil.generateToken(username);

        System.out.println("authenticate() method COMPLETED");

        return new AuthenticationResponse(token);
    }

    private String getUser(String authHeader) {

        String encodedCredentials = authHeader.substring(6);

        byte[] decodedBytes =
                Base64.getDecoder().decode(encodedCredentials);

        String credentials =
                new String(decodedBytes, StandardCharsets.UTF_8);

        return credentials.split(":")[0];
    }
}