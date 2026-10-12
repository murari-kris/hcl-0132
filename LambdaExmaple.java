interface Calulator{
    public int calculator(int a, int b);
}



public class LambdaExmaple {

    public static void main(String args[]){
        Calulator c=(a,b)->a+b;
        System.out.println(c.calculator(3,5));

        Calulator d=(a,b)->a-b;
        System.out.println(d.calculator(3,5));

        Calulator e=(a,b)->a*b;
        System.out.println(e.calculator(3,5));

        Calulator f=(a,b)->a/b;
        System.out.println(f.calculator(3,5));

    }
}
