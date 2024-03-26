package com.crud.service;

import com.crud.entity.Employee;
import com.crud.repository.EmployeeRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImple implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee saveEmployee(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getSingleEmployee(Integer id) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        return employeeOptional.orElseThrow(()-> new RuntimeException("Employee not found : " + id));
    }

    @Override
    public void deleteEmployee(Integer id) {
        this.employeeRepository.deleteById(id);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        employeeRepository.findById(employee.getEmployeeId()).orElseThrow();
        return employeeRepository.save(employee);
    }


}
