package Lab1l3;
import java.util.Scanner;

public class Lab1l3 {
    public static void main(String[]args) {
        Scanner SumNumber = new Scanner(System.in);

        System.out.print("add Number : ");
        int number1 = SumNumber.nextInt();

        if (number1 % 2 == 0) {
        	System.out.println("Even");
        }
        else {
        	System.out.println("Odd");
        }
    }
}