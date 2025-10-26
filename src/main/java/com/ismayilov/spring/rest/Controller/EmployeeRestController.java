package com.ismayilov.spring.rest.Controller;

import com.ismayilov.spring.rest.Service.EmployeeService;
import com.ismayilov.spring.rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //* => @Controller @ResponseBody
@RequestMapping("/api")
public class EmployeeRestController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployee() {
        return employeeService.getAllEmployees();
    }
}
