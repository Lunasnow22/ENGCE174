package Lab1l1;
import java.util.Scanner;

public class Lab1l1 {
    public static void main(String[]args) {
        Scanner Getvalue = new Scanner(System.in);

        int number1,number2,sun;

        System.out.print("add Number : ");
        number1 = Getvalue.nextInt();

        System.out.print("add Number : ");
        number2 = Getvalue.nextInt();

        sun = number1 + number2;

        System.out.printf("Sum : %d + %d = %d ",number1,number2,sun);
    }
}