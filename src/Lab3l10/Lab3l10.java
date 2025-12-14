package Lab3l10;

import java.util.Scanner;

class SystemLogger {

    private static int currentLogLevel = 1;

    private static String getLevelName(int level) {
        switch (level) {
            case 1: return "INFO";
            case 2: return "DEBUG";
            case 3: return "ERROR";
            default: return "UNKNOWN";
        }
    }

    public static void setLogLevel(int nLevel) {
        if (nLevel >= 1 && nLevel <= 3) {
            currentLogLevel = nLevel;
            System.out.println("Log level set to " + getLevelName(nLevel));
        } else {
            System.out.println("Invalid Log Level");
        }
    }

    public static void log(int mLevel, String m) {
        if (mLevel < 1 || mLevel > 3) {
             System.out.println("Invalid log level provided: " + mLevel);
             return;
        }
        if (mLevel >= currentLogLevel) {
            System.out.println("[" + getLevelName(mLevel) + "]:" + m);
        }
    }
}

public class Lab3l10 {
    public static void main(String[] args) {
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Amount Of Your Command: ");
        int n = 0;
        if (Getvalue.hasNextInt()) {
            n = Getvalue.nextInt();
        }
        Getvalue.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Command (LOG/SET): ");

            String command = Getvalue.nextLine().trim().toUpperCase();

            if (command.equals("SET")) {
                System.out.print("Enter SET Level (1-3): ");
                if (Getvalue.hasNextInt()) {
                    int level = Getvalue.nextInt();
                    Getvalue.nextLine();
                    SystemLogger.setLogLevel(level);
                } else {
                    System.out.println("Invalid Level Input (Expected Integer).");
                    Getvalue.nextLine();
                }
            } 
            else if (command.equals("LOG")) {
                System.out.print("Enter LOG Level (1-3): ");
                int level = 0;
                if (Getvalue.hasNextInt()) {
                    level = Getvalue.nextInt();
                }
                Getvalue.nextLine();

                System.out.print("Enter LOG Message: ");
                String message = Getvalue.nextLine().trim();

                SystemLogger.log(level, message);
            } 
            else {
                System.out.println("Unknown command: " + command);
            }
        }

        Getvalue.close();
    }
}