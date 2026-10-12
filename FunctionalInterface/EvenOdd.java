package FunctionalInterface;

interface check{
    public String evenOdd(int n);
}

public class EvenOdd {

    public static void main(String args[]){

        check obj=(n)->n%2==0 ? "even":"odd";

        System.out.println(obj.evenOdd(10));
        System.out.println(obj.evenOdd(7));
    }
}
