
import java.util.*;
public class Queueexample {

    public static void main(String args[]){

        Queue<Integer> Q=new LinkedList<>();

        Q.add(20);
        Q.add(30);
        Q.add(40);
        Q.add(50);

        System.out.println(Q.peek());
        System.out.println(Q.remove());
        System.out.println((Q));

    }

}
