package Lab3l13;

import java.util.Scanner;

class LicenseManager{

    private static int maxLicenses = 10;
    private static int usedLicense = 0;

    public static void setMax(int Max){
        if(Max < 0){
            System.out.println("Invalid Max Value");
        }
        else if(Max < usedLicense){
            System.out.println("Cannot Set Max Lower Than Current Usage");
        }
        else{
            maxLicenses = Max ;
            System.out.println("Max License Set To " + "[" + Max + "]");
        }
    }

    public static boolean checkOut(){
        if(usedLicense < maxLicenses){
            usedLicense++;
            System.out.println("Checkout Successful");
            return true;
        }
        else{
            System.out.println("Checkout Failed : No License Avaliable");
            return false;
        }
    }

    public static void checkIn(){
        if(usedLicense > 0){
            usedLicense-- ;
            System.out.println("Check-in Successful") ;
        }
        else{
            System.out.println("Nothing To Check-in") ;
        }
    }

    public static void displayStatus(){
        System.out.println("Used: " + usedLicense) ;
        System.out.println("Avaliable: " + (maxLicenses - usedLicense)) ;
    }
}

public class Lab3l13{

    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Amount Of Your Command: ");
        if (Getvalue.hasNextInt()){

            int N = Getvalue.nextInt();

            for(int i = 0; i < N; i++){

                System.out.print("Enter Your Command: ");
                String command = Getvalue.next();
                System.out.println("--------------------------");

                if(command.equals("SET")){
                    System.out.print("Enter Your Max Quota: ");

                    int newMax = Getvalue.nextInt();
                    LicenseManager.setMax(newMax);

                    System.out.println("--------------------------");
                }
                else if(command.equals("CHECKOUT")){
                    LicenseManager.checkOut();
                    System.out.println("--------------------------");
                }
                else if(command.equals("CHECKIN")){
                    LicenseManager.checkIn();
                    System.out.println("--------------------------");
                }
                else if(command.equals("STATUS")){
                    LicenseManager.displayStatus();
                    System.out.println("--------------------------");
                }
            }
        }

        Getvalue.close();
    }
}