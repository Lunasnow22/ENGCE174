package Lab2l10;

import java.util.Scanner;

class Products {
    String nameProducts;
    double price;
    
    public Products(String nameProducts, Double price){
        this.nameProducts = nameProducts;
        this.price = price;
    }
}

class ShoppiongCart {
    Products[] item = new Products[10];

    int itemCount = 0;

    public void addProduct(Products p ){
        if(itemCount < item.length){
            item[itemCount] = p;
            itemCount++;
        }
        else{
            System.out.println("Max size is 10");
        }
    }

    public double calculateTotalPrice(){
        double sum = 0.0;
        for(int i = 0; i < itemCount; i++){
            sum += item[i].price;
        }
        return sum;
    }
}

public class Lab2l10 {
        public static void main(String[] args){
            Scanner Getvalue = new Scanner(System.in);

            int N = 0;

            System.out.print("Enter Add products : ");
            N = Getvalue.nextInt();
            
            Getvalue.nextLine();

            if(N > 10){
                System.out.print("Max size is 10");
            }
            ShoppiongCart cart = new ShoppiongCart();

            for(int i = 0; i < N; i++){
                    System.out.print("Enter name products : ");
                    String nameProducts = Getvalue.nextLine();

                    System.out.print("Enter products price : ");
                    double addprice = Getvalue.nextDouble();

                    Getvalue.nextLine();

                    Products p = new Products(nameProducts ,addprice);
                    cart.addProduct(p);
                }
                
                double lasttotal = cart.calculateTotalPrice();
                        
                System.out.print("Total Price : "+ lasttotal);  

                Getvalue.close();
        }
}
