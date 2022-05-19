package com.toleubekbogenbai.spring.springboot.springboot_rest.controller;

import com.toleubekbogenbai.spring.springboot.springboot_rest.entity.Employee;

import com.toleubekbogenbai.spring.springboot.springboot_rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/index")
public class MainRESTController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    @Scheduled(fixedRate = 5000)
    public List<Employee> showAllEmployee(){
        List<Employee> allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    }
    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id){
        Employee employee = employeeService.getEmployee(id);
        return employee;
    }
    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return employee;
    }
    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id){
        Employee employee = employeeService.getEmployee(id);
        employeeService.deleteEmployee(id);

        return "Employee with ID = " + id + " was deleted";
    }
}
