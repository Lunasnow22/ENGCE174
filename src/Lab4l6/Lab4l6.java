package Lab4l6;

import java.util.Scanner;

class Point{
    private int x;
    private int y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public Point move(int dx, int dy){
        int newX = this.x + dx;
        int newY = this.y + dy;

        return new Point(newX, newY);
    }
    
    public void displayInfo(){
        System.out.println("("+ x +", "+ y+ ")");
    }
}

public class Lab4l6 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter X: ");
        int inX = Getvalue.nextInt();

        System.out.print("Enter Y: ");
        int inY = Getvalue.nextInt();

        System.out.print("Enter dx: ");
        int inDx = Getvalue.nextInt();

        System.out.print("Enter dy: ");
        int inDy = Getvalue.nextInt();

        Point p1 = new Point(inX, inY);
        Point p2 = p1.move(inDx, inDy);
        Point p3 = p2.move(inDx, inDy);

        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();
    }
}
