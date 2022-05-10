package com.apiprime.example.service.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @GetMapping("/test")
    public String test(HttpServletRequest request) {
        System.out.println("Request - " + request.getRequestURL().toString());
        return request.getRequestURL().toString();
    }

}
