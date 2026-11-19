package org.hclhrms.hrmsdatabase.hrmsdatabase.controller;

import org.hclhrms.hrmsdatabase.hrmsdatabase.model.Employee;
import org.hclhrms.hrmsdatabase.hrmsdatabase.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "http://localhost:5173")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Register new employee
    @PostMapping("/register")
    public ResponseEntity<?> registerEmployee(
            @RequestBody Employee employee) {

        employeeService.registerEmployee(employee);
        System.out.println(employee.getEmail());
        System.out.println(employee.getId());
        System.out.println(employee.getName());

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("message", "Employee registered successfully"));



    }

    // Find employee by ID
    @GetMapping("/findByid/{id}")
    public ResponseEntity<Employee> getEmpById(
            @PathVariable long id) {

        Employee employee = employeeService.getEmpByid(id);

        return ResponseEntity.ok(employee);
    }

    // Delete employee
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployee(
            @PathVariable Long id) {

        return ResponseEntity.ok(
                employeeService.deleteEmployee(id)
        );
    }

    // Update employee
    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployee(
            @PathVariable Long id,
            @RequestBody Employee employee) {

        Employee updatedEmployee =
                employeeService.updateEmployee(id, employee);

        return ResponseEntity.ok(updatedEmployee);
    }
}