package Lab4l2;

import java.util.Scanner;

class Produck{
    private String name;
    private double price;

    public Produck(String name){
        this.name = name;
        price = 0.0;
    }

    public Produck(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void displaylnfo(){
        System.out.print("Produck: "+ name +", Price: "+ price);
    }
}

public class Lab4l2 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter mode [1]add name or [2]add name and price: ");
        int mode = Getvalue.nextInt();

        if (mode == 1) {
            Getvalue.nextLine();

            System.out.println("--------------------------------------");

            System.out.print("Enter name produck: ");
            String inproduckname = Getvalue.nextLine();

            Produck produck = new Produck(inproduckname);

            produck.displaylnfo();
        }
        else if(mode == 2){
            Getvalue.nextLine();

            System.out.println("--------------------------------------");

            System.out.print("Enter name produck: ");
            String inproduckname = Getvalue.nextLine();

            System.out.print("Enter name produck: ");
            double inprice = Getvalue.nextDouble();

            Produck produck = new Produck(inproduckname,inprice);

            produck.displaylnfo();
        }
        else{
            System.out.print("Eorror");
        }
    }
}
