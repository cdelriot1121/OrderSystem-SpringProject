package com.example.OrderSystem.controller;


import com.example.OrderSystem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;




}
