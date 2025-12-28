package Lab5.Lab5l7;

import java.util.Scanner;

class Employee{
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary(){
        return baseSalary;
    }
}

class SalesEmployee extends Employee{
    protected double commission;
    public SalesEmployee(String name, double baseSalary, double commission){
        super(name, baseSalary);
        this.commission = commission;
    }

    @Override
    public double calculateSalary(){
        return baseSalary + (baseSalary * commission);
    }
}

class Manager extends Employee{
    protected double fixedBonus;

    public Manager(String name, double baseSalary, double fixedBonus){
        super(name, baseSalary);
        this.fixedBonus = fixedBonus;
    }

    @Override
    public double calculateSalary(){
        return baseSalary + fixedBonus;
    }
}

class PayrollProcessor{
    public static void process(Employee e){
        System.out.println(e.name +" total pay: "+ e.calculateSalary());
    }
}

public class Lab5l7 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Sales Employee Name: ");
        String salesName = Getvalue.nextLine();

        System.out.print("Enter Sales Employee Base Salary: ");
        double salesBaseSalary = Getvalue.nextDouble();

        System.out.print("Enter Sales Employee Commission (as decimal): ");
        double salesCommission = Getvalue.nextDouble();

        Getvalue.nextLine();

        System.out.println("-------------------------");

        System.out.print("Enter Manager Name: ");
        String managerName = Getvalue.nextLine();

        System.out.print("Enter Manager Base Salary: ");
        double managerBaseSalary = Getvalue.nextDouble();

        System.out.print("Enter Manager Fixed Bonus: ");
        double managerFixedBonus = Getvalue.nextDouble();

        SalesEmployee salesEmp = new SalesEmployee(salesName, salesBaseSalary, salesCommission);
        Manager managerEmp = new Manager(managerName, managerBaseSalary, managerFixedBonus);

        System.out.println("-------------------------");

        PayrollProcessor.process(salesEmp);
        PayrollProcessor.process(managerEmp);

        Getvalue.close();
    }
}
