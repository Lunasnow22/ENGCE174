package Lab2l9;

import java.util.Scanner;

class Address {
    private String Street;
    private String City;
    private String ZipCode;

    public Address(String Street ,String City ,String ZipCode){
        this.Street = Street;
        this.City = City;
        this.ZipCode = ZipCode;
    }
    
    public String getFullAddress(){
        return this.Street +" ,"+this.City + " ,"+ this.ZipCode;
    }
}

class Student {
    String name;
    Address address;

    public Student(String name ,Address address){
        this.name = name;
        this.address = address;
    }

    public void displayProfile(){
        System.out.println("Name : "+ this.name);
        System.out.print("Address : "+ this.address.getFullAddress());
    }
}

public class Lab2l9 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String addname = Getvalue.nextLine();

        System.out.print("Enter Street : ");
        String addStreet = Getvalue.nextLine();

        System.out.print("Enter City : ");
        String addCity = Getvalue.nextLine();

        System.out.print("Enter ZipCode : ");
        String addZipCode = Getvalue.nextLine();

        Address A = new Address(addStreet, addCity, addZipCode);

        Student S = new Student(addname, A);
        
        S.displayProfile();

    }
}
