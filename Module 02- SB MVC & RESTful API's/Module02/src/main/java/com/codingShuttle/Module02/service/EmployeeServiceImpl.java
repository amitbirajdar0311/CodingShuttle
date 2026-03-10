package com.codingShuttle.Module02.service;

import com.codingShuttle.Module02.DTO.EmployeeDTO;
import com.codingShuttle.Module02.entity.EmployeeEntity;
import com.codingShuttle.Module02.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class  EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public EmployeeDTO getEmployeeById(Long id) {
       EmployeeEntity employeeEntity= employeeRepository.findById(id).orElse(null);
        return modelMapper.map(employeeEntity, EmployeeDTO.class);

    }

    @Override
    public List<EmployeeDTO> getAllEmployeeDetails() {
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
        return employeeEntities.stream()
                .map(employeeEntity ->  modelMapper.map(employeeEntity, EmployeeDTO.class))
                .collect(Collectors.toList());

    }

    @Override
    public EmployeeDTO createNewEmployee(EmployeeDTO employeeDTO) {
        EmployeeEntity employeeEntity = modelMapper.map(employeeDTO, EmployeeEntity.class);
        return modelMapper.map(employeeRepository.save(employeeEntity), EmployeeDTO.class);
    }

    @Override
    public EmployeeDTO updateEmployeeDetails(Long employeeId, EmployeeDTO employeeDTO) {
        EmployeeEntity employeeEntity = employeeRepository.findById(employeeId).orElse(null);
        employeeEntity.setName(employeeDTO.getName());
            employeeEntity.setEmail(employeeDTO.getEmail());
            employeeEntity.setAge(employeeDTO.getAge());
            employeeEntity.setDateOfJoining(employeeDTO.getDateOfJoining());
            employeeEntity.setIsActive(employeeDTO.getIsActive());
            return modelMapper.map(employeeRepository.save(employeeEntity), EmployeeDTO.class);

    }

}
