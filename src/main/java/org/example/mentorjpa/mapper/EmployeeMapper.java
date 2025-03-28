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
        employeeDto.setFin(employeeEntity.getFin());
        employeeDto.setBrithdate(employeeEntity.getBrithdate());
        employeeDto.setEmail(employeeEntity.getEmail());
        employeeDto.setPhineNumber(employeeEntity.getPhoneNumber());
        return employeeDto;
    }

    public static EmployeeEntity toEntity(EmployeeDto employeeDto){
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setId(employeeDto.getId());
        employeeEntity.setName(employeeDto.getName());
        employeeEntity.setSurname(employeeDto.getSurname());
        employeeEntity.setAge(employeeDto.getAge());
        employeeEntity.setEmail(employeeDto.getEmail());
        employeeEntity.setFin(employeeDto.getFin());
        employeeEntity.setBrithdate(employeeDto.getBrithdate());
        employeeEntity.setPhoneNumber(employeeDto.getPhineNumber());
        return employeeEntity;
    }
}
