package Lab4l4;

import java.util.Scanner;

class Location{
    private double latiude;
    private double longitude;

    public Location(double latiude, double longitude){
        this.latiude = latiude;
        this.longitude = longitude;
    }

    public Location(Location other){
        this.latiude = other.latiude;
        this.longitude = other.longitude;
    }

    public void setLatitude(double newLat){
        this.latiude = newLat;
    }

    public void displaylnfo(){
        System.err.println("Lat: "+ latiude +", Lon: "+ longitude);
    }
}

public class Lab4l4 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Latiude: ");
        double inLatiude = Getvalue.nextDouble();

        System.out.print("Enter Longitude: ");
        double inLongitude = Getvalue.nextDouble();

        System.out.print("Enter New Latiude: ");
        double inNewLatiude = Getvalue.nextDouble();

        Location InLL = new Location(inLatiude,inLongitude);
        Location NewInLL = new Location(InLL);

        InLL.setLatitude(inNewLatiude);

        InLL.displaylnfo();
        NewInLL.displaylnfo();

        Getvalue.close();
    }
    
}
