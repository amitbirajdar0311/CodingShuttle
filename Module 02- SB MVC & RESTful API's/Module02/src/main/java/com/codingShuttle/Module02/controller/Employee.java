package com.codingShuttle.Module02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee {

    @GetMapping("/employee")
    public String getEmployeeDetails(){
        return "Employee Name: John Doe, Employee ID: 12345, Department: IT";
    }

}
