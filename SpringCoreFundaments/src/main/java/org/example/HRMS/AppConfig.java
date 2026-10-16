
package org.example.HRMS;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Address address() {
        return new Address();
    }

    @Bean
    public Department department() {
        return new Department();
    }

    @Bean
    public Salary salary() {
        return new Salary();
    }

    @Bean
    public Employee employee(Address address,
                             Department department,
                             Salary salary) {

        return new Employee(address, department, salary);
    }
}
