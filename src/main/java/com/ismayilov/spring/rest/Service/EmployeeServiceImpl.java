package com.ismayilov.spring.rest.Service;

import com.ismayilov.spring.rest.DAO.EmployeeDAO;
import com.ismayilov.spring.rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Table;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
//    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
//    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Override
//    @Transactional
    public Employee getEmployee(int id) {
        return employeeDAO.findById(id);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);
    }
}
