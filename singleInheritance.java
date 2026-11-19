class A{
    boolean m1(){
        System.out.println("Hello");
        return false;
    }
}


class B extends A{
    boolean m1(){
        System.out.println("Krishna");
        return false;
    }
}
public class singleInheritance {
    public static void main(String args[]) {

        B b=new B();
        A s=new A();
        A s2=new B();

        System.out.println(b.m1());
        System.out.println(s.m1());
        System.out.println(s2.m1());


    }

}





