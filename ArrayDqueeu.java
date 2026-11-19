
import java.util.*;
public class ArrayDqueeu {

    public static void main(String args[]){
        Queue<Integer> Q=new ArrayDeque<>();

        Q.offer(20);
        Q.offer(30);
        Q.offer(40);
        Q.offer(60);

        System.out.println(Q.peek());
        System.out.println(Q.poll());
        System.out.println(Q.size());


        System.out.println(Q);
    }
}
