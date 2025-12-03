package Lab1l12;

import java.util.Scanner;

public class Lab1l12 {
    public static void main(String[] Lunasnow) {
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter the number (N): ");
        int N = Getvalue.nextInt();

        int[] productIDs = new int[N];
        int[] stockQuantities = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("ID for item " + (i + 1) + ": ");
            productIDs[i] = Getvalue.nextInt();

            System.out.print("Stock Quantity for item " + (i + 1) + ": ");
            stockQuantities[i] = Getvalue.nextInt();
        }

        System.out.print("\nEnter the Product ID: ");
        int searchID = Getvalue.nextInt();
        
        Getvalue.close();

        boolean found = false;
        for (int i = 0; i < N; i++) {
            if (productIDs[i] == searchID) {

                System.out.println("Stock Quantity for Product " + searchID + ": " + stockQuantities[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product " + searchID + " not found");
        }
    }
}
