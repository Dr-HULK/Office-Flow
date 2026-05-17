package com.EMS.OfficeFlow.service;

import com.EMS.OfficeFlow.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.EMS.OfficeFlow.repository.EmployeeRepository;

import java.util.List;


@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
        System.out.println("Employee Service Init");
    }
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    public Employee getEmployee(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + id));
    }
    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}
