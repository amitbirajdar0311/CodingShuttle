package com.codingShuttle.Module02.repository;


import com.codingShuttle.Module02.DTO.EmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository implements JpaRepository<EmployeeDTO>{

}
