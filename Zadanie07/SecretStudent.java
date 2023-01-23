package Zadanie07;

import java.util.Scanner;

public class SecretStudent {
    Scanner scan = new Scanner(System.in);
    private String firstName = "Anna";
    private String lastName = "Nowak";
    private String indexNumber = "s54321";

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getIndexNumber(){
        return indexNumber;
    }
    public void setFirstName(String newFirstName){
        firstName=newFirstName;
    }
    public void displayInfo(){
        System.out.println(getFirstName());
        System.out.println(getLastName());
        System.out.println(getIndexNumber());
    }
    public void readFromScanner(){
        System.out.println("Napisz imię studenta:");
        firstName=scan.nextLine();
        System.out.println("Napisz nazwisko studenta:");
        lastName=scan.nextLine();
        System.out.println("Napisz numer studenta:");
        indexNumber=scan.nextLine();
    }
}
