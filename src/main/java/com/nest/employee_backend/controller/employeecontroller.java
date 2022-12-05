package com.nest.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeecontroller {

    @GetMapping("/")
    public String Homepage()
    {
        return "Employee welcome page";
    }

    @GetMapping("/add")
    public String Add()
    {
        return "Employee add page";
    }

    @GetMapping("/search")
    public String Search()
    {
        return "Employee search page";
    }
}
