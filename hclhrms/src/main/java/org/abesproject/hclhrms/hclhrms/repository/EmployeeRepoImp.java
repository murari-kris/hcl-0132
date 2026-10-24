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
         boolean status=false;
        if(getEmpById(empid)!=null){
            status=emplist.removeIf(e->e.getEmp_id()==empid);
        }

        if(status){
            return "Employee deleted successfully";
        }

        return "Empl is not registered"+" "+empid;
    }

    @Override
    public String updateById(long empid, Employee updatedEmp) {

        Employee existing = getEmpById(empid);

        if (existing != null) {

            existing.setEmp_name(updatedEmp.getEmp_name());
            existing.setEmail(updatedEmp.getEmail());
            existing.setDesignation(updatedEmp.getDesignation());
            existing.setProgStack(updatedEmp.getProgStack());

            return "Employee updated successfully";
        }

        return "Employee is not registered " + empid;
    }

    @Override
    public String addEmpBulk(List<Employee> bulkEmp) {

        emplist.addAll(bulkEmp);

        return "Added Successfully";
    }
}
