package Lab3l2;

import java.util.Scanner;

class Player {
    private int score = 0;

    public Player(int initialscore){
        this.score = initialscore;
    }

    public int getScore(){
        return this.score;
    }

    public void setScore(int newScore){
        this.score = newScore;
    }
}

public class Lab3l2 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Your Score: ");
        int inputScore = Getvalue.nextInt();

        System.out.print("Enter Your add Score: ");
        int inputaddScore = Getvalue.nextInt();

        Player NScore = new Player(inputaddScore);

        System.out.println("------------------------------");
        System.out.println(NScore.getScore());

        Getvalue.close();
    }
}
