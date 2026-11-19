import java.util.*;

public class CollectionExampl {

    public static void main(String args[]){

        int arr[]={1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list=new ArrayList<>();
        for(int i:arr){
            list.add(i);
        }

        ArrayList<Integer> list2=new ArrayList<>();


        list2.addAll(list);

        int indx=list.indexOf(7);

        list.set(indx,11);

        if(list.contains(19)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        System.out.println(list);
        list.remove(0);
        System.out.println(list.get(0));
        System.out.println(list2);
        System.out.println(list2.get(0));
        list2.removeAll(list);
        System.out.println(list2);



    }


}
