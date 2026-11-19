import java.util.*;
class Employee{

    int id;
    String name;
    String dep;

    Employee(int id,String name, String dep){
        this.id=id;
        this.name=name;
        this.dep=dep;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dep='" + dep + '\'' +
                '}';
    }


}

class CRUDoperations{

    ArrayList<Employee> list=new ArrayList();


    public void addEmployee(int id, String name, String dep){
        for(Employee e:list){
            if(e.id==id){
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
            if(e.id==id){
                e.name=name;
                e.dep=dp;

                System.out.println("Employee updated Succesfully");
                return;
            }
        }
    }

    public void deleteEmployee(int id) {

        Iterator<Employee> itr = list.iterator();

        while (itr.hasNext()) {

            Employee e = itr.next();

            if (e.id == id) {
                itr.remove();

                System.out.println("Employee deleted successfully");
                return;
            }
        }

        System.out.println("Employee not found!");
    }

    public void ascendingOrder() {

        Collections.sort(list,
                (e1, e2) -> Integer.compare(e1.id, e2.id));

        System.out.println("Ascending order:");
        ReadEmployee();
    }


    public void descendingOrder() {

        Collections.sort(list,
                (e1, e2) -> Integer.compare(e2.id, e1.id));

        System.out.println("Descending order:");
          ReadEmployee();
    }



}

public class Test2 {

    public static void main(String args[]){
        CRUDoperations obj=new CRUDoperations();
        obj.addEmployee(2,"krishna","dp1");
        obj.addEmployee(1,"Mukesh","dp3");
        obj.addEmployee(6,"Nilam","dp4");
        obj.addEmployee(5,"sonal","dp5");

       obj.ReadEmployee();

       obj.UpdateEmpoyee(2,"nikil","dep7");

       obj.deleteEmployee(2);

       obj.ascendingOrder();
       obj.descendingOrder();




    }
}
