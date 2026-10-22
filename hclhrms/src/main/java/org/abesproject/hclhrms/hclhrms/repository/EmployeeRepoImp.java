package org.abesproject.hclhrms.hclhrms.repository;

import org.abesproject.hclhrms.hclhrms.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeRepoImp implements EmployeeRepo{

    List<Employee> emplist=new ArrayList<>();

    @Override
    public String aaddEmp(Employee employee) {
        emplist.add(employee);
        return "Employee added successfully";
    }

    @Override
    public List<Employee> getEmp() {
        return emplist;
    }

    @Override
    public Employee getEmpById(long empid) {
//        for(Employee emp:emplist){
//            if(emp.getEmp_id()==empid){
//                return emp;
//            }
//        }
//
//        return null;

        return emplist.stream().filter(e->e.getEmp_id()==empid).findFirst().orElse(null);
    }

    @Override
    public String deleteById(long empid) {
        return "";
    }

    @Override
    public String updateById(long id, Employee updatedEmp) {
        return "";
    }

    @Override
    public String addEmpBulk(List<Employee> bulkEmp) {

        emplist.addAll(bulkEmp);

        return "Added Successfully";
    }
}
