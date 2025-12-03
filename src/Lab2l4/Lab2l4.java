package Lab2l4;

import java.util.Scanner;

class Student{
    private String name;
    private int score1;
    private int score2;

    public Student(String name, int s1, int s2){
        this.name = name;
        this.score1 = s1;
        this.score2 = s2;
    }
    public double calculateAverage(){
        double Average = ((score1 + score2) /2.0) ;
        return Average;
    }
    public void DisplaySummary(){
        System.out.println("Name : "+name);
        System.out.println("Average Score: "+calculateAverage());
        if (calculateAverage() > 50){
            System.out.print("Statu: Pass");
        }
        else{
            System.out.print("Statu: Fail");
        }
    }

}

public  class Lab2l4 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.println("Enter student Score");

        System.out.print("Enter Name : ");
        String name = Getvalue.nextLine();

        System.out.print("Enter score 1 : ");
        int score1 = Getvalue.nextInt();

        System.out.print("Enter score 2 : ");
        int score2 = Getvalue.nextInt();   
        
        Student n = new Student(name, score1, score2);

        n.DisplaySummary();
    }
}