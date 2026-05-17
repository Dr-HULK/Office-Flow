package com.EMS.OfficeFlow.controller;

import com.EMS.OfficeFlow.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.EMS.OfficeFlow.service.EmployeeService;

import java.util.List;


@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
        System.out.println("EmployeeController LOADED");
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Long id){
        Employee employee = employeeService.getEmployee(id);
        return ResponseEntity.status(HttpStatus.OK).body(employee);
    }
}
