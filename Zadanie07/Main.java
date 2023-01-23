package Zadanie07;

public class Main {
    public static void main (String[] args){
        Student student1= new Student();
        student1.firstName="Maria";
        student1.lastName="Zolcik";
        student1.indexNumber="s29464";
        student1.displayInfo();


        Student student2= new Student();
        student2.firstName="Jan";
        student2.lastName="Kowalska";
        student2.indexNumber="s12345";
        student2.displayInfo();

        SecretStudent student3=new SecretStudent();
        student3.displayInfo();
        student3.setFirstName("Julia");
        student3.displayInfo();

        SecretStudent student4=new SecretStudent();
        student4.readFromScanner();
        student4.displayInfo();

        SecretStudent student5=new SecretStudent();
        student5.readFromScanner();
        student5.displayInfo();
    }
}
