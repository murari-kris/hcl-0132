package Switch;

import com.sun.source.doctree.SystemPropertyTree;

public class switchReturnExample {

    public static void main(String args[]){

        int day=7;

        String ans=switch (day){

            case 1->"monday";
            case 2->"tuesday";
            case 3->"wednesday";
            case 4->"thrusday";
            case 5->"frieday";
            case 6->"saturday";
            default -> {
                System.out.println("invalid day");
                yield "Invalid";
            }
        };

        System.out.println(ans);
    }
}
