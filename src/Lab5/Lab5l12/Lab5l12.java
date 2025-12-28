package Lab5.Lab5l12;

import java.util.Scanner;

class Service{
    protected String name;
    protected double basePrice;

    public Service(String name, double basePrice){
        this.name = name;
        this.basePrice = basePrice;
    }

    public double calculateFinalPrice(){
        return this.basePrice;
    }
}

class BasicService extends Service{
    public BasicService(String name, double basePrice){
        super(name, basePrice);
    }

    @Override
    public double calculateFinalPrice(){
        return basePrice * 1.05 ;
    }
}

class PremiumService extends Service{
    protected double premiumRate;

    public PremiumService(String name, double basePrice, double premiumRate){
        super(name, basePrice);
        this.premiumRate = premiumRate;
    }

    @Override
    public double calculateFinalPrice(){
        return basePrice * (1 + premiumRate);
    }
}

public class Lab5l12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Basic service name : ");
        String inBasicName = scanner.nextLine();

        System.out.print("Enter Price : ");
        double inBasicPrice = scanner.nextDouble();

        scanner.nextLine() ;

        System.out.print("Enter Premium service name : ");
        String inPremiumName = scanner.nextLine();

        System.out.print("Enter Price : ");
        double inPremiumPrice = scanner.nextDouble();

        System.out.print("Enter Rate : ");
        double inRate = scanner.nextDouble();

        System.out.println("------------------------------");

        BasicService blehBasicService = new BasicService(inBasicName, inBasicPrice) ;
        PremiumService blehPremiumService = new PremiumService(inPremiumName, inPremiumPrice, inRate) ;

        Service[] services = new Service[2];

        services[0] = blehBasicService;
        services[1] = blehPremiumService;

        for (Service s : services){
            System.out.println(s.calculateFinalPrice());
        }

        scanner.close(); 

    }
}
