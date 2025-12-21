package Lab4l8;

import java.util.Scanner;

class Movie {
    private String title;
    private String director;
    private double rating;

    public Movie(String title){
        this(title, "Unknown");
    }

    public Movie(String title, String director){
        this(title, director ,0.0);
    }

    public Movie(String title, String director, double rating){
        this.title = title;
        this.director = director;

        if (rating > 10.0) {
            this.rating = 10.0;
        }
        else if(rating < 0.0){
            this.rating = 0.0;
        }
        else{
            this.rating =rating;
        }
    }

    public void displayDetails(){
        System.out.println("Title: "+ title +" Director: "+ director +" Rating: "+ rating);
    }
}   

public class Lab4l8 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Mode [1][2][3]: ");
        int mode = Getvalue.nextInt();

        Movie movie = null;

        if(mode == 1){
            Getvalue.nextLine();

            System.out.print("Enter Title: ");
            String inTitle = Getvalue.nextLine();

            Movie mode1 = new Movie(inTitle);

            mode1.displayDetails();
        }
        else if(mode == 2){
            Getvalue.nextLine();

            System.out.print("Enter Title: ");
            String inTitle = Getvalue.nextLine();

            System.out.print("Enter Director: ");
            String inDirector = Getvalue.nextLine();

            Movie mode1 = new Movie(inTitle, inDirector);

            mode1.displayDetails();
        }
        else if(mode == 3){
            Getvalue.nextLine();

            System.out.print("Enter Title: ");
            String inTitle = Getvalue.nextLine();

            System.out.print("Enter Director: ");
            String inDirector = Getvalue.nextLine();

            System.out.print("Enter Rating: ");
            double inRating = Getvalue.nextDouble();

            Movie mode1 = new Movie(inTitle, inDirector, inRating);

            mode1.displayDetails();
        }

        System.out.println("------------------------------------------------");
        
        if(movie != null){
            movie.displayDetails();
        }
        
        Getvalue.close();
    }
}
