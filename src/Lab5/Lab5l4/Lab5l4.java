package Lab5.Lab5l4;

import java.util.Scanner;

class Vehicle{
    protected String color;

    public Vehicle(String color){
        this.color = color;
    }
}

class Car extends Vehicle{
    protected int wheels;

    public Car(String color, int wheels){
        super(color);
        this.wheels = wheels;
    }
    public void displayDetails(){
        System.out.println("Color: " + color + ", Wheels: " + wheels);
    }
}

public class Lab5l4 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Car Color: ");
        String incolor = Getvalue.nextLine();

        System.out.print("Enter Number of Wheels: ");
        int inwheels = Getvalue.nextInt();

        System.out.print("-------------------------\n");

        Car car = new Car(incolor, inwheels);
        car.displayDetails();
    }
}
