package Lab1l2;
import java.util.Scanner;

public class Lab1l2 {
    public static void main(String[]args) {
        Scanner SumNumber = new Scanner(System.in);

        System.out.print("add Number : ");
        float number1 = SumNumber.nextFloat();

        System.out.print("add Number : ");
        float number2 = SumNumber.nextFloat();

        System.out.println("Sum : "+(number1+number2));
    }
}