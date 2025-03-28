package org.example.mentorjpa.controller;

import lombok.RequiredArgsConstructor;
import org.example.mentorjpa.dto.EmployeeDto;
import org.example.mentorjpa.service.EmployeeServise;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/employees")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeServise employeeServise;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createEmployee(@RequestBody EmployeeDto employeeDto){
        employeeServise.createEmployee(employeeDto);
    }

    @GetMapping("/{id}")
    public EmployeeDto getEmployeeById(@PathVariable Long id){
        return employeeServise.getEmployeeById(id);
    }

    @GetMapping
    public List<EmployeeDto> getAllEmployees(){
        return employeeServise.getAllEmployees();
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployee(Long id){
        employeeServise.deleteEmployeeById(id);
    }

    @GetMapping("/{name}")
    public List<EmployeeDto> getEmployeesByName(@PathVariable String name){
        return employeeServise.getEmployeesByName(name);
    }
}
