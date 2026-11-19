package org.example.setterDi;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {

    @Bean
    public Address address(){
        return new Address();

    }

    @Bean
    public  Employee employee(Address address){
        Employee emp=new Employee();
        emp.setAddress(address);
        return emp;
    }
}
