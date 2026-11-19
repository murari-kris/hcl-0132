import java.util.*;

public class LinkedHashMapExample {

    public static void main(String args[]){

        HashMap<Integer,Integer> map1=new LinkedHashMap<>();

        map1.put(1,45);
        map1.put(2,17);
        map1.put(3,16);
        map1.put(4,17);
        map1.put(5,19);

        System.out.println(map1);
        HashMap<Integer,Integer> map2=new HashMap<>();

        map2.put(1,45);
        map2.put(2,17);
        map2.put(3,16);
        map2.put(4,17);
        map2.put(5,19);

        System.out.println(map2);

    }
}
