package Lab3l6;

import java.util.Scanner;

class BankAccount{
    private double balance;

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
            this.balance += amount;
            System.out.println("------------------------------");
            System.out.println("Deposit Successful");
        }
        else{
            System.out.println("Invalid depostiะ amount");
        }
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("------------------------------");
            System.out.println("Invalid withdrawal amount");
        }
        else if (amount > this.balance){
            System.out.println("Insufficient funds");
        }
        else{
            this.balance -= amount;
            System.out.println("Withdrawal Successful");
        }
    }
}

public class Lab3l6 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter initial Balance: ");
        double initialBalance = Getvalue.nextDouble();

        System.out.print("Enter Deposit Amount: ");
        double depositAmount = Getvalue.nextDouble();

        System.out.print("Enter Withdrawl Amount: ");
        double withdrawalAmouunt = Getvalue.nextDouble();

        BankAccount account = new BankAccount(initialBalance);

        account.deposit(depositAmount);

        account.withdraw(withdrawalAmouunt);

        System.out.print("Final Blance: "+ account.getBalance());
        System.out.println("------------------------------");

        Getvalue.close();

    }
    
}
