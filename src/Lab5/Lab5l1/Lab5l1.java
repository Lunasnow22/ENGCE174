package Lab5.Lab5l1;

import java.util.Scanner;

class Animal{  
    protected String name;
    protected int age;

    public void displayInfo(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal{

    public void makeSound(){
        System.out.println("Woof!Woof!");
    }
}

public class Lab5l1 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Dog's Name: ");
        String inname = Getvalue.nextLine();

        System.out.print("Enter Dog's Age: ");
        int inage = Getvalue.nextInt();

        System.out.print("-------------------------\n");

        Dog dog = new Dog();
        dog.name = inname;
        dog.age = inage;

        dog.makeSound(); 
        dog.displayInfo();   
    }
}
