package Lab4l9;

import java.util.Scanner;

class ImmutableAccount{
    private final String accountId;
    private final double balance;

    public ImmutableAccount(String accountId, double balance){
        this.accountId = accountId;
        
        if (balance < 0){
            this.balance = 0.0;
        }
        else{
            this.balance = balance;
        }
    }

    public ImmutableAccount(ImmutableAccount other){
        this.accountId = other.accountId;
        this.balance = other.balance;
    }

    public String getAccountId(){
        return accountId;
    }

    public double gerBalance(){
        return balance;
    }

    public ImmutableAccount deposit(double amount){
        if(amount > 0){
            return new ImmutableAccount(this.accountId, this.balance + amount);
        }
        else{
            System.out.println("Invalid deposit amount.");
            return this;
        }
    }

    public ImmutableAccount withdraw(double amount){
        if (amount > 0 && amount <= balance){
            return new ImmutableAccount(this.accountId, this.balance - amount);
        }
        else if(amount > balance){
            System.out.println("Insufficnt funds.");
            return this;
        }
        else{
            System.out.println("Invalid withdrawal amount.");
            return this;
        }
    }

    public void displayInfo(){
        System.out.println("ID:"+ this.accountId +" , Balance: "+ this.balance);
    }
}

public class Lab4l9 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Account ID: ");
        String inId = Getvalue.nextLine();

        System.out.print("Enter Balance: ");
        double inBalance = Getvalue.nextDouble();

        System.out.print("Enter Dposit Amount: ");
        double inDposit = Getvalue.nextDouble();

        System.out.print("Enter Withdrawal Amount: ");
        double inWithdrawal = Getvalue.nextDouble();

        ImmutableAccount acc1 = new ImmutableAccount(inId, inBalance);
        ImmutableAccount acc2 = acc1.deposit(inDposit);
        ImmutableAccount acc3 = acc2.withdraw(inWithdrawal);

        acc1.displayInfo();
        acc3.displayInfo();

        Getvalue.close();
    }
}
