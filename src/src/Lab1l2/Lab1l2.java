package Lab1l2;

import java.util.Scanner;

public class Lab1l2 {
    public static void main(String[]args) {
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("add Number : ");
        float number1 = Getvalue.nextFloat();

        System.out.print("add Number : ");
        float number2 = Getvalue.nextFloat();

        System.out.println("Sum : "+(number1+number2));
    }
}