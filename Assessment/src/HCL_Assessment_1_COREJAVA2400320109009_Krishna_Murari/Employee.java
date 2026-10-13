package HCL_Assessment_1_COREJAVA2400320109009_Krishna_Murari;

public class Employee {

    private int id;
    private String name;
    private String dep;

    public Employee(int id, String name, String dep){
        this.id=id;
        this.name=name;
        this.dep=dep;
    }




    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getDep() {
        return dep;
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