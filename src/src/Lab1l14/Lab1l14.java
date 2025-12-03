package Lab1l14;

import java.util.Scanner;

public class Lab1l14 {

    public static void main(String[] args) {
        Scanner Getvalue = new Scanner(System.in);

        System.out.println("To play, enter \" . \" or \" * \" such as ..* .*. according to the number of rows entered.");

        System.out.print("add number of rows (R): ");
        int R = Getvalue.nextInt();
        System.out.print("add number of columns (C): ");
        int C = Getvalue.nextInt();

        char[][] map = new char[R][C];

        System.out.println("[map] (use '*' for mine, '.' for empty space):");
        Getvalue.nextLine(); 

        for (int i = 0; i < R; i++) {
            System.out.print("Enter row " + i + " (e.g., *...): ");
            String rowInput = Getvalue.nextLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = rowInput.charAt(j);
            }
        }

        System.out.print("\nEnter target row coordinate (0 to " + (R - 1) + "): ");
        int targetR = Getvalue.nextInt();
        System.out.print("Enter target column coordinate (0 to " + (C - 1) + "): ");
        int targetC = Getvalue.nextInt();
        
        Getvalue.close();

        System.out.println("\n--- Result ---");

        if (map[targetR][targetC] == '*') {
            System.out.println("Mine");
        } else {
            int mineCount = countAdjacentMines(map, R, C, targetR, targetC);
            System.out.println(mineCount);
        }
    }

    public static int countAdjacentMines(char[][] map, int R, int C, int row, int col) {
        int count = 0;
        
        for (int deltaR = -1; deltaR <= 1; deltaR++) {
            for (int deltaC = -1; deltaC <= 1; deltaC++) {
                if (deltaR == 0 && deltaC == 0) {
                    continue;
                }

                int checkR = row + deltaR;
                int checkC = col + deltaC;

                if (checkR >= 0 && checkR < R && checkC >= 0 && checkC < C) {
                    if (map[checkR][checkC] == '*') {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
