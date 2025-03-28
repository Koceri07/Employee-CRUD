package org.example.mentorjpa.repository;

import org.example.mentorjpa.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Long> {
    List<EmployeeEntity> findAll();
}
