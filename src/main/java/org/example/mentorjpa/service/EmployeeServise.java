package org.example.mentorjpa.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.mentorjpa.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmployeeServise {
    private final EmployeeRepository employeeRepository;

}
