package org.hclhrms.hrmsdatabase.hrmsdatabase.service;

import org.hclhrms.hrmsdatabase.hrmsdatabase.model.Employee;
import org.hclhrms.hrmsdatabase.hrmsdatabase.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    // Register new employee
    public Employee registerEmployee(Employee employee) {

        if (employeeRepository.existsById(employee.getId())) {
            throw new RuntimeException("Employee ID already exists");
        }

        if (employeeRepository.existsByEmail(employee.getEmail())) {
            throw new RuntimeException("Email already registered");
        }


        return employeeRepository.save(employee);
    }

    // Get employee by ID
    public Employee getEmpByid(long id) {

        return employeeRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Employee not found with ID: " + id));
    }

    // Delete employee
    public String deleteEmployee(Long id) {

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Employee not found with ID: " + id));

        employeeRepository.delete(employee);

        return "Employee deleted successfully with ID: " + id;
    }

    // Update employee
    public Employee updateEmployee(Long id, Employee updatedEmployee) {

        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Employee not found with ID: " + id));

        existingEmployee.setName(updatedEmployee.getName());
        existingEmployee.setStack(updatedEmployee.getStack());
        existingEmployee.setDesignation(updatedEmployee.getDesignation());

        return employeeRepository.save(existingEmployee);
    }
}