package Lab4l13;

import java.util.Scanner;

class Subscription{
    private final String planName;
    private final int durationDays;

    private static int maxDuration = 360;

    public Subscription(String planName, int durationDays){
        this.planName = planName;

        if(durationDays > maxDuration){
            this.durationDays = maxDuration;
        }
        else if(durationDays < 0){
            this.durationDays = 0;
        }
        else{
            this.durationDays = durationDays;
        }
    }

    public Subscription(Subscription other){
        this.planName = other.planName;
        this.durationDays = other.durationDays;
    }

    public static void setMaxDuration(int max){
        if (max > 0) {
            maxDuration = max ;
        }
        else{
            System.out.println("Invalid max policy") ;
        }
    }

    public Subscription extend(int days){
        if(days <= 0){
            System.out.println("Invalid extension days");
            return this ;
        }

        int newDays ;

        newDays = this.durationDays + days ;

        if(newDays > maxDuration){
            System.out.println("Extension failed: Exceeds max policy");
            return this ;
        }
        return new Subscription(this.planName, newDays);
    }

    public void displayInfo(){
        System.out.println("Plan : " + planName + ", Days : " + durationDays);
    }
}

public class Lab4l13 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Max Duration for policy: ");
        int inMaxPolicy = Getvalue.nextInt();

        Subscription.setMaxDuration(inMaxPolicy);

        Getvalue.nextLine();

        System.out.print("Enter Plan: ");
        String inPlanName = Getvalue.nextLine();

        System.out.print("How long for plan: ");
        int inDays = Getvalue.nextInt();

        Subscription sub1 = new Subscription(inPlanName, inDays);

        System.out.print("How long do you want to leave: ");
        int inExtend = Getvalue.nextInt();

        Subscription sub2 = sub1.extend(inExtend);
        if(sub2 != sub1){
            System.out.println("Extension successful");
            sub1 = sub2;
        }

        System.out.print("How long you want to Extend: ");
        int inExtend2 = Getvalue.nextInt();

        Subscription sub3 = sub1.extend(inExtend2);

        if(sub3 != sub1){
            System.out.print("Extension successful");
            sub1 = sub3;
        }

        sub1.displayInfo();

        Getvalue.close();
    }

}