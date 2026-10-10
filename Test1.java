import java.util.*;
class Student{

    String name;
    int rollno;
    int age;
    int marks;

    Student(String name, int rollno, int age, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }
}

public class Test1 {

    public static void main(String args[]){

        ArrayList<Student> list=new ArrayList<>();

        list.add(new Student("krishna", 2, 17, 90));
        list.add(new Student("mukesh", 3, 15, 27));
        list.add(new Student("soni", 4, 16, 29));
        list.add(new Student("rahul", 5, 18, 85));
        list.add(new Student("amit", 6, 17, 76));
        list.add(new Student("priya", 7, 16, 92));
        list.add(new Student("rohit", 8, 19, 65));
        list.add(new Student("neha", 9, 17, 88));
        list.add(new Student("vishal", 10, 18, 72));
        list.add(new Student("anjali", 11, 16, 95));

        Collections.sort(list, (s1, s2) -> s1.age - s2.age);

        System.out.println(list.toString());
        Collections.sort(list, (s1, s2) -> s1.rollno - s2.rollno);
        System.out.println(list.toString());
        Collections.sort(list, (s1, s2) -> s1.marks - s2.marks);

        System.out.print(list.toString());



    }

}
