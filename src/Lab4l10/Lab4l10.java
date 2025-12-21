package Lab4l10;

import java.util.Scanner;

class TimePeriod{
    private int startHour;
    private int endHour;

    public TimePeriod(){
        this(9, 17);
    }

    public TimePeriod(int startHour, int endHour){
        this.startHour = startHour;
        this.endHour = endHour;
        
        if(startHour < 0){
            startHour = 0;
        }
        else if(startHour > 23){
            startHour = 23;
        }

        if(endHour < 0){
            endHour = 0;
        }
        else if(endHour > 23){
            endHour = 23;
        }

        if (startHour > endHour){
            int time = startHour;
            endHour = time;
        }
    }

    public void displayPeriod(){
        System.out.println(this.startHour+":00 - "+ this.endHour +":00");
    }
}

public class Lab4l10 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter mode [1] or [2] : ");
        int mode = Getvalue.nextInt();
        
        TimePeriod blehtime = null;

        if(mode == 1){
            blehtime = new TimePeriod();
        }
        else if(mode == 2){
            System.out.print("Enter Start Time: ");
            int instat = Getvalue.nextInt();

            System.out.print("Enter End Time: ");
            int inend = Getvalue.nextInt();

            blehtime = new TimePeriod(instat, inend);
        }
        
        if(blehtime != null){
            blehtime.displayPeriod();
        }

        Getvalue.close();
    }
}
