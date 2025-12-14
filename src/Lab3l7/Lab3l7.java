package Lab3l7;

import java.util.Scanner;

class Employee{
    private String employeeId;
    private String department;

    public Employee(String employeeId, String department){
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getEmploeeId(){
        return this.employeeId;
    }

    public String getDepartment(){
        return this.department;
    }

    public void setDepartment(String newDepartment){
        this.department = newDepartment;
    }
}

public class Lab3l7 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Your ID: ");
        String inputID = Getvalue.nextLine();

        System.out.print("Enter Your Old Department: ");
        String inputOld = Getvalue.nextLine();

        System.out.print("Enter Your New Department: ");
        String inputNew = Getvalue.nextLine();

        Employee emp = new Employee(inputID,inputOld);

        emp.setDepartment(inputNew);

        System.out.println("----------------------------");
        System.out.println(emp.getEmploeeId());
        System.out.println(emp.getDepartment());
        System.out.print("----------------------------");
        
        Getvalue.close();
    }
}

