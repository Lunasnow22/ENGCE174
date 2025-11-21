package Lab1l8;
import java.util.Scanner;

public class Lab1l8 {
    public static void main(String[] args) {
    	Scanner scannerNumber = new Scanner(System.in);
    	
    	System.out.print("add number [N] : ");
    	int size = scannerNumber.nextInt();
    	
    	int[] number1 = new int[size];
    	
    	for(int i = 0; i < size; i++) {
    		System.out.print("number :"+(i+1)+": ");
    		number1[i] = scannerNumber.nextInt();
    	}
    	
    	int max = number1[0];
    	for(int i = 1; i < number1.length; i++) {
    		if(number1[i] > max) {
    		max = number1[i];
    		}
    	}
    	System.out.print("Sum : "+ max);
    	
    	scannerNumber.close();
    }
}