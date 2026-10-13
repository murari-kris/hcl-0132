package Exception;

public class throwandthrowsExample {

    public static void checkAge(int age) throws Exception{

        if(age<18){
            throw new Exception("age must be 18 year old");
        }
        System.out.println("Eligible");
    }

    public static void main(String args[]){

        try{
            checkAge(17);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
