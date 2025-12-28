package Lab5.Lab5l10;

import java.util.Scanner;

class ProjactTask{
    protected String description;
    protected int baseHours;

    public ProjactTask(String description, int baseHours){
        this.description = description;
        this.baseHours = baseHours;
    }

    public double calculateCost(){
        return baseHours * 50.0;
    }
}

class ComplexTaask extends ProjactTask{
    protected double setupFee;

    public ComplexTaask(String description, int baseHours, double setupFee){
        super(description, baseHours);
        this.setupFee = setupFee;
    }

    @Override
    public double calculateCost(){
        return (super.calculateCost() * 1.10) + setupFee;
    }
}

class SimpleTask extends ProjactTask{

    public SimpleTask(String description, int baseHours){
        super(description, baseHours);
    }

    @Override
    public double calculateCost(){
        return super.calculateCost();
    }
}

public class Lab5l10 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Complex Task Description: ");
        String complexDesc = Getvalue.nextLine();

        System.out.print("Enter Base Hours for Complex Task: ");
        int complexHours = Getvalue.nextInt();

        System.out.print("Enter Setup Fee for Complex Task: ");
        double setupFee = Getvalue.nextDouble();

        Getvalue.nextLine();

        System.out.print("Enter Simple Task Description: ");
        String simpleDesc = Getvalue.nextLine();

        System.out.print("Enter Base Hours for Simple Task: ");
        int simpleHours = Getvalue.nextInt();

        System.out.print("-------------------------\n");

        ComplexTaask complexTask = new ComplexTaask(complexDesc, complexHours, setupFee);
        SimpleTask simpleTask = new SimpleTask(simpleDesc, simpleHours);

        System.out.println("Complex Task Cost: $" + complexTask.calculateCost());
        System.out.println("Simple Task Cost: $" + simpleTask.calculateCost());
    }
}
