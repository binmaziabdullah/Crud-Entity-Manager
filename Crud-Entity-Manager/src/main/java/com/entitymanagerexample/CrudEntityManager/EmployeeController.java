package com.entitymanagerexample.CrudEntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService  employeeService;

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
       Employee employee1s = employeeService.AddEmployee(employee);
        return employee;
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.getAEmployeeById(id);
    }

    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping
    public Employee deleteEmployee(@RequestBody Employee employee){
       return employeeService.deleteEmployee(employee);
    }



}
