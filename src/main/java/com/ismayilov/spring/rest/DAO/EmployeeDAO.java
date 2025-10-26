package com.ismayilov.spring.rest.DAO;

import com.ismayilov.spring.rest.entity.Employee;


import java.util.List;


public interface EmployeeDAO {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee findById(int id);
    void deleteEmployee(int id);
}
