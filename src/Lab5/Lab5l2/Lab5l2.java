package Lab5.Lab5l2;

import java.util.Scanner;

class Animal{
    protected String name;
    protected int age;

    public void makeSound(){
        System.out.println("I am an animal.");
    }

    public void displayInfo(){
        System.out.println("Name: " + name + " Age: " + age);
    }
}

class Cat extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Meow!");
    }
}

public class Lab5l2 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Cat's Name: ");
        String inname = Getvalue.nextLine();

        System.out.print("Enter Cat's Age: ");
        int inage = Getvalue.nextInt();

        System.out.print("-------------------------\n");

        Cat cat = new Cat();
        cat.name = inname;
        cat.age = inage;

        cat.displayInfo();
        cat.makeSound();
    }
}
