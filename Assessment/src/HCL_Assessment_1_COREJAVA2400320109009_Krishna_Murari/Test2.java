package HCL_Assessment_1_COREJAVA2400320109009_Krishna_Murari;

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
