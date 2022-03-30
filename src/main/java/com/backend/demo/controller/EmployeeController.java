package com.backend.demo.controller;


import com.backend.demo.model.Employee;
import com.backend.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {

    // Inyecto la interfaz employeeService que buscara la clase que implemente la interfaz y tenga la anotacion @Service
    @Autowired
    EmployeeService employeeService;


    // build create employee REST API
    @PostMapping()
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){

        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    // build get all employees REST API

    @GetMapping()
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    // build get Employee by id
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
        return new ResponseEntity<Employee>(employeeService.getEmployee(id),HttpStatus.OK);
    }

    // build update Employee REST API
    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.updateEmployee(employee,id),HttpStatus.OK);
    }

    // build delete Employee REST API

    @DeleteMapping("{id}")
    public void deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }


}
