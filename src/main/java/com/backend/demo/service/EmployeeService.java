package com.backend.demo.service;

import com.backend.demo.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployee(Long id);
    Employee updateEmployee(Employee employee,Long id);
    void deleteEmployee(Long id);
}
