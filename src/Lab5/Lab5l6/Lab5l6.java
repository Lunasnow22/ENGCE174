package Lab5.Lab5l6;

import java.util.Scanner;

class Media{
    protected String title;

    public Media(String title){
        this.title = title;
    }

    public void process(){
        System.out.println("Processing media: " + title);
    }
}

class Video extends Media{
    protected int duration;

    public Video(String title, int duration){
        super(title);
        this.duration = duration;
    }

    @Override
    public void process(){
        System.out.println("Processing video: " + title + " for " + duration + " minutes.");
    }
}

class Audio extends Media{
    protected String quality;

    public Audio(String title, String quality){
        super(title);
        this.quality = quality;
    }

    @Override
    public void process(){
        System.out.println("Processing audio: " + title + " with " + quality + " quality.");
    }
}

class Processor{
    public void processMedia(Media m){
        m.process();
    }
}

public class Lab5l6 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Video Duration: ");
        if (Getvalue.hasNextInt()) {
            int inDuration = Getvalue.nextInt();

            Getvalue.nextLine();

            System.out.print("Enter Video Title: ");
            String inVideoTitle = Getvalue.nextLine();

            System.out.print("Enter Audio Title: ");
            String inAudioTitle = Getvalue.nextLine();

            System.out.print("Enter Quality: ");
            String inQuality = Getvalue.nextLine();

            Video video = new Video(inVideoTitle, inDuration);
            Audio audio = new Audio(inAudioTitle, inQuality);

            System.out.print("--------------------------\n");

            Processor processor = new Processor();
            processor.processMedia(video);
            processor.processMedia(audio);
        } else {
            String inVideoTitle = Getvalue.nextLine();

            System.out.print("Enter Video Duration: ");
            int inDuration = Getvalue.nextInt();

            Getvalue.nextLine();

            System.out.print("Enter Audio Title: ");
            String inAudioTitle = Getvalue.nextLine();

            System.out.print("Enter Quality: ");
            String inQuality = Getvalue.nextLine();

            Video video = new Video(inVideoTitle, inDuration);
            Audio audio = new Audio(inAudioTitle, inQuality);

            System.out.print("--------------------------\n");
            
            Processor processor = new Processor();
            processor.processMedia(video);
            processor.processMedia(audio);
        }

        Getvalue.close();
    }
}
