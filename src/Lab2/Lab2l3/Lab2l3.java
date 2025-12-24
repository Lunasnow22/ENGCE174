package Lab2l3;

import java.util.Scanner;

class Student {
    private String studentId;
    private String name;

    static int studentCount = 0;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;

        studentCount++;
    }
    static void show(){
        System.out.println("Student All ["+studentCount+"]");
    }
}



public class Lab2l3 {
    public static void main(String[] args) {
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Want to register: ");
        int N = Getvalue.nextInt();

        Getvalue.nextLine(); 

        for (int i = 0; i < N; i++) {
            System.out.println("\n--- Student information " + (i + 1) + " ---");
            System.out.print("Student ID: ");
            String id = Getvalue.nextLine();
            
            System.out.print("First and Last name: ");
            String name = Getvalue.nextLine();

            Student s = new Student(id, name); 
        }

        Student.show();

        Getvalue.close();

    }
}