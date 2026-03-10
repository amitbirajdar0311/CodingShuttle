package com.codingShuttle.Module02.controller;

import com.codingShuttle.Module02.DTO.EmployeeDTO;
import com.codingShuttle.Module02.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class EmployeeController {

    private final  EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/employee")
    public String getEmployeeDetails() {
        return "Employee Name: John Doe, Employee ID: 12345, Department: IT";
    }

    @GetMapping("/employee/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable Long employeeId) {
        log.info("Employee ID: {}", employeeId);
        return employeeService.getEmployeeById(employeeId);
    }

    @GetMapping("/employeeDetails")
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployeeDetails();
    }

    @PostMapping("/employee/create-new")
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.createNewEmployee(employeeDTO);
    }

    @PutMapping("/employee/update/{employeeId}")
    public EmployeeDTO updateEmployeeDetails(@PathVariable Long employeeId, @RequestBody EmployeeDTO employeeDTO){
        return employeeService.updateEmployeeDetails(employeeId, employeeDTO);
    }
}
