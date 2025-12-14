package Lab3l6;

import java.util.Scanner;

class BankAccount {
    private double balance ;

    public BankAccount(double initialBalance){
    if(initialBalance >= 0){
        this.balance = initialBalance;
    }
        else{
            this.balance = 0;
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount ;
            System.out.println("Deposit successful");
        }
        else{
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= this.balance){

            this.balance -= amount;
            System.out.println("Withdraw succesful");
        }
        else if(amount > this.balance){

            System.out.println("Insufficient funds");
        }

        else{
            System.out.println("Invalid withdraw amount");
        }
    }
}

public class Lab3l6 {
    public static void main(String[] args) {

        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter initial Balance: ");
        double inputBalance = Getvalue.nextDouble() ;

        System.out.print("Enter Deposit Amount: ");
        double inputDeposit = Getvalue.nextDouble();

        System.out.print("Enter Withdrawl Amount: ");
        double inputWithdraw =Getvalue.nextDouble();

        System.out.println("------------------------------");

        BankAccount blehAccount = new BankAccount(inputBalance);

        blehAccount.deposit(inputDeposit);
        blehAccount.withdraw(inputWithdraw);

        System.out.println("Final Balance: " + blehAccount.getBalance());

        Getvalue.close();
    }
    
}
