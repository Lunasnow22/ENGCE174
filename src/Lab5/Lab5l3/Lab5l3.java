package Lab5.Lab5l3;

import java.util.Scanner;

class Employee{
    protected double salary;

    public double calculateBonus(){
        return salary * 0.10;
    }
}

class Manager extends Employee{

    @Override
    public double calculateBonus(){
        return salary * 0.05 + super.calculateBonus();
    }
}

public class Lab5l3 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Manager's Salary: ");
        double insalary = Getvalue.nextDouble();

        System.out.print("-------------------------\n");

        Manager manager = new Manager();
        manager.salary = insalary;

        double bonus = manager.calculateBonus();
        System.out.println("Manager's Bonus: " + bonus);
    }
}
