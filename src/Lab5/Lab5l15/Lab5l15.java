package Lab5.Lab5l15;

import java.util.Scanner;

class RentalVehicle{
    protected String model;
    protected double rentalRate;

    public RentalVehicle(String model, double rentalRate){
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public double calculateFee(){
        return rentalRate;
    }
}

class Car extends RentalVehicle{
    public Car(String model, double rentalRate){
        super(model, rentalRate);
    }

    @Override
    public double calculateFee(){
        return rentalRate + 100.0;
    }
}

class Motorcycle extends RentalVehicle{
    public Motorcycle(String model, double rentalRate){
        super(model, rentalRate);
    }

    @Override
    public double calculateFee(){
        return rentalRate * 1.10;
    }
}

public class Lab5l15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Car model: ");
        String carModel = scanner.nextLine();

        System.out.print("Enter Car rental rate: ");
        double carRate = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Motorcycle model: ");
        String motoModel = scanner.nextLine();

        System.out.print("Enter Motorcycle rental rate: ");
        double motoRate = scanner.nextDouble();
        scanner.nextLine();

        Car car = new Car(carModel, carRate);
        Motorcycle motorcycle = new Motorcycle(motoModel, motoRate);

        double sum = car.calculateFee() + motorcycle.calculateFee();

        System.out.println("Total Rental Fee: " + sum);
    }
}
