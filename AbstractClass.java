
abstract  class Animal{
    abstract void sound();
}

class Dog extends Animal{

    void sound(){
        System.out.println("Dog barks");
    }
}

class cat extends Animal{
     void sound(){
         System.out.println("cat white");
     }
}

public class AbstractClass {


    public static void main(String args[]){
        Animal d=new Dog();
        Animal c=new cat();
        d.sound();
        c.sound();
    }
}
