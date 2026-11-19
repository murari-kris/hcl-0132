
import java.util.*;
public class PriorityquesueExample {

    public static void main(String args[]){

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(17);
        pq.add(11);
        pq.add(14);
        pq.add(15);
        pq.add(16);

        System.out.println(pq);

        PriorityQueue<Integer> pq2=new PriorityQueue<>(Comparator.reverseOrder());
        pq2.add(17);
        pq2.add(11);
        pq2.add(14);
        pq2.add(15);
        pq2.add(16);

        System.out.println(pq2);

    }

}
