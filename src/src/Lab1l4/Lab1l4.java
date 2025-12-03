package Lab1l4;
import java.util.Scanner;

public class Lab1l4 {
    public static void main(String[]args) {
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter score : ");
        int number1 = Getvalue.nextInt();

        if (number1 >= 80 ) {
        	System.out.println("You got the grade [A]");
        }
        else if (number1  >= 75){
        	System.out.println("You got the grade [B+]");
        }
        else if (number1  >= 70){
        	System.out.println("You got the grade [B]");
        }
        else if (number1  >= 65){
        	System.out.println("You got the grade [C+]");
        }
        else if (number1  >= 60){
        	System.out.println("You got the grade [C]");
        }
        else if (number1  >= 55){
        	System.out.println("You got the grade [D+]");
        }
        else if (number1  >= 50){
        	System.out.println("You got the grade [D]");
        }
        else {
        	System.out.println("You got the grade [F]");
        }
    }
}