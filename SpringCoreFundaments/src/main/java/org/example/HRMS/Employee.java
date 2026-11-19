
package org.example.HRMS;

public class Employee {

    private Address address;
    private Department department;
    private Salary salary;

    public Employee(Address address,
                    Department department,
                    Salary salary) {

        this.address = address;
        this.department = department;
        this.salary = salary;
    }



    public void getAddress() {
        System.out.println(address);
    }

    public void getDepartment() {
        department.getDepartment();
    }

    public void getSalary() {

        salary.setBasic(10000);
        salary.setDA(140000);
        salary.setHR(15000);

        salary.totalSalary();
    }
}
