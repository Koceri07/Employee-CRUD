package org.example.mentorjpa.mapper;

import org.example.mentorjpa.dto.EmployeeDto;
import org.example.mentorjpa.entity.EmployeeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    @Mapping(target = "id", ignore = true)
    EmployeeEntity toEntity(EmployeeDto employeeDto);

    @Mapping(target = "id", ignore = true)
    EmployeeDto toDto(EmployeeEntity employeeEntity);

}
