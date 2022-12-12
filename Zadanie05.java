import java.util.Scanner;
import java.util.Random;

public class Zadanie05 {

    //do zadania1
    public static void ciagn(int n, int i){
        if(n>0){
            for( i=0; i<n+1; i++){
                System.out.println(i);
            }
        } else if(n<0){
            for( i=0; i>n-1; i--){
                System.out.println(i);
            }
        }
    }

    //do zadania2
    public static int fibonacci(int f){
        while (f==0){
            return 0;
        }while (f==1){
            return 1;
        } while (f>1) {
            return fibonacci(f-1) + fibonacci(f-2);
        }

        return f;
    }

    //do zadania3 za 5 punktów
    public static void wzor1podstawowy(int t){
        if(t%2==0){
            for(int i=0; i<t-1; i++){
                for(int k=0; k<=i; k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else{
            for(int i=0; i<t; i++){
                for(int k=0; k<=i; k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    //do zadania3 za 8 punktów
    public static void wzor1zaawansowany(int t){
        if(t%2==0){
            for(int i=0; i<t-1; i+=2) {
                for(int j=0; j<t-i; j++) {
                    System.out.print(" ");
                }
                for(int k=0; k<=i; k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else{
            for(int i=0; i<t; i+=2) {
                for(int j=0; j<t-i; j++) {
                    System.out.print(" ");
                }
                for(int k=0; k<=i; k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    //do zadania4
    public static void wzor2(int x, int y, int z){
        if(x>=y && y>=z){
            for(int i=0; i<x; i++){
                for(int j=0; j<3; j++){
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }else if(x>=z && z>=y){
            for(int i=0; i<x; i++){
                for(int j=0; j<3; j++){
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }else if(y>=x && x>=z){
            for(int i=0; i<y; i++){
                for(int j=0; j<3; j++){
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }else if(y>=z && z>=x){
            for(int i=0; i<y; i++){
                for(int j=0; j<3; j++){
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }else if(z>=x && x>=y){
            for(int i=0; i<z; i++){
                for(int j=0; j<3; j++){
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }else if(z>=y && y>=x){
            for(int i=0; i<z; i++){
                for(int j=0; j<3; j++){
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();

//Zadanie1
 /*       System.out.println("Podaj liczbę całkowitą n: ");
        int n= scan.nextInt();
        int i=0;
        ciagn(n,i);

//Zadanie2
        System.out.println("Podaj parametr f: ");
        int f=scan.nextInt();
        System.out.print(fibonacci(f));

//Zadanie3
        System.out.println("Podaj parametr t: ");
        int t=scan.nextInt();
        wzor1podstawowy(t);
        wzor1zaawansowany(t);*/

//Zadanie4
        System.out.println("Podaj parametr x: ");
        int x=scan.nextInt();
        System.out.println("Podaj parametr y: ");
        int y=scan.nextInt();
        System.out.println("Podaj parametr z: ");
        int z=scan.nextInt();
        wzor2(x,y,z);

    }
}
