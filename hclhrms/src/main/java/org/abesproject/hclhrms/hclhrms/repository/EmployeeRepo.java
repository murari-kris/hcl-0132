package org.abesproject.hclhrms.hclhrms.repository;


import org.abesproject.hclhrms.hclhrms.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo {

    String aaddEmp(Employee employee);
    List<Employee> getEmp();
    Employee getEmpById(long empid);
    String deleteById(long empid);
    String updateById(long id,Employee updatedEmp);
    String addEmpBulk(List<Employee> bulkEmp);




}
