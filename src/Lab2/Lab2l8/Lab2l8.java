package Lab2l8;

import java.util.Scanner;

public  class Lab2l8 {
    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9.0/5.0) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5.0/9.0;
    }

    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("C_TO_F [1] or F_TO_C [2]\nEnter Number : ");
        String CF12 = Getvalue.nextLine();
        
        System.out.print("Enter your Temp : ");
        int addnumber  = Getvalue.nextInt();
        
        if(CF12.equals("1")){
            double result  = Lab2l8.celsiusToFahrenheit(addnumber);
            System.out.println(result );
        }
        else if(CF12.equals("2")){
            double result  = Lab2l8.fahrenheitToCelsius(addnumber);
            System.out.println(result );
        }
        else{
            System.out.println("Wrong mode");
        }
    }
}
