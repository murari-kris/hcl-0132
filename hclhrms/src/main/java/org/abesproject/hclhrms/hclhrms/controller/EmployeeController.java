package org.abesproject.hclhrms.hclhrms.controller;

import org.abesproject.hclhrms.hclhrms.entity.Employee;
import org.abesproject.hclhrms.hclhrms.service.EmplyeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmplyeeServiceImpl emplyeeService;

    @GetMapping("/")
    public String WelcomeMsg(){
        return "Welcome to abes HRMS";
    }

    @GetMapping("/addemp")
    public String addnewEmployee(){
        String empReque=emplyeeService.addEmp();
        return empReque;
    }

    @GetMapping("getemp")
    public List<Employee> getEmp(){
        return emplyeeService.getEmployee();
    }

    @GetMapping("getbyid")
    public  Employee getbyId(){
        return emplyeeService.getEmpbyid();
    }

    @GetMapping("addBulk")
    public String addBulkList(){
        return emplyeeService.listofEmp();
    }

}
