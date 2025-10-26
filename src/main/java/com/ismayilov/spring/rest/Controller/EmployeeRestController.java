package com.ismayilov.spring.rest.Controller;

import com.ismayilov.spring.rest.Service.EmployeeService;
import com.ismayilov.spring.rest.entity.Employee;
import com.ismayilov.spring.rest.exception.EmployeeIncorrectData;
import com.ismayilov.spring.rest.exception.NoSuchEmployeeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController //* => @Controller @ResponseBody
@RequestMapping("/api")
public class EmployeeRestController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployee() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee findEmployeeById(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);
        if (Objects.isNull(employee))
            throw new NoSuchEmployeeException("There is no employee with id = " + id);
        return employee;
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> handleException(NoSuchEmployeeException exception) {
        EmployeeIncorrectData data = new EmployeeIncorrectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }

}
