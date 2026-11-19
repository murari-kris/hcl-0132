
import java.util.*;
import java.util.stream.Collectors;

public class OddNumberStream {

    public static void main(String args[]){

        List<Integer> list=List.of(2,4,5,8,10,15,16);

          list.stream()
                .filter(n->n%2!=0)
                  .forEach(System.out::println);








    }


}
