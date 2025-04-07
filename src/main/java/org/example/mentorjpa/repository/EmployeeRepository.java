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

    @Query(value = "SELECT * FROM employees WHERE name = :name;", nativeQuery = true)
    List<EmployeeEntity> getEmployeesByName(@Param("name") String name);

    @Query(value = "UPDATE employees SET name = :name WHERE id = :id;", nativeQuery = true)
    void updateNameById(@Param("name") String name, @Param("id") Long id);

    @Query(value = "SELECT * FROM employees WHERE fin = :fin;", nativeQuery = true)
    EmployeeEntity getEmployeeByFin(@Param("fin") int fin);


}
