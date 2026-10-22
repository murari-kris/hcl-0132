package com.abes.hrms.Repository;

import org.springframework.stereotype.Component;

@Component
public class EmpRepoImpl implements EmpRepo{
    @Override
    public double squareroot(double d) {
        double res=Math.sqrt(d);
        return res;
    }

    @Override
    public String empData() {
        return "";
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int findGreater(int n1, int n2) {
        if(n1<n2){
            return n2;
        }
        return n1;
    }
}
