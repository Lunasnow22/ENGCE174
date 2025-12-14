package Lab3l9;

import java.util.Scanner;

class User {

    private String username ;
    private String password ;
    private static int minPasswordLength = 8 ;

    public User(String username, String password){

        this.username = username ;

        if(password.length() >= minPasswordLength) {
            this.password = password ;
            System.out.println("Creation Successful") ;
        }
        else{
            this.password = "invalid" ;
            System.out.println("Creation Failed") ;
        }
    }

    public String getPassword(){
        return this.password ;
    }

    public void setPassword(String newPassword){
        if(newPassword.length() >= minPasswordLength){
            this.password = newPassword ;
            System.out.println("-----------------------------");
            System.out.println("Update Successful") ;
        }
        else{
            System.out.println("-----------------------------");
            System.out.println("Update Failed") ;
        }
    }

    public static void setMinLength(int length){
        if(length < 4){
            System.out.println("Invalid Length") ;
        }
        else{
            minPasswordLength = length ;
            System.out.println("New Min Length Set To " + length) ;
        }
    }

    public static int getMinLength(){
        return minPasswordLength ;
    }
    
}
public class Lab3l9 {
    public static void main(String[] args){

        Scanner Getvalue = new Scanner(System.in) ;
        
        System.out.print("Enter Your Password Length: ");
        int inpMinLength1 = Getvalue.nextInt();

        Getvalue.nextLine();

        System.out.println("-----------------------------");
        System.out.print("Enter Your Name: ");
        String inpUserName1 = Getvalue.nextLine();
        
        System.out.print("Enter Your Password: ");
        String inpUserPassword1 = Getvalue.nextLine();

        System.out.println("-----------------------------");
        System.out.print("Enter Your Name: ");
        String inpUserName2 = Getvalue.nextLine();

        System.out.print("Enter Your Password: ");
        String inpUserPassword2 = Getvalue.nextLine();

        System.out.println("-----------------------------");
        System.out.print("Enter Your Password Length: ");
        int inpMinLength2 = Getvalue.nextInt();

        Getvalue.nextLine() ;

        System.out.print("Enter Your New Password: ");
        String inpUserNewPassword2 = Getvalue.nextLine();

        System.out.println("-----------------------------");

        User.setMinLength(inpMinLength1) ;

        User userno1 = new User(inpUserName1,inpUserPassword1);
        User userno2 = new User(inpUserName2,inpUserPassword2);

        User.setMinLength(inpMinLength2);

        userno2.setPassword(inpUserNewPassword2);

        System.out.println(userno1.getPassword());
        System.out.println(userno2.getPassword());
        System.out.print("-----------------------------");

        Getvalue.close();

    }
}
