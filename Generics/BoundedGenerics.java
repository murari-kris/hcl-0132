package Generics;

class Calculator <T extends Number>{
    T value;
    Calculator(T value){

        this.value=value;
    }

    public void display(){
        System.out.println(value);
    }
}


public class BoundedGenerics {

    public static void main(String args[]){
        Calculator<Integer> cal=new Calculator<>(100);
        Calculator<Double> cal2=new Calculator<>(100.7);

        cal.display();
        cal2.display();

    }
}
