package Lab1l11;

import java.util.Scanner;

public class Lab1l11 {
	
	public static int sumArray(int[] number1) {
		int sum = 0;
		for (int i = 0; i < number1.length; i++) {
			sum += number1[i];
		}
		return sum;
	}
	
	public static void main(String[] Lunasnow) {
		Scanner Getvalue = new Scanner(System.in);
		
		System.out.print("add number [N] : ");
		int P = Getvalue.nextInt();
		
		int[] inputArray = new int[P];
		
		for (int i = 0; i < P ; i++) {
			System.out.print("Add number :" +(i + 1)+": ");
			inputArray[i] = Getvalue.nextInt();
		}
		Getvalue.close();
		
		int totalSum = sumArray(inputArray);
		
		System.out.println("Sum : "+totalSum);
	}
}
