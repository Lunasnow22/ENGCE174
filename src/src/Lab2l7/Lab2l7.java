package Lab2l7;

import java.util.Scanner;

class BankAccount {
    private String Ownername;
    private double balance;
    

    public BankAccount (String Ownername, double moneyOs){
        this.Ownername = Ownername;
        this.balance  = moneyOs;
    }

    public void withdraw(double amount){
        if(amount <= this.balance){ 
            this.balance -= amount;
            System.out.println("Withdrawal successful");
        }

        else{
            System.out.println("Insufficient funds.");
        }

        
    }

    public void displayBalance(){

        System.out.println("Balance : "+ this.balance);
    }

}

public  class Lab2l7 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String name = Getvalue.nextLine();

        System.out.print("Enter current money : ");
        double moneyOs = Getvalue.nextDouble();

        System.out.print("Enter Deposit money 1 : ");
        double amount1  = Getvalue.nextDouble();
        
        System.out.print("Enter Deposit money 2 : ");
        double amount2  = Getvalue.nextDouble();
        
        BankAccount  n = new BankAccount(name, moneyOs);

        n.withdraw(amount1);
        n.withdraw(amount2);

        n.displayBalance();
    }
}
