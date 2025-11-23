package Lab1l13;

import java.util.Scanner;

public class Lab1l13 {
    public static void main(String[] Lunasnow) {
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Add number of rows (R): ");
        int A = Getvalue.nextInt();
        System.out.print("Add number of columns (C): ");
        int B = Getvalue.nextInt();


        int[][] serverGrid = new int[A][B];
        int onlineCount = 0;

        System.out.println("server status (1 Online, 0 Offline) row by row:");


        for (int i = 0; i < A; i++) { 
            for (int j = 0; j < B; j++) { 
                System.out.print("Status at [" + i + "][" + j + "]: ");
                int status = Getvalue.nextInt();
                serverGrid[i][j] = status;

                if (status == 1) {
                    onlineCount++;
                }
            }
        }

        Getvalue.close();

        System.out.println("servers: " + (A * B));
        System.out.println("Online Servers: " + onlineCount);
        System.out.println("Offline Servers: " + ((A * B) - onlineCount));
    }
}
