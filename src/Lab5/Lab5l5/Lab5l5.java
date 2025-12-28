package Lab5.Lab5l5;

import java.util.Scanner;

class Shape{
    protected String naem;
    
    public Shape(String name){
        this.naem = name;
    }

    public double calculateArea(){
        return 0.0;
    }
}

class Circle extends Shape{
    protected double radius;

    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea(){

        return 3.14159 * radius * radius;
    }
}

class Rectangle extends Shape{
    protected double length;
    protected double height;

    public Rectangle(String name, double length, double height){
        super(name);
        this.length = length;
        this.height = height;
    }

    @Override
    public double calculateArea(){

        return length * height;
    }
}

public class Lab5l5 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double inradius = Getvalue.nextDouble();

        System.out.print("Enter Width: ");
        double inwidth = Getvalue.nextDouble();

        System.out.print("Enter Height: ");
        double inheight = Getvalue.nextDouble();

        System.out.print("-------------------------\n");

        Circle circle = new Circle(null, inradius);
        Rectangle rectangle = new Rectangle(null, inwidth, inheight);

        Shape[] shapes = new Shape[2];

        shapes[0] = circle;
        shapes[1] = rectangle;

        for(Shape shape : shapes){
            System.out.println("Area: " + shape.calculateArea());
        }

        Getvalue.close();
    }
}
