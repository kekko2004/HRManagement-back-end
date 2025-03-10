package com.api.employee.repository;

import com.api.employee.entity.Employee;
import com.api.employee.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long > {

    List<Employee> findByNameContainsIgnoreCase(String name);
    List<Employee> findBySurnameContainsIgnoreCase(String surname);

    List<Employee> findByBirthBetween(LocalDate birthStart, LocalDate birthEnd);

    List<Employee> findByBirthAfter(LocalDate birth);

    List<Employee> findByBirthBefore(LocalDate birth);

    List<Employee> findByStatus(Status status);

    List<Employee> findEmployeesByNameAndSurname(String name, String surname);

    List<Employee> findByHr(Long id);
}
