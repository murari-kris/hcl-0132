package org.example.constructorDi;

public class Employee {

    private Address adress;

    public Employee(Address adress){
        this.adress=adress;
    }

    public  void getAdress(){
        adress.getAddress();
    }

}
