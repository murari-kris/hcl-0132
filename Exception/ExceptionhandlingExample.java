package Exception;

public class ExceptionhandlingExample {

    public static void main(String args[]){

        int a=0;
        int b=3;
        int res=0;
        try{
            res=b/a;
        }

        catch (Exception e){
            System.out.println("Exception occur:" + e.getMessage());
        }


        try{
            int arr[]={16,17,19};
            System.out.println(arr[5]);
        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
