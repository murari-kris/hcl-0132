
import java.util.*;
public class StackzExample {

    public static void main(String args[]){

        Stack<Integer> st=new Stack<>();

        st.push(1);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.pop();
        st.pop();
        System.out.println(st.search(7));
        System.out.println(st.search(6));

    }
}
