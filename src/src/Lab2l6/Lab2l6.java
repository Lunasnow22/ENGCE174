package Lab2l6;

import java.util.Scanner;

class BankAccount {
    private String Ownername;
    private double balance;
    

    public BankAccount (String Ownername, double moneyOs){
        this.Ownername = Ownername;
        this.balance  = moneyOs;
    }

    public void deposit(double amount){
        if(amount < 0) amount = 0;
        balance += amount;
    }

    public void DisplaySummary(){
        System.out.println("Owner : "+Ownername);
        System.out.println("Balance : "+ balance);
    }

}

public  class Lab2l6 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String name = Getvalue.nextLine();

        System.out.print("Enter current money : ");
        double moneyOs = Getvalue.nextDouble();

        System.out.print("Enter Deposit money : ");
        double amount  = Getvalue.nextDouble();
        
        BankAccount  n = new BankAccount(name, moneyOs);

        n.deposit(amount);

        n.DisplaySummary();
    }
}