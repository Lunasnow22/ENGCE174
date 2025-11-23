package Lab1l10;

import java.util.Scanner;

public class Lab1l10 {
	public static double territory(double width ,double height) {
		double area = width * height;
		return area;
	}
	public static void main(String[] Lunasnow) {
		Scanner Getvalue = new Scanner(System.in);
		
		System.out.print("Get width value : ");
		double Getwidth = Getvalue.nextDouble();
		
		System.out.print("Get height value : ");
		double Getheight = Getvalue.nextDouble();
		
		Getvalue.close();
		
		double CalculateArea = territory(Getwidth ,Getheight);
		
		System.out.println("CalculateArea : "+CalculateArea);
	}
}
