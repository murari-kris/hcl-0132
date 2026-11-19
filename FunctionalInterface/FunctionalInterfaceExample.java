package FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceExample {

    public static void main(String args[]){

        Predicate<Integer> p=n->n%2==0;
        Function<Integer,Integer> f=n->n*n;
        Supplier<String> s=()->"welcome to java";
        Consumer<Integer> c=n->System.out.println(n);

        System.out.println(p.test(10));
        System.out.println(f.apply(12));
        System.out.println(s.get());
        c.accept(1000);
    }
}
