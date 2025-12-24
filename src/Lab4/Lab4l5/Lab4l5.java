package Lab4l5;

import java.util.Scanner;

class Color {
    private int red;
    private int green;
    private int blue;

    public Color(int r, int g, int b){
        if(r < 0){r = 0;}
        else if(r >250){r = 255;}
        this.red = r;

        if(g < 0){g = 0;}
        else if(g >250){g = 255;}
        this.green = g;
        
        if(b < 0){b = 0;}
        else if(b >250){b = 255;}
        this.blue = b;   
    }

    public int getRed(){
         return red; 
    }

    public int getGreen(){ 
        return green; 
    }

    public int getBlue(){ 
        return blue; 
    }
    
    public void displayRGB(){
        System.out.println("R = "+ red +" | G = "+ green +" | B = "+ blue);
    }
}

public class Lab4l5 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter nuber color Red: ");
        int inRed = Getvalue.nextInt();

        System.out.print("Enter nuber color Green: ");
        int inGreen = Getvalue.nextInt();

        System.out.print("Enter nuber color Blue: ");
        int inBlue = Getvalue.nextInt();

        Color addColor = new Color(inRed, inGreen, inBlue);

        addColor.displayRGB();
    }
}
