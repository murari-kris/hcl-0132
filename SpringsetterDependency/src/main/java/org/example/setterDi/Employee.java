package org.example.setterDi;

public class Employee {

    private Address address;

    public  void setAddress(Address address){
        this.address=address;
    }

    public  void display(){
        address.getAddress();
    }


}
