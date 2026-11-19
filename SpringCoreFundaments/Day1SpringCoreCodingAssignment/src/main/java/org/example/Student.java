package org.example;

public class Student {

    private int studentInd;
    private String studentName;
    private Course course;

    public Student(int studentInd,String studentName,Course course){
        this.studentInd=studentInd;
        this.studentName=studentName;
        this.course=course;
    }

    public Student() {

    }

    public int getStudentInd() {
        return studentInd;
    }

    public void setStudentInd(int studentInd) {
        this.studentInd = studentInd;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void display(){
        System.out.println("Student details:");
        System.out.println("Student Id:"+getStudentInd());
        System.out.println("Student Name:"+getStudentName());
        System.out.println("Course details:");
        System.out.println(getCourse());
    }


}
