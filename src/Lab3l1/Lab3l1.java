package Lab3l1;

import java.util.Scanner;

class User {
    private String username;

    public User(String username){
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }
    
}

public class Lab3l1 {
    public static void main(String[] args) {
        Scanner Getvalue = new Scanner(System.in);
        
        System.out.print("Enter Your Name: ");
        String inUsername = Getvalue.nextLine();

        User PV = new User(inUsername);

        System.out.println("-----------------------");
        System.out.println(PV.getUsername());

        Getvalue.close();
    }
    
}