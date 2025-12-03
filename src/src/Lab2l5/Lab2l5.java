package Lab2l5;

import java.util.Scanner;

class Areapackge{
    private int Width;
    private int Height;

    public Areapackge(int W1, int H2){
        this.Width = W1;
        this.Height = H2;
    }
    public double getArea(){
        double Area = (Width * Height);
        return Area;
    }
    public double getPerimeter(){
        double perimeter = 2*(Width + Height);
        return perimeter;
    }
}

public  class Lab2l5 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.println("Enter Area");

        System.out.print("Enter Width : ");
        int Width = Getvalue.nextInt();

        System.out.print("Enter Height : ");
        int Height = Getvalue.nextInt();   
        
        Areapackge n = new Areapackge(Width, Height);

        System.out.println(""+n.getArea());
        System.out.println(""+n.getPerimeter());
    }
}