package com.api.employee.entity;

import com.api.employee.DTO.HumanResource;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String surname;
    private LocalDate birth;
    private LocalDate hiring;
    private Double salary;
    private Long cell;
    private String email;
    private Status status;
    private Long hr;

    public Employee(Long id, String name, String surname, LocalDate birth, LocalDate hiring, Double salary, Long cell, String email, Status status, Long hr) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.hiring = hiring;
        this.salary = salary;
        this.cell = cell;
        this.email = email;
        this.status = status;
        this.hr = hr;
    }

    public Employee() {
    }

    public Long getCell() {
        return cell;
    }

    public void setCell(Long cell) {
        this.cell = cell;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId_hr() {
        return hr;
    }

    public void setId_hr(Long id_hr) {
        this.hr = id_hr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public LocalDate getHiring() {
        return hiring;
    }

    public void setHiring(LocalDate hiring) {
        this.hiring = hiring;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
