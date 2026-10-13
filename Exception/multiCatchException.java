package Exception;

public class multiCatchException {

    public static void main(String args[]){
         int arr[]={3,5,6,8,9};
          int a=0;
          int b=1;
          int result=0;
          try{
             result=b/a;
          }

          catch (ArithmeticException e){
              System.out.println("Arithmetic Exception");
              return;
          }

          catch (IndexOutOfBoundsException e){
              System.out.print("IndexOut Exception");
          }

          catch (NoClassDefFoundError e){
              System.out.print("NoClassDefFoundError");
          }

          finally {
              System.out.println("Multiple catch Handling");
          }

    }
}
