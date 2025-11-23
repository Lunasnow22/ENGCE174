package Lab1l5;

import java.util.Scanner;


public class Lab1l5 {
    public static void main(String[]args) {
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter score : ");
        int number1 = Getvalue.nextInt();

        if (number1 == 1 ) {
        	System.out.println("Americano");
        }
        else if (number1 == 2 ){
        	System.out.println("Latte");
        }
        else if (number1 == 3 ){
        	System.out.println("Espresso");
        }
        else if (number1 == 4 ){
        	System.out.println("Mocha");
        }
        else {
        	System.out.println("No message");
        }
    }
}