package Lab3l12;

import java.util.Scanner;

class Employee{

    private String name ;
    private double monthlySalary;

    public Employee(String name, double monthlySalary){

        this.name = name;

        if(monthlySalary > 0){
            this.monthlySalary = monthlySalary;
        }
        else{
            this.monthlySalary = 0;
        }
    }

    public String getName(){
        return name;
    }

    public void giveRaise(double amount){
        if(amount > 0){
            this.monthlySalary += amount ;
            System.out.println("Raise applied");
        }
        else{
            System.out.println("Invalid amount");
        }
    }

    private double getAnnualSalary(){
        return monthlySalary * 12 ;
    }

    public double calculateTax(double taxRate){
        double total = getAnnualSalary();
        return total * taxRate;
    }
}

public class Lab3l12 {
    public static void main(String[] args) {
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String inputEname = Getvalue.nextLine();

        System.out.print("Enter Your Monthly Salary: ");
        double inputMonthlySalary = Getvalue.nextDouble();

        System.out.print("Enter Tax Rate: ");
        double inputTaxRate = Getvalue.nextDouble();

        System.out.print("Enter Raise Amount: ");
        double inputRaiseAmount = Getvalue.nextDouble();

        Employee blehEmployee = new Employee(inputEname, inputMonthlySalary);

        System.out.println("-----------------------------------");

        System.out.println("Tax (Before): " + blehEmployee.calculateTax(inputTaxRate));

        blehEmployee.giveRaise(inputRaiseAmount);

        System.out.print("Tax (After): " + blehEmployee.calculateTax(inputTaxRate));

        Getvalue.close();
    }
}
