package Generics;


class Box<T>{
    T value;
    void setValue(T value){
        this.value=value;
    }

    T getValue(){
        return value;
    }
}
public class GenericsExample {

    public static void main(String args[]){

        Box<Integer> b1=new Box<>();
        b1.setValue(100);
        System.out.println(b1.getValue());

        Box<String> s1=new Box<>();
        s1.setValue("Krishna");

        System.out.println(s1.getValue());
    }

}
