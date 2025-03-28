package org.example.mentorjpa.mapper;

import org.example.mentorjpa.dto.EmployeeDto;
import org.example.mentorjpa.entity.EmployeeEntity;

public class EmployeeMapper {
    public static EmployeeDto toDto(EmployeeEntity employeeEntity){
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employeeEntity.getId());
        employeeDto.setName(employeeEntity.getName());
        employeeDto.setSurname(employeeEntity.getSurname());
        employeeDto.setAge(employeeEntity.getAge());
        return employeeDto;
    }

    public static EmployeeEntity toEntity(EmployeeDto employeeDto){
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setId(employeeDto.getId());
        employeeEntity.setName(employeeDto.getName());
        employeeEntity.setSurname(employeeDto.getSurname());
        employeeEntity.setAge(employeeDto.getAge());
        return employeeEntity;
    }
}
