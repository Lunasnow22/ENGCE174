package Lab4l14;

import java.util.Scanner;

class ScoreBoard{
    private String gameName;
    private int[] scores;

    public ScoreBoard(String gameName, int[] scores){
        this.gameName = gameName;
        this.scores = scores;
    }

    public ScoreBoard(ScoreBoard other){
        this.gameName = other.gameName;
        this.scores = new int[other.scores.length];
        for(int i = 0; i < other.scores.length; i++){
            this.scores[i] = other.scores[i];
        }
    }

    public void displayScores(){
        System.out.println(gameName +": " + scores[0] + ", "+ scores[1]+", "+ scores[2]);
    }
}

public class Lab4l14{
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Game Name: ");
        String inGameName = Getvalue.nextLine();
        
        System.out.print("Enter Scores [1]: ");
        int inScore1 = Getvalue.nextInt();

        System.out.print("Enter Scores [2]: ");
        int inScore2 = Getvalue.nextInt();

        System.out.print("Enter Scores [3]: ");
        int inScore3 = Getvalue.nextInt();

        int[] scores = {inScore1, inScore2, inScore3};

        ScoreBoard SB1 = new ScoreBoard(inGameName, scores);
        ScoreBoard SB2 = new ScoreBoard(SB1);

        System.out.print("Enter Your Max Score: ");
        int inMaxScore = Getvalue.nextInt();

        scores[0] = inMaxScore;

        SB1.displayScores();
        SB2.displayScores();

        Getvalue.close();
    }
}