package Lab1l1;
import java.util.Scanner;

public class Lab1l1 {
    public static void main(String[]args) {
        Scanner SumNumber = new Scanner(System.in);

        System.out.print("add Number : ");
        int number1 = SumNumber.nextInt();

        System.out.print("add Number : ");
        int number2 = SumNumber.nextInt();

        System.out.println("Sum : "+(number1+number2));
    }
}