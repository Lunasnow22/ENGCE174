package Lab2l11;

import java.util.Scanner;

class Car{
    String model;
    int year;

    public Car(String model, int year){
        this.model = model;
        this.year = year;
    }

    public String getmodel(){
        return model;
    }

    public int getyear(){
        return year;
    }

    public void setyear(int newyear){
        this.year = newyear;
    }
}

public class Lab2l11 {
    public static void main(String[] arme){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Your Car Model : ");
        String addmodel = Getvalue.nextLine();

        System.out.print("Enter Year of Your Car : ");
        int addyear = Getvalue.nextInt();

        System.out.print("Enter New Year of Your Car : ");
        int addNewyear = Getvalue.nextInt();

        Car newCar = new Car(addmodel, addyear);

        newCar.setyear(addNewyear);

        System.out.println("Model : "+ newCar.getmodel());
        System.out.println("Year : "+ newCar.getyear());

        Getvalue.close();
    }
}
