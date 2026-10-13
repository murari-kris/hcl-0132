package HCL_Assessment_1_COREJAVA2400320109009_Krishna_Murari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CRUDoperations {




    ArrayList<Employee> list=new ArrayList();


    public void addEmployee(int id, String name, String dep){
        for(Employee e:list){
            if(e.getId() ==id){
                System.out.println("Employee already exits");
                return;
            }


        }

        list.add(new Employee(id,name,dep));
    }


    public void ReadEmployee(){
        for(Employee e:list){
            System.out.println(e);
        }
    }


    public void UpdateEmpoyee(int id, String name, String dp){

        for(Employee e:list){
            if(e.getId() ==id){
                e.setName(name);
                e.setDep(dp);

                System.out.println("Employee updated Succesfully");
                return;
            }
        }
    }

    public void deleteEmployee(int id) {

        Iterator<Employee> itr = list.iterator();

        while (itr.hasNext()) {

            Employee e = itr.next();

            if (e.getId() == id) {
                itr.remove();

                System.out.println("Employee deleted successfully");
                return;
            }
        }

        System.out.println("Employee not found!");
    }

    public void ascendingOrder() {

        Collections.sort(list,
                (e1, e2) -> Integer.compare(e1.getId(), e2.getId()));

        System.out.println("Ascending order:");
        ReadEmployee();
    }


    public void descendingOrder() {

        Collections.sort(list,
                (e1, e2) -> Integer.compare(e2.getId(), e1.getId()));

        System.out.println("Descending order:");
        ReadEmployee();
    }
}
