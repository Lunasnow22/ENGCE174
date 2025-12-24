package ST2;

import java.util.Scanner;
class Subscription {

    private final String planName ;
    private final int durationDays ;

    private static int maxDuration = 365 ;

    public Subscription(String planName, int durationDays) {

        this.planName = planName ;

        if (durationDays > maxDuration) {

            this.durationDays = maxDuration ;

        }

        else if (durationDays < 0) {

            this.durationDays = 0 ;

        }

        else {

            this.durationDays = durationDays ;

        }

    }

    public Subscription(Subscription other) {

        this.planName = other.planName ;
        this.durationDays = other.durationDays ;

    }

    public static void setMaxDuration(int max) {

        if (max > 0) {
            maxDuration = max ;
        }

        else {

            System.out.println("Invalid max policy") ;

        }

    }

    public Subscription extend(int days) {

        if (days <= 0) {

            System.out.println("Invalid extension days") ;

            return this ;

        }

        int newDays ;
        newDays = this.durationDays + days ;

        if (newDays > maxDuration) {

            System.out.println("Extension failed: Exceeds max policy") ;
            return this ;

        }

        return new Subscription(this.planName, newDays) ;

    }

    public void displayInfo() {

        System.out.println("Plan : " + planName + ", Days : " + durationDays) ;

    }
    
}




public class ST2 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Ente Max Duration For Policy : ") ;
        int inputMaxPolicy = scanner.nextInt() ;

        Subscription.setMaxDuration(inputMaxPolicy) ;

        scanner.nextLine() ; 

        System.out.println("--------------------------");

        System.out.println("Enter Your Plan : ") ;
        String inputPlanName = scanner.nextLine() ;

        System.out.println("--------------------------");

        System.out.println("How Long For Your Plan : ") ; 
        int inputDays = scanner.nextInt() ;

        Subscription blehsub1 = new Subscription(inputPlanName, inputDays) ;

        System.out.println("--------------------------");

        System.out.println("How Long You Want To Extend ? : ") ;
        int inputExtend = scanner.nextInt() ;

        Subscription blehsub2 = blehsub1.extend(inputExtend) ;

        if (blehsub2 != blehsub1) {

            System.out.println("Extension successful") ;

            blehsub1 = blehsub2 ;

        }

        System.out.println("--------------------------");

        System.out.println("How Long You Want To Extend ? : ") ; 
        int inputExtend2 = scanner.nextInt() ;

        Subscription blehsub3 = blehsub1.extend(inputExtend2) ;

        if (blehsub3 != blehsub1) {

            System.out.println("Extension successful") ;

            blehsub1 = blehsub3 ;

        }

        System.out.println("----------result----------");

        blehsub1.displayInfo() ;

        scanner.close();

    }

}