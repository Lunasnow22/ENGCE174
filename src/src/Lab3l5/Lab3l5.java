package Lab3l5;

import java.util.Scanner;

class DatabaseConnection{
    private String connectionString ;
    private boolean connected;

    public DatabaseConnection(String connectionString){
        this.connectionString = connectionString ;
        connected = false;
    }

    public boolean isConnected(){
        return this.connected;
    }

    public void connect(){
        if(!this.connected){
            this.connected = true;
            System.out.println("--------------------------");
            System.out.println("Connected to "+ this.connectionString);
        }
        else{
            System.out.println("Already connected");
        }
    }

    public void disconnect(){
        if(this.connected){
            this.connected = false;
            System.out.println("--------------------------");
            System.out.println("Disconnected");
        }
        else{
            System.out.println("Already disconnected");
        }
    }
}

public class Lab3l5 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);
        String serverNaem = "";

        System.out.println("Enter Connection string[Server Name]");
        serverNaem = Getvalue.nextLine();

        DatabaseConnection Datab = new DatabaseConnection(serverNaem);

        Datab.connect();

        Datab.disconnect();

        Datab.disconnect();

        System.out.println(Datab.isConnected());
        System.out.print("--------------------------");

        Getvalue.close();
    }
}
