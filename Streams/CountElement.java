package Streams;

import java.util.ArrayList;

public class CountElement {
    public static void main(String args[]) {

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(2);
        list1.add(40);
        list1.add(4);
        list1.add(18);
        list1.add(67);

        long m=list1.stream()
                .count();

        System.out.print(m);
    }

}
