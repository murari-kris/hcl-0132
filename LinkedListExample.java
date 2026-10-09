
import java.util.*;
public class LinkedListExample {

    public static void main(String args[]){

        LinkedList<String> list=new LinkedList<>();

        list.add("mango");
        list.add("banana");
        list.add("Apple");
        list.add("Orange");

        int indx=list.indexOf("Apple");

        list.add(indx+1,"Gauva");

        System.out.println(list);

    }
}
