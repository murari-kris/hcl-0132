package Streams;

import java.util.ArrayList;
import java.util.Comparator;

class empl{
    String name;
    int id;

    public empl(String name, int id){
        this.name=name;
        this.id=id;
    }
}
public class StreamSort {

    public static void main(String args[]){

        ArrayList<empl> list=new ArrayList<>();

        list.add(new empl("krishna",1));
        list.add(new empl("suraj",3));
        list.add(new empl("sona",2));
        list.add(new empl("nikil",5));
        list.add(new empl("nirak",4));

        //list.stream()
               // .sort();

    }
}
