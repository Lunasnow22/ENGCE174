package Lab3l3;

import java.util.Scanner;

class User{
    private String password;

    public User(String initialPassword){
        this.password = initialPassword;
    }
    
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String newPassword){
        if(newPassword.length() >= 8){
            this.password = newPassword;
            System.out.print("Password Update: ");
        }
        else{
            System.out.print("Password is to Short: ");
        }
    }
}

public class Lab3l3 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Your old Password: ");
        String inputPassword = Getvalue.nextLine();

        System.out.print("Enter Your New Password: ");
        String inputNewPassword = Getvalue.nextLine();

        User NPassword = new User(inputNewPassword);

        System.out.println("-------------------------");
        
        NPassword.setPassword(inputNewPassword);

        System.out.print(NPassword.getPassword());

        Getvalue.close();
    }
}
