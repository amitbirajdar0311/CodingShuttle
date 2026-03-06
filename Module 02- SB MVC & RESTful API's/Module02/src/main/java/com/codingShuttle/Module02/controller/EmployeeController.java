package com.codingShuttle.Module02.controller;

import com.codingShuttle.Module02.DTO.EmployeeDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@Slf4j
public class EmployeeController {

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
        return List.of(
                EmployeeDTO.builder()
                        .id(1L)
                        .name("John Doe")
                        .email("johnDoe@gmail.com")
                        .age(23)
                        .isActive(true)
                        .dateOfJoining(LocalDate.of(2025,3,6))
                        .build(),
                EmployeeDTO.builder()
                        .id(2L)
                        .name("Sarah smith")
                        .email("sarahsmith@gmail.com")
                        .age(30)
                        .isActive(true)
                        .dateOfJoining(LocalDate.of(2024,5,10))
                        .build(),
                EmployeeDTO.builder()
                        .id(3L)
                        .name("Michael Johnson")
                        .email("micheljhnson@gmail.com")
                        .age(28)
                        .isActive(false)
                        .dateOfJoining(LocalDate.of(2023,8,15))
                        .build()
        );
    }
}
