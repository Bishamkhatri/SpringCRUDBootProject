package com.crud.service;

import com.crud.entity.Employee;

import java.util.List;

public interface EmployeeService {

    //Create Employee
    public Employee saveEmployee(Employee employee);

    //Get All Employees
    public List<Employee> getAllEmployee();

    //Get Single Employee
    public Employee getSingleEmployee(Integer id);

    //Delete Employee
    public void deleteEmployee(Integer id);

    //Update Employee
    public Employee updateEmployee(Employee employee);
}
