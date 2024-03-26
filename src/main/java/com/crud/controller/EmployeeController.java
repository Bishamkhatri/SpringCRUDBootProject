package com.crud.controller;

import com.crud.entity.Employee;
import com.crud.service.EmployeeServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeServiceImple employeeServiceImple;

    @PostMapping("/save/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
       return this.employeeServiceImple.saveEmployee(employee);
    }

    @GetMapping("/get/employees")
    public List<Employee> getAllEmployee(){
        return this.employeeServiceImple.getAllEmployee();
    }

    @GetMapping("/get/single/{id}")
    public Employee getSingleEmployee(@PathVariable Integer id){

        return this.employeeServiceImple.getSingleEmployee(id);
    }

    @DeleteMapping("/delete/employee/{id}")
    public void deleteEmployee(@PathVariable Integer id){
        this.employeeServiceImple.deleteEmployee(id);
    }

    @PutMapping("/update/employee")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeServiceImple.updateEmployee(employee);
    }
}
