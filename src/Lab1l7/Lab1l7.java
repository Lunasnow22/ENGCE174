package Lab1l7;
import java.util.Scanner;

public class Lab1l7 {
    public static void main(String[] args) {
    	Scanner Getvalue = new Scanner(System.in);
    	long sum = 0;
    	
    	System.out.print("add number [N] : ");
    	int number1 = Getvalue.nextInt();
    	
    	for(int i = 0; i < number1; i++) {
    		System.out.print("number :"+(i+1)+": ");
    		int number2 = Getvalue.nextInt();
    		sum += number2;
    	}
    	Getvalue.close();
    	
    	System.out.print("Sum :"+ sum + ":");
    }
}


