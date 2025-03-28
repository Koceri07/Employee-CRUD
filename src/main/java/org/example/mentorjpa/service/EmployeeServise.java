package org.example.mentorjpa.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.mentorjpa.dto.EmployeeDto;
import org.example.mentorjpa.entity.EmployeeEntity;
import org.example.mentorjpa.exception.NotFoundException;
import org.example.mentorjpa.mapper.EmployeeMapper;
import org.example.mentorjpa.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmployeeServise {
    private final EmployeeRepository employeeRepository;

    public void createEmployee(EmployeeDto employeeDto){
        log.info("ActionLog.createEmployee.start for name {}", employeeDto.getName());
        EmployeeEntity employeeEntity = EmployeeMapper.toEntity(employeeDto);
        employeeRepository.save(employeeEntity);
        log.info("Action.createEmployee.end for name {}", employeeDto.getName());
    }

    public EmployeeDto getEmployeeById(Long id){
        log.info("Action.getEmployeeById.start for id {}", id);
        var employeeEntity = employeeRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Employee Not Found"));

        log.info("Action.getEmployeeById.end for id {}", id);
        return EmployeeMapper.toDto(employeeEntity);
    }

    public List<EmployeeDto> getAllEmployees(){
        return employeeRepository.findAll()
                .stream()
                .map(EmployeeMapper::toDto)
                .toList();
    }

    public void updateEmployeeNameById(String name, Long id){
        log.info("Action.updateEmployeeNameById.start for id {}", id);
        employeeRepository.updateNameById(name, id);
        log.info("Action.updateEmployeeNameById.end for id {}", id);
    }

    public void deleteEmployeeById(Long id){employeeRepository.deleteById(id);}

    public List<EmployeeDto> getEmployeesByName(String name){
        log.info("Action.getEmployeesByName.start for name {}", name);
        List<EmployeeEntity> employeesEntityByName = employeeRepository.getEmployeesByName(name);
        log.info("Action.getEmployeesByName.end for name {}", name);
        return employeesEntityByName
                .stream()
                .map(EmployeeMapper::toDto)
                .toList();
    }
}
