package org.abesproject.hclhrms.hclhrms.service;

import org.abesproject.hclhrms.hclhrms.entity.Employee;
import org.abesproject.hclhrms.hclhrms.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmplyeeServiceImpl {

    @Autowired
    private EmployeeRepo employeeRepo;

    public String addEmp(){
        Employee employee=new Employee(200l,"rohul","F50","Java","rohul@gamil.com");
        return employeeRepo.aaddEmp(employee);
    }

    public List<Employee> getEmployee(){
        return employeeRepo.getEmp();
    }

    public Employee getEmpbyid(){
        return employeeRepo.getEmpById(890);
    }

    public String listofEmp() {

        List<Employee> bulkList = List.of(
                new Employee(890L, "rohan", "testEngi", "java", "rohan@gmail.com"),
                new Employee(891L, "mohan", "Developer", "Java", "mohan@gmail.com"),
                new Employee(892L, "sohan", "Tester", "Python", "sohan@gmail.com")
        );

        return employeeRepo.addEmpBulk(bulkList);
    }

    public String deletedEmpByid(){
        return employeeRepo.deleteById(899);
    }


    public String updatedEmpByid(long empid, Employee empl) {

        return employeeRepo.updateById(empid, empl);
    }
}
