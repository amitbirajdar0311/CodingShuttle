package com.codingShuttle.Module02.DTO;

import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDTO {
    private Long id;
    private String name;
    private String email;
    private int age;
    private LocalDate dateOfJoining;
    private Boolean isActive;
}
