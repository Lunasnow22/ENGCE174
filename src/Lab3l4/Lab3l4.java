package Lab3l4;

import java.util.Scanner;

class produckCount{
    private String name;

    private static int produckCount = 0;

    public produckCount(String name){
        this. name = name;
        produckCount++;
    }

    public String getName(){
        return this.name;
    }

    public static int getProduckCount(){
        return produckCount;
    }
}

public class Lab3l4 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        int N = 0;

        System.out.print("Enter numder of Produck [N]: ");

        if(Getvalue.hasNextInt()){
            N = Getvalue.nextInt();
            Getvalue.nextLine();
        }
        else{
            System.out.print("Input for [N]");
            Getvalue.close();
            return;
        }

        for(int i = 0; i < N; i++){
            System.out.print("Enter Produck Name: "+ (i + 1) +".");
            String ProduckName = Getvalue.nextLine();

            produckCount  p = new produckCount(ProduckName);
        }

        System.out.println("------------------------");

        System.out.print("products created: " + produckCount.getProduckCount());

        Getvalue.close();
    }
}
