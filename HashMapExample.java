import java.util.*;

public class HashMapExample {

    public static void main(String args[]){

        HashMap<Integer,Integer> map=new HashMap<>();

        map.put(1,8);
        map.put(null,10);
        map.put(null,20);
        map.put(3,16);
        map.put(4,19);
        map.put(6,17);
        map.put(null,28);

        System.out.println(map);

        if(map.containsKey(5)){
            System.out.println(map.get(4));
        }
        else{
            System.out.println(map.get(null));
        }


    }
}
