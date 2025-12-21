package Lab4l7;

import java.util.Scanner;

class Resource{
    private String id;

    public Resource(String id){
        this.id = id;
        System.out.println("Resonrce "+ id +" created");
    }

    public void finalize()throws Throwable{
        System.out.println("Resource "+ id +"finalized(destroyed)");
        super.finalize();
    }
}

public class Lab4l7 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.println("Enter r1: ");
        String inR1 = Getvalue.nextLine();

        System.out.println("Enter r2: ");
        String inR2 = Getvalue.nextLine();

        System.out.println("Enter r3: ");
        String inR3 = Getvalue.nextLine();
        
        Resource r1 = new Resource(inR1);
        Resource r2 = new Resource(inR2);
        Resource r3 = new Resource(inR3);

        r1 = null;
        r1 = null;

        System.gc();

        r3 = null;

        System.gc();
        
        Getvalue.close();
    }
}
