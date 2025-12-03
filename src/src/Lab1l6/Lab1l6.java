package Lab1l6;

import java.util.Scanner;


public class Lab1l6 {
    public static void main(String[]args) {
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter score : ");
        int number1 = Getvalue.nextInt();
        
        for (int i = 1 ; i <= 12; i++) {
        	System.out.println(number1+" x " +i+ " = "+(number1 * i)); 
        }
    }
}