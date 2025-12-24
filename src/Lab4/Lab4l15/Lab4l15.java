package Lab4l15;

import java.util.Arrays;
import java.util.Scanner;

class AuditRecord{
    private final String user;
    private final String[] logMessages;
    private static int maxMessages = 3;

    public AuditRecord(String user){
        this(user, new String[0]);
    }

    public AuditRecord(String user, String[] log){
        this.user = user;
        int size = log.length;
        if(size > maxMessages){
            size = maxMessages;

        }
        
        this.logMessages = new String[size];

        int start = log.length - size;

        for(int i = 0; i < size; i++){
            this.logMessages[i] = log[start + i];
        }
    }

    public static void setMaxMessages(int max){
        if(max > 0){
            maxMessages = max;
            System.out.println("Max messages set to "+ max);
        }
        else{
            System.out.println("Invalid max policy");
        }
    }
    
    public AuditRecord addMessage(String message){
        if(this.logMessages.length > maxMessages){
            System.out.println("Log is full");
            return this;
        }

        String[] ewlog = new String[this.logMessages.length + 1];
        for(int i = 0; i < this.logMessages.length; i++){
            ewlog[i] = this.logMessages[i];
        }
        ewlog[ewlog.length - 1] = message;

        System.out.println(message + " added");

        return new AuditRecord(this.user, ewlog);
    }

    public void displayLog(){
        System.out.println("user: " + this.user + ", Logs: "+ logMessages.length +" "+ Arrays.toString(logMessages));
    }
}

public class Lab4l15 {
    public static void main(String[] args) {
        Scanner Getvalue = new Scanner(System.in);

        if (Getvalue.hasNextInt()) {
            AuditRecord.setMaxMessages(Getvalue.nextInt());
            Getvalue.nextLine();
        }

        String inUser = Getvalue.nextLine();
        AuditRecord ar1 = new AuditRecord(inUser);

        if (Getvalue.hasNextInt()) {
            int n = Getvalue.nextInt();
            Getvalue.nextLine();

            for (int i = 0; i < n; i++) {
                if (Getvalue.hasNextLine()) {
                    String message = Getvalue.nextLine();
                    ar1 = ar1.addMessage(message);
                }
            }
        }

        ar1.displayLog();

        Getvalue.close();
    }
}
