package Lab3l15;

import java.util.Scanner;

class User {

    private String username;
    private int failedAttempts;
    private boolean isLocked;
    private static int maxAttempts = 3;

    public User(String username){
        this.username = username;
        failedAttempts = 0;
        isLocked = false;
    }

    public static void setPolicy(int max){
        if(max > 0){
            maxAttempts = max ;
            System.out.println("Policy Updated");
        }
        else{
            System.out.println("Invalid Policy");
        }
    }

    public String getUsername(){
        return this.username;
    }

    public boolean isLocked(){
        return isLocked;
    }

    public int getFailedAttempts(){
        return failedAttempts;
    }

    public void login(String password){
        if(isLocked){
            System.out.println("Account Is Locked");
            return;
        }
        if(password.equals("pass123")){
            failedAttempts = 0;
            System.out.println("Login Successful");
        }
        else{
            failedAttempts++;

            if(failedAttempts >= maxAttempts){
                isLocked = true ;
                System.out.println("Login Failed. Account Locked");
            }
            else {
                int remaining = maxAttempts - failedAttempts ;
                System.out.println("Login Failed " + remaining + " Attempts Left");
            }
        }
    }
}

public class Lab3l15 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String inputUsername = scanner.next();

        System.out.println("--------------------------");

        User umane = new User(inputUsername);

        System.out.print("Enter Amount OF Your Command: ");

        if(scanner.hasNextInt()){

            int N = scanner.nextInt();

            for(int i = 0; i < N; i++){
                System.out.print("Enter Your Command: ");
                String command = scanner.next() ;

                System.out.println("--------------------------");

                if(command.equals("SET_POLICY")){
                    System.out.print("SET YOUR POLICY: ");
                    int newMax = scanner.nextInt() ;

                    User.setPolicy(newMax) ;

                    System.out.println("--------------------------");
                }
                else if(command.equals("LOGIN")){
                    System.out.print("Enter Your Password: ");
                    String password = scanner.next() ;

                    umane.login(password) ;

                    System.out.println("--------------------------");
                }
            }
        }

        scanner.close();

    }
}