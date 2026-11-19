package com.abes.hrms.Controller;

import com.abes.hrms.model.DemoEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
  private DemoEmployee demoEmployee;

//    public EmployeeController(DemoEmployee demoEmployee) {
//        this.demoEmployee = demoEmployee;
//    }

    @GetMapping("/")
    public String welcome(){

        return "<h2>welcome to HRMS appln</h2>";
    }

    @GetMapping("/add")
    public int sum(){
        int res=demoEmployee.add();
        return res;
    }

    @GetMapping("/square")
    public  double  square(){
        double res=demoEmployee.squareRoot();
        return res;
    }

    @GetMapping("/greater")
    public  int greater(){
        return demoEmployee.findGreaterNum();
    }


}
