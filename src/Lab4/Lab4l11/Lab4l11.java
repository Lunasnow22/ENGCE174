package Lab4l11;

import java.util.Scanner;

class Configuration{
    private final String theme;
    private final int fontSize;
    private final boolean darkMode;

    public Configuration(String theme, int fontSize, boolean darkMode){
        if(fontSize < 10){
            this.fontSize = 10;
        }
        else if(fontSize > 20){
            this.fontSize = 20;
        }
        else{
            this.fontSize = fontSize;
        }
        
        this.theme = theme;
        this.darkMode = darkMode;
    }

    public Configuration(Configuration base, Configuration user){
        this.theme = user.theme;
        this.darkMode = user.darkMode;
        this.fontSize = base.fontSize;
    }

    public void displaySettings(){
        System.out.println("Theme: "+ this.theme +" , Size: "+ this.fontSize +" , Dask: "+ this.darkMode);
    }
}

public class Lab4l11 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Theme: ");
        String inTheme = Getvalue.nextLine();

        System.out.print("Enter Font: ");
        int inFont = Getvalue.nextInt();

        System.out.print("Is this DarkMode: ");
        boolean inDarkTheme = Getvalue.nextBoolean();

        Getvalue.nextLine();

        System.out.println("-------------------------------------");

        System.out.print("Enter theme: ");
        String inUserTheme = Getvalue.nextLine();

        System.out.print("Enter Font: ");
        int inUserFont = Getvalue.nextInt();

        System.out.print("Is this DarkMode: ");
        boolean inUserDarkTheme = Getvalue.nextBoolean();

        Configuration ConfigBase = new Configuration(inTheme, inFont, inDarkTheme);
        Configuration ConfigUser = new Configuration(inTheme, inFont, inDarkTheme);

        Configuration Configbleh = new Configuration(ConfigBase, ConfigUser);

        System.out.println("-------------------------------------");

        Configbleh.displaySettings();

        Getvalue.close();
    }
}
