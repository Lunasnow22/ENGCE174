package Lab2l12;

import java.util.Scanner;

class Course{
    String courseid;
    String courseName;

    public Course(String courseid, String courseName){
        this.courseid = courseid;
        this.courseName = courseName;
    }

    public String getCourseInfo(){
        return  courseid + " : " + courseName;
    }

}

class Student {
    String name;
    Course enrllCourse;

    public Student(String name , Course enrllCourse){
        this.name = name;
        this.enrllCourse = enrllCourse;
    }

    public void displayEnrollment(){
        System.out.println("Student : "+ name);
        System.out.println("Enrolled in : "+ enrllCourse.getCourseInfo());
    }
}

public class Lab2l12 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Your Course ID Name : ");
        String addIDCourseName = Getvalue.nextLine();

        System.out.print("Enter Your Course Name : ");
        String addCourseName = Getvalue.nextLine();

        System.out.print("Enter Your Name : ");
        String addName = Getvalue.nextLine();

        Course C = new Course(addIDCourseName, addCourseName);

        Student S = new Student(addName, C);

        S.displayEnrollment();

    }
    
}