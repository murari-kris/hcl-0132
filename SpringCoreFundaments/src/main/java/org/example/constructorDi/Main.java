package org.example.constructorDi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public  static  void main(String[] args){
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        Employee emp=context.getBean(Employee.class);
        Address emp1=context.getBean(Address.class);

        System.out.println(emp.equals(emp1));
        emp.getAdress();
    }
}
