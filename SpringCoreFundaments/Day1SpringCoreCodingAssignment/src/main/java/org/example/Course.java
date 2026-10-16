package org.example;

public class Course {

    private String courseId;
    private String courseName;
    private String durationMonths;

   public Course(String courseId,String courseName,String durationMonths){
       this.courseId=courseId;
       this.courseName=courseName;
       this.durationMonths=durationMonths;
   }

    public Course() {

    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDurationMonths() {
        return durationMonths;
    }

    public void setDurationMonths(String durationMonths) {
        this.durationMonths = durationMonths;
    }

    public void diplay(){
        System.out.println("courseId:"+getCourseId());
        System.out.println("Course Name:"+getCourseName());
        System.out.println("DurationMonth:"+getDurationMonths());

    }

    @Override
    public String toString() {
        return "Course ID: " + courseId +
                "\nCourse Name: " + courseName;
    }
}
