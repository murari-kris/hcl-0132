package com.abes.hrms.model;

import com.abes.hrms.Repository.EmpRepo;
import com.abes.hrms.Repository.EmpRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoEmployee {

    @Autowired
    private EmpRepoImpl empRepo;

    public int add(){
        return empRepo.add(23,67);
    }

    public double squareRoot(){
        return empRepo.squareroot(200);
    }

    public int findGreaterNum(){
        return empRepo.findGreater(12,14);
    }
}
