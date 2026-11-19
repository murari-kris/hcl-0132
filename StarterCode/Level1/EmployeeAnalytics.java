package StarterCode.Level1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class EmployeeAnalytics {

    record Employee(int id, String name, String dept, BigDecimal salary,

                    LocalDate hireDate, Set<String> skills) {}



    static Employee e(int id, String n, String d, int sal, String date, String... skills) {

        return new Employee(id, n, d, BigDecimal.valueOf(sal),

                LocalDate.parse(date), Set.of(skills));

    }



    public static void main(String[] args) {

        List<Employee> emps = List.of(

                e(1, "Asha",   "Engineering",  90000, "2019-03-01", "Java", "SQL"),

                e(2, "Ravi",   "Engineering", 120000, "2016-07-15", "Java", "Spring", "AWS"),

                e(3, "Meera",  "HR",           60000, "2020-01-10", "Recruiting"),

                e(4, "John",   "Sales",        70000, "2018-11-20", "Negotiation", "CRM"),

                e(5, "Priya",  "Engineering", 105000, "2021-05-05", "Java", "React"),

                e(6, "Karan",  "Sales",        65000, "2022-02-14", "CRM"),

                e(7, "Sara",   "HR",           62000, "2017-09-09", "Recruiting", "Payroll"),

                e(8, "Vikram", "Finance",      80000, "2015-04-30", "Excel", "SQL"));




             List<String> name=emps.stream()
                     .filter(s->s.dept.equals("Engineering"))
                     .sorted((s1, s2) -> s2.salary().compareTo(s1.salary()))
                     .map(s -> s.name())
                     .collect(Collectors.toList());

             System.out.println(name);


             List<String> names=emps.stream()
                     .sorted((s1,s2)->s2.salary().compareTo(s1.salary()))
                     .limit(3)
                     .map(s->s.name)
                     .collect(Collectors.toList());
             System.out.println(names);



             List<String> oldest=emps.stream()
                     .filter(s->s.hireDate().isBefore(LocalDate.parse("2018-01-01")))
                     .sorted((s1,s2)->s2.hireDate().compareTo(s1.hireDate))
                     .map(s->s.name()+"("+s.hireDate().getYear()+")")
                     .collect(Collectors.toList());


             System.out.println(oldest);


             String namejoin=emps.stream()
                     .map(e->e.name)
                     .collect(Collectors.joining(","));

             System.out.println(namejoin);



    }

}