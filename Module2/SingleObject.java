package Module2;

public class SingleObject {

   private static final SingleObject obj=new SingleObject();


    private SingleObject(){

    }

    public static SingleObject createInstance(){
        return obj;
    }

    public void diplay(){
        System.out.println("hello");
    }
}
