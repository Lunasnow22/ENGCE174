package Lab5.Lab5l14;

import java.util.Scanner;

class Shipping{
    protected String trackingId;
    protected double baseFee;

    public Shipping(String id, double baseFee){
        this.trackingId = id;
        this.baseFee = baseFee;
    }

    public double calculateTotalFee(){
        return baseFee;
    }
}

class StandardShipping extends Shipping{
    public StandardShipping(String id, double baseFee){
        super(id, baseFee);
    }

    @Override
    public double calculateTotalFee(){
        return baseFee * 1.05;
    }
}

class PremiumShipping extends Shipping{
    protected double insuranceFee;

    public PremiumShipping(String id, double baseFee, double insuranceFee){
        super(id, baseFee);
        this.insuranceFee = insuranceFee;
    }

    @Override
    public double calculateTotalFee(){
        super.calculateTotalFee();
        return baseFee + insuranceFee;
    }
}

public class Lab5l14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Standard Shipping ID: ");
        String standardId = scanner.nextLine();

        System.out.print("Enter Standard Shipping base fee: ");
        double standardBaseFee = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Premium Shipping ID: ");
        String premiumId = scanner.nextLine();

        System.out.print("Enter Premium Shipping base fee: ");
        double premiumBaseFee = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Premium Shipping insurance fee: ");
        double insuranceFee = scanner.nextDouble();
        scanner.nextLine();

        StandardShipping standardShipping = new StandardShipping(standardId, standardBaseFee);
        PremiumShipping premiumShipping = new PremiumShipping(premiumId, premiumBaseFee, insuranceFee);

        Shipping[] shipments = new Shipping[2];

        shipments[0] = standardShipping;
        shipments[1] = premiumShipping;

        System.out.println("---------------------------------------");
        
        for(Shipping s : shipments){
            System.out.println("Tracking ID: " + s.trackingId);
            System.out.println("Total Shipping Fee: " + s.calculateTotalFee());
        }
        
        scanner.close();
    }
}
