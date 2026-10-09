public class Parent {
     void show(){
        System.out.println("parent");
    }

    public static void main(String[] args) {
        Parent ch = new child();
        ch.show();
    }
}

class child extends Parent{
      void show(){
        System.out.println("child");
    }
}

