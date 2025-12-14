package Lab3l8;

import java.util.Scanner;

class InventoryItem{
    private String productName;
    private int stock;

    public InventoryItem(String productName, int initialStock){
        this.productName = productName;

        if(initialStock >= 0){
            this.stock = initialStock;
        }
        else{
            this.stock = 0;
        }
    }

    public String getProductName(){
        return this.productName;
    }

    public int getStock() {
        return this.stock;
    }

    public void addStock(int amount){
        if(amount > 0){
            this.stock += amount;
            System.out.println("Stock Added");
        }
        else{
            System.out.println("Invalid amount");
        }
    }

    public void sellStock(int amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
        }
        else if(amount > this.stock){
            System.out.println("Not enough stock");
        }
        else{
            this.stock -= amount;
            System.out.println("Sale successfull");
        }
    }
}

public class Lab3l8 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter product Name: ");
        String productName = Getvalue.nextLine();

        System.out.print("Enter initial stock: ");
        int initialStock = 0;
        if(Getvalue.hasNextInt()){
            initialStock = Getvalue.nextInt();
        }
        Getvalue.nextLine();

        System.out.print("Enter number of commands: ");
        int N = 0;
        if(Getvalue.hasNextInt()){
            N = Getvalue.nextInt();
        }
        Getvalue.nextLine();

        InventoryItem item = new InventoryItem(productName, initialStock);

        for(int i = 0; i < N; i++){
            System.out.println("-------------------------------------"); 
            System.out.print("Enter Command and Amount (ex: ADD/SELL 5): "); 
            String commandLine = Getvalue.nextLine().trim();

            String[] parts = commandLine.split(" ");

            if(parts.length >= 2){ 
                String command = parts[0].toUpperCase();
                int amount = 0;
                
                try{
                    amount = Integer.parseInt(parts[1]);
                }
                catch(NumberFormatException e){
                    System.out.println("Invalid amount format");
                    continue;
                }
                
                if (command.equals("ADD")) {
                    item.addStock(amount);
                }
                else if(command.equals("SELL")){ 
                    item.sellStock(amount);
                }
                else{
                    System.out.println("Unknown command");
                }
            }
            else {
                 System.out.println("Invalid command format Please specify command and amount.");
            }
        }

        System.out.println("-------------------------------------"); 
        System.out.println("Final Stock: "+ item.getStock());
        System.out.println("-------------------------------------"); 

        Getvalue.close();
    }
}
