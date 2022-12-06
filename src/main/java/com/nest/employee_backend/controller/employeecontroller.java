package com.nest.employee_backend.controller;

import com.nest.employee_backend.dao.EmployeeDao;
import com.nest.employee_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class employeecontroller {
    @Autowired
    private EmployeeDao dao;

    @PostMapping("/")
    public String Homepage()
    {
        return "Employee welcome page";
    }



    @PostMapping(path = "/adde",consumes = "application/json",produces = "application/json")
    public String Empadd(@RequestBody Employee s)
    {
        System.out.println(s.getName().toString());
        System.out.println(s.getDesignation().toString());
        System.out.println(s.getCname().toString());
        System.out.println(s.getSalary());
        System.out.println(s.getMob().toString());
        System.out.println(s.getUname().toString());
        System.out.println(s.getPsw().toString());
        dao.save(s);
        return "Employee added successfully";
    }

    @GetMapping("/v")
    public List<Employee> View()
    {
        return (List<Employee>) dao.findAll();
    }

}
