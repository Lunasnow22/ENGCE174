package Lab5.Lab5l9;

import java.util.Scanner;

class Item{
    protected String name;

    public Item(String name){
        this.name = name;
    }

    public double getValue(){
        return 0.0;
    }
}

class PhysicaProduct extends Item{
    protected double unitPrice;
    protected int quantity;

    public PhysicaProduct(String name, double unitPrice, int quantity){
        super(name);
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    @Override
    public double getValue(){
        return unitPrice * quantity;
    }
}

class DigtalSubscription extends Item{
    protected double monthlyFee;
    protected int months;

    public DigtalSubscription(String name, double monthlyFee, int months){
        super(name);
        this.monthlyFee = monthlyFee;
        this.months = months;
    }

    @Override
    public double getValue(){
        return monthlyFee * months;
    }
}

public class Lab5l9 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Physical Product's Name: ");
        String physicalName = Getvalue.nextLine();

        System.out.print("Enter Unit Price: ");
        double unitPrice = Getvalue.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = Getvalue.nextInt();

        Getvalue.nextLine();

        System.out.print("Enter Digital Subscription's Name: ");
        String digitalName = Getvalue.nextLine();

        System.out.print("Enter Monthly Fee: ");
        double monthlyFee = Getvalue.nextDouble();

        System.out.print("Enter Number of Months: ");
        int months = Getvalue.nextInt();

        PhysicaProduct physicalProduct = new PhysicaProduct(physicalName, unitPrice, quantity);
        DigtalSubscription digitalSubscription = new DigtalSubscription(digitalName, monthlyFee, months);

        System.out.println("-------------------------");
        
        double sum = physicalProduct.getValue() + digitalSubscription.getValue();
        
        System.out.println("Total Value: " + sum);
    }
}
