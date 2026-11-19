import java.util.*;

public class SetExample {

    public static void main(String args[]){

        Set<Integer> set=new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(61);
        set.add(61);
        set.add(4);
        set.add(4);
        set.add(9);

        System.out.println(set);

        set.remove(61);
        System.out.println(set);
    }
}
