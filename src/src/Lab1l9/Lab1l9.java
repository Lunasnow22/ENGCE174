package Lab1l9;

import java.util.Scanner;

public class Lab1l9 {
    public static void main(String[] Lunasnow) {
    	Scanner Getvalue = new Scanner(System.in);
    	
    	System.out.print("add number [N] : ");
    	int P = Getvalue.nextInt();
    	
    	int[] number1 = new int[P];
    	double sum = 0;
    	
    	for(int i = 0; i < P; i++) {
    		System.out.print("number :"+ (i + 1) +": ");
    		number1[i] = Getvalue.nextInt();
    		sum += number1[i];
    	}
    	
    	Getvalue.close();
    	
    	double answer = (double)sum / P;
    	
    	System.out.print("Sum : "+answer);
    }
}