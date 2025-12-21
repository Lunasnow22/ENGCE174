package Lab4l12;

import java.util.Scanner;

class Schedule{
    private int hour;

    public Schedule(int hour){
        this.hour = hour;
    }

    public void setHour(int newHour){
        this.hour = newHour;
    }

    public int getHour(){
        return hour;
    }

    public Schedule(Schedule other){

    }
}

class EmployssSchdule{
    private String name;
    private Schedule schedule;

    public EmployssSchdule(String name, Schedule schedule){
        this.name = name;
        this.schedule = schedule;
    }

    public EmployssSchdule(EmployssSchdule other){
        this.name = other.name;
        this.schedule = new Schedule(other.schedule.getHour());
    }

    public void displaySchedule(){
        System.out.println(name +" : "+ schedule.getHour() +":00");
    }
}

public class Lab4l12 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String inName = Getvalue.nextLine();

        System.out.print("Enter First Hour: ");
        int inHour = Getvalue.nextInt();

        System.out.print("Enter New Hour: ");
        int inNewHour = Getvalue.nextInt();

        Schedule SH = new Schedule(inHour);

        EmployssSchdule EMP1 = new EmployssSchdule(inName, SH);
        EmployssSchdule EMP2 = new EmployssSchdule(EMP1);

        SH.setHour(inNewHour);

        EMP1.displaySchedule();
        EMP2.displaySchedule();

        Getvalue.close();
    }
}
