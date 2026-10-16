package org.example;

public class StudentService {

    private Student student;

    public  StudentService(Student student){
        this.student=student;
    }

    public void displayStudentProfile(){
        student.setCourse(new Course("C01","Java Full Stack","4 Months"));
        student.setStudentInd(101);
        student.setStudentName("Aditi Sharma");
        student.display();
    }


}
