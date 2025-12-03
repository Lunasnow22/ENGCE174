package Lab2l2;

import java.util.Scanner;

class Student  {
   
    String studentid; 
    String name;  

    public void displayInfo(){
        System.out.println("Student ID: " + studentid);
        System.out.println("Name: " + name);
    }    
}


public class Lab2l2  {
    public static void main(String[] args) {
        Scanner Getvalue = new Scanner(System.in);
        
        System.out.print("Add Student ID: ");
        String inId = Getvalue.nextLine(); 

        System.out.print("Add Full Name: ");
        String inName = Getvalue.nextLine();

        Student studentObj = new Student();

        studentObj.studentid = inId;
        studentObj.name = inName;

        Getvalue.close();

        System.out.println("\n--- Data ---");
        studentObj.displayInfo();
    }
}

