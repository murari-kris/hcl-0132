package Switch;

public class SwitchExpressionExample {

    public static void main(String rgs[]){

        int day=5;

        String ans=switch (day){

            case 1->"monday";
            case 2->"tuesday";
            case 3->"wednesday";
            case 4->"thrusday";
            case 5->"frieday";
            case 6->"saturday";
            default -> "Invalid day";
        };

        System.out.println(ans);

    }
}
