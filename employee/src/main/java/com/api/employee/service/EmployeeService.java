package com.api.employee.service;

import com.api.employee.entity.Employee;
import com.api.employee.entity.Status;
import com.api.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    public Employee getEmployeeById(Long id){
        return employeeRepository.findById(id).orElse(null);
    }
    public List<Employee> getEmployeesByName(String name){
        return employeeRepository.findByNameContainsIgnoreCase(name);
    }
    public List<Employee> getEmployeesBySurname(String surname) {
        return employeeRepository.findBySurnameContainsIgnoreCase(surname);
    }

    public List<Employee> getEmployeesByDataRange(LocalDate date1, LocalDate date2){
        return employeeRepository.findByBirthBetween(date1, date2);
    }
    public List<Employee> getEmployeesAfterData(LocalDate date){
        return employeeRepository.findByBirthAfter(date);
    }
    public List<Employee> getEmployeesBeforeData(LocalDate date){
        return employeeRepository.findByBirthBefore(date);
    }
    public Employee createEmployee(Employee employee){
       return employeeRepository.save(employee);
    }
    public Employee updateEmployee(Long id, Employee employee){
        Employee old = employeeRepository.findById(id).orElse(null);
        if(old!=null){
            employee.setId(old.getId());
           return employeeRepository.save(employee);
        }
        return employeeRepository.save(employee);
    }
    public void deleteEmployee(Long id ){
        employeeRepository.deleteById(id);
    }

    public List<Employee> getEmployeesByNameAndSurname(String name, String surname) {
       return  employeeRepository.findEmployeesByNameAndSurname(name, surname);
    }

    public List<Employee> getEmployeesByStatus(String status) {
        return employeeRepository.findByStatus(Status.valueOf(status));
    }
    public List<Employee> getEmployeeByHr(Long id_hr){
        return employeeRepository.findByHr(id_hr);
    }
}
