package com.codingShuttle.Module02.service;

import com.codingShuttle.Module02.DTO.EmployeeDTO;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    EmployeeDTO getEmployeeById(Long id);

    List<EmployeeDTO> getAllEmployeeDetails();

    EmployeeDTO createNewEmployee(EmployeeDTO employeeDTO);

    EmployeeDTO updateEmployeeDetails(Long employeeId, EmployeeDTO employeeDTO);
}
