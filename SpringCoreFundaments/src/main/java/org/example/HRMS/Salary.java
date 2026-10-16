package org.example.HRMS;

public class Salary {

     private int basic;
     private int DA;
     private int HR;



    public void setBasic(int basic) {
        this.basic = basic;
    }

    public int getBasic() {
        return basic;
    }



    public void setDA(int DA) {
        this.DA = DA;
    }

    public int getDA() {
        return DA;
    }


    public void setHR(int HR) {
        this.HR = HR;
    }

    public int getHR() {
        return HR;
    }

    public void totalSalary(){
        System.out.println(getBasic()+getHR()+getHR());
    }


}
