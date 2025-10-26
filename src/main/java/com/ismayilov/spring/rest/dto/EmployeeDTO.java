package com.ismayilov.spring.rest.dto;

import com.ismayilov.spring.rest.entity.Employee;

public class EmployeeDTO {
    private int id;
    private String name;
    private String department;

    public EmployeeDTO() {
    }

    // Entity-dən DTO-ya çevirmək üçün constructor:
    public EmployeeDTO(Employee employee) {
        this.id = employee.getId();
        this.name = employee.getName();
        this.department = employee.getDepartment();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

