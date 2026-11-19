package Exception;


class checkException extends Exception{

    checkException(String msg){
        super(msg);
    }

}
public class CustomeExcepion {

    public static void checkAge(int age) throws checkException {

        if (age < 18) {
            throw new checkException("age must be 18 year old or greater than 18 year old");
        }
        System.out.println("Eligible");
    }

    public static void main(String args[]) throws checkException {


            checkAge(17);

//            try{
//                checkAge(17);
//            }
//            catch (checkException e){
//                System.out.println(e.getMessage());
//            }

    }

}
