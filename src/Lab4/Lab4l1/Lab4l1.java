package Lab4l1;

import java.util.Scanner;

class Book{
     private String title;
     private String author;

     public Book(String title){
        this.title = title;
        this.author = "Unknwn";
     }

     public Book(String title, String author){
        this.title = title;
        this.author = author;
     }

     public void displaylnfo(){
        System.out.print("title: "+ title +", author: "+ author);
     }
}

public class Lab4l1 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Mode: ");
        int mode = Getvalue.nextInt();

        if(mode == 1){
            Getvalue.nextLine();
            
            System.out.print("Enter title: ");
            String initile = Getvalue.nextLine();   

            Book book = new Book(initile);

            book.displaylnfo();
        }
        else if(mode == 2){
            Getvalue.nextLine();

            System.out.print("Enter title: ");
            String initile = Getvalue.nextLine();

            System.out.print("Enter author: ");
            String inauthor = Getvalue.nextLine();
            
            Book book = new Book(initile,inauthor);

            book.displaylnfo();
        }
        else{
            System.out.print("Eorror");
        }
    }    
}
