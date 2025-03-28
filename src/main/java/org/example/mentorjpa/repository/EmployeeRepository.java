package org.example.mentorjpa.repository;

import jakarta.transaction.Transactional;
import org.example.mentorjpa.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    List<EmployeeEntity> findAll();

    //PutMapping
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO employees (name, surname, fin, age, brithdate, phone_number, email) " +
            "VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7)", nativeQuery = true)
    void createEmployee(String name, String surname, String fin, int age, String birthdate, int phoneNumber, String email);

    @Query(value = "SELECT * FROM employee WHERE name = :name;", nativeQuery = true)
    List<EmployeeEntity> getEmployeesByName(@Param("name") String name);

    @Query(value = "UPDATE employees SET name = :name WHERE id = :id;", nativeQuery = true)
    void updateNameById(@Param("name") String name, @Param("id") Long id);



}
