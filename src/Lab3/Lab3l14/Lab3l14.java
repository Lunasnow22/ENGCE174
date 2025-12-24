package Lab3l14;

import java.util.Scanner;

class BankAccount{

    private double balance ;
    private static int totalTransactionCount = 0;

    public BankAccount(double initialDeposit){

        if(initialDeposit >= 0){
            this.balance = initialDeposit;
        }
        else{
            this.balance = 0;
        }

        System.out.println("Account Created");
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount ;
            totalTransactionCount++ ;
            System.out.println("Deposit Successful");
        }
        else{
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= this.balance){
            this.balance -= amount ;
            totalTransactionCount++ ;
            System.out.println("Withdraw Successful");
        }

        else if(amount > this.balance){
            System.out.println("Insufficient Funds");
        }
        else{
            System.out.println("Invalid Amount");
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public static int getTotalTransactionCount(){
        return totalTransactionCount ;
    }
}

public class Lab3l14 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in) ;

        BankAccount myAccount = null;

        System.out.print("Enter Your Amount Of Your Command: ");

        if(Getvalue.hasNextInt()){
        
            int N = Getvalue.nextInt();

            for(int i = 0; i < N; i++){
                System.out.print("Enter Your Command: ");
                String command = Getvalue.next() ;

                if(command.equals("CREATE")){
                    System.out.print("Enter Amount Of Monney: ");
                    double initial = Getvalue.nextDouble() ;
                    myAccount = new BankAccount(initial) ;

                    System.out.println("--------------------------");
                }
                else if(command.equals("DEPOSIT")){
                    System.out.print("Enter Amount Of Monney: ");
                    double amount = Getvalue.nextDouble() ;

                    if(myAccount == null){
                        System.out.println("No Account Exits");
                    }
                    else{
                        myAccount.deposit(amount);
                    }

                    System.out.println("--------------------------");

                }

                else if(command.equals("WITHDRAW")){
                    System.out.print("Enter Amount Of Monney: ");
                    double amount = Getvalue.nextDouble();

                    if(myAccount == null){
                        System.out.println("No Account Exits");
                    }
                    else{
                        myAccount.withdraw(amount);
                    }
                    System.out.println("--------------------------");
                }

                else if(command.equals("STATUS")){
                    if(myAccount == null){
                        System.out.println("No Account Exits");
                    }
                    else{
                        System.out.println("Balance: " + myAccount.getBalance()) ;
                    }
                    System.out.println("--------------------------------------");
                }
                else if (command.equals("GLOBAL_STATUS")){
                    System.out.println("--------------------------------------");
                    System.out.println("Total Transactions: " + BankAccount.getTotalTransactionCount());

                }
            }
        }

        Getvalue.close();

    }
}