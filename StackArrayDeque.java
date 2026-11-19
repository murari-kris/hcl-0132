
import java.util.*;
public class StackArrayDeque {

    public static void main(String args[]){

        Deque<Integer> st=new ArrayDeque<>();

        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(90);

        System.out.print(st.peek());
        System.out.println(st.getFirst());
        System.out.println(st.getLast());
        System.out.println(st.poll());
        System.out.println(st.pollLast());

        System.out.println(st);


    }
}
