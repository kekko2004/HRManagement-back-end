package com.api.employee.controller;

import com.api.employee.entity.Employee;
import com.api.employee.entity.Status;
import com.api.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RequestMapping("/api/v1/employee")
@RestController
public class EmployeeController {
    @Autowired
    private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getEmployees(){
            return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
        if(employeeService.getEmployeeById(id) == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(employeeService.getEmployeeById(id),HttpStatus.OK);
    }
    @GetMapping("/name={name}")
    public ResponseEntity<List<Employee>> getEmployeeById(@PathVariable String name){
        if(employeeService.getEmployeesByName(name) == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(employeeService.getEmployeesByName(name),HttpStatus.OK);
    }
    @GetMapping("/surname={surname}")
    public ResponseEntity<List<Employee>> getEmployeeBySurname(@PathVariable String surname){
        if(employeeService.getEmployeesBySurname(surname) == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(employeeService.getEmployeesBySurname(surname),HttpStatus.OK);
    }
    @GetMapping("/status/{status}")
    public ResponseEntity<List<Employee>> getEmployeeByStatus(@PathVariable Status status){

        if(employeeService.getEmployeesByStatus(String.valueOf(status.name().toUpperCase()) ) == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(employeeService.getEmployeesByStatus( String.valueOf(status.name().toUpperCase()) ),HttpStatus.OK);
    }
    @GetMapping("/humanResource/{id_hr}")
    public ResponseEntity<List<Employee>> getEmployeeByHR(@PathVariable Long id_hr){
        if(employeeService.getEmployeeByHr(id_hr) == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(employeeService.getEmployeeByHr(id_hr),HttpStatus.OK);
    }
    @GetMapping("/after/{date}")
    public ResponseEntity<List<Employee>> getEmployeesAfterDate(@PathVariable LocalDate date){
        return new ResponseEntity<>(employeeService.getEmployeesAfterData(date),HttpStatus.OK);
    }
    @GetMapping("/before/{date}")
    public ResponseEntity<List<Employee>> getEmployeesBeforeDate(@PathVariable LocalDate date){
        return new ResponseEntity<>(employeeService.getEmployeesBeforeData(date),HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.createEmployee(employee), HttpStatus.CREATED);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id,@RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.updateEmployee(id,employee), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
