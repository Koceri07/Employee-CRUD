package org.example.mentorjpa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String fin;
    private String brithdate;
    private int age;
    private int phineNumber;
}
