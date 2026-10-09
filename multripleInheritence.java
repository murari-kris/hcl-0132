interface Father{

    void height();

}

interface  Brother{
    void blood();
}

class Family implements  Father,Brother{

    public void height(){
        System.out.println("Father height is larger than brother");
    }

    public void blood(){
        System.out.println("Father and brother blood group are positive");
    }


}

public class multripleInheritence {

    public static void main(String args[]){
        Family obj=new Family();
        obj.height();
        obj.blood();

    }
}
