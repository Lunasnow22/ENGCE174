package Lab4l3;

import java.util.Scanner;

class Player{
    private String username;
    private int level;

    public Player(){
        username = "Guest";
        level = 1;
    }

    public Player(String username, int level){
        this.username = username;
        this.level = level;
    }

    public void displayProfile(){
        System.out.println("User: "+ username +", Level: "+ level);
    }
}

public class Lab4l3 {
    public static void main(String[] arg){
        Scanner Getvalue = new Scanner(System.in);

        Player player = null;

        System.out.print("Enter Mode: ");
        int mode = Getvalue.nextInt();

        if(mode == 1){
            player = new Player();
        }
        else if(mode == 2){
            Getvalue.nextLine();

            System.out.print("Enter Name: ");
            String inName = Getvalue.nextLine().trim();

            System.out.print("Enter Level: ");
            int inLevel = 0;
            if (Getvalue.hasNextInt()){
                inLevel = Getvalue.nextInt();
            }

            player = new Player(inName, inLevel);
        }
        else{
            System.out.println("Eorror");
        }
        Getvalue.close();

        if(player != null){
            player.displayProfile();
        }
        
    }
}
