package Generics;

public class GenricsMethodExample {

    public static <T> void sol(T value){
        System.out.println(value);
    }

    public static void main(String  args[]){
        sol(100);
        sol("string");
        sol(3.7);
    }
}
