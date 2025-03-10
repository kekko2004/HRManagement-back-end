package com.api.login.model;


import java.util.List;

public class Response {
    private boolean check;
    private String message;
    private List<EmployeeDto> employees;
    private Long id;

    public Response(boolean check, String message, Long id) {
        this.check = check;
        this.message = message;
        this.id = id;
    }

    public Response(boolean check, String message) {
        this.check = check;
        this.message = message;
    }

    public Response(boolean check, String message, List<EmployeeDto> employees, Long id) {
        this.check = check;
        this.message = message;
        this.employees = employees;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<EmployeeDto> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeDto> employees) {
        this.employees = employees;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
