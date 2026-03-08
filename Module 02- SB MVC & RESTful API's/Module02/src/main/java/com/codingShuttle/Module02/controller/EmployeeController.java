package com.codingShuttle.Module02.controller;

import com.codingShuttle.Module02.DTO.EmployeeDTO;
import com.codingShuttle.Module02.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public String getEmployeeDetails(){
        return "Employee Name: John Doe, Employee ID: 12345, Department: IT";
    }

    @GetMapping("/employee/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable int employeeId) {
        log.info("Employee ID: {}", employeeId);
        return EmployeeDTO.builder()
                .id((long) employeeId)
                .name("John Doe")
                .email("johndoe@gmail.com")
                .age(23)
                .isActive(true)
                .dateOfJoining(LocalDate.of(2025,3,6))
                .build();

    }

    //example for query parameter

    @GetMapping("/employeeDetails")
    public List<EmployeeDTO> getAllEmployees(@RequestParam(required = false) boolean active) {

}
