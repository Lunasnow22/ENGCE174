package Lab5.Lab5l8;

import java.util.Scanner;

class Person{
    protected String name;

    public Person(String name){
        this.name = name;
    }

    public String getStatus(){
        return "Person: " + name;
    }
}

class Student extends Person{
    protected int studentID;

    public Student(String name, int studentID){
        super(name);
        this.studentID = studentID;
    }

    public String getStatus(){
        return "Student: " + name + ", ID: " + studentID;
    }
}

class Employee extends Person{
    protected double salary;

    public Employee(String name, double salary){
        super(name);
        this.salary = salary;
    }

    public void applyBonus(double bonus){
        this.salary += bonus;
    }

    public String getStatus(){
        return "Employee: " + name + ", Salary: " + salary;
    }
}

public class Lab5l8 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Student's Name: ");
        String studentName = Getvalue.nextLine();

        System.out.print("Enter Student's ID: ");
        int studentID = Getvalue.nextInt();

        Getvalue.nextLine();

        System.out.print("Enter Employee's Name: ");
        String employeeName = Getvalue.nextLine();

        System.out.print("Enter Employee's Salary: ");
        double employeeSalary = Getvalue.nextDouble();

        System.out.print("-------------------------\n");

        Student student = new Student(studentName, studentID);
        Employee employee = new Employee(employeeName, employeeSalary);
        Person[] people = {student, employee};

        for(Person p : people){
            if (p instanceof Employee){
                Employee emp = (Employee) p;
                emp.applyBonus(1000);
            }
        }    

        for(Person p : people){
            System.out.println(p.getStatus());
        }

        Getvalue.close();
    }
}
