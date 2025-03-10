package com.api.login.model;

import java.time.LocalDate;

public class EmployeeDto {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private long cell;
    private long salary;
    private LocalDate birth;
    private LocalDate hiring;
    private String status;
    private int id_hr;

    public EmployeeDto() {
    }

    public EmployeeDto(Long id, String name, String surname, String email, long cell, long salary, LocalDate birth, LocalDate hiring, String status, int id_hr) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.cell = cell;
        this.salary = salary;
        this.birth = birth;
        this.hiring = hiring;
        this.status = status;
        this.id_hr = id_hr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCell() {
        return cell;
    }

    public void setCell(long cell) {
        this.cell = cell;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId_hr() {
        return id_hr;
    }

    public void setId_hr(int id_hr) {
        this.id_hr = id_hr;
    }
}
