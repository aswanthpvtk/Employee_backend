package com.nest.employee_backend.controller;

import com.nest.employee_backend.model.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
public class employeecontroller {

    @PostMapping("/")
    public String Homepage()
    {
        return "Employee welcome page";
    }



    @PostMapping(path = "/adde",consumes = "application/json",produces = "application/json")
    public String Empadd(@RequestBody Employee s)
    {
        System.out.println(s.getCname().toString());
        return "Employee added successfully";
    }

}
