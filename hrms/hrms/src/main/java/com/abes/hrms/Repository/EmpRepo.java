package com.abes.hrms.Repository;


import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo {

    double squareroot(double d);
    String empData();

    public int add(int a, int b);

    public int findGreater(int n1, int n2);
}
