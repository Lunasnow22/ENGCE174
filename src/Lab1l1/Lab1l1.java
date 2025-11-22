package Lab1l1;

import java.util.Scanner;

public class Lab1l1 {
    public static void main(String[]args) {
        System.out.print("Program to add numbersr : + : ");
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("add Number : ");
        int number1 = Getvalue.nextInt();

        System.out.print("add Number : ");
        int number2 = Getvalue.nextInt();

        System.out.println("Sum : "+number1+" + "+number2+" = "+(number1+number2));
    }
}

