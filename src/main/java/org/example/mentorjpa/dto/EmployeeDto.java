package org.example.mentorjpa.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private Long id;
    @Length(min = 3, max = 26)
    private String name;
    @Length(min = 3, max = 26)
    private String surname;
    private String email;
    @NotNull
    private String fin;
    private String brithdate;
    private int age;
    private int phoneNumber;
}
