import java.util.Scanner;
import java.util.Random;

public class Zadanie04 {
    public static int ADD(int zmienna1,int zmienna2){
        int ADD= zmienna1+zmienna2;
        return ADD;
    }
    public static int SUB(int zmienna1,int zmienna2){
        int SUB= zmienna1-zmienna2;
        return SUB;
    }
    public static int DIV(int zmienna1,int zmienna2){
        int DIV= zmienna1/zmienna2;
        return DIV;
    }
    public static int MUL(int zmienna1,int zmienna2){
        int MUL= zmienna1*zmienna2;
        return MUL;
    }
    public static double roundDec(double value) {
        return Math.round(value * 100.0) / 100.0;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();

//zadanie1

        System.out.println("Czy pada deszcz?");
        boolean czyPada=scan.nextBoolean();
        System.out.println("Czy świeci słońce?");
        boolean czySwieciSlonce=scan.nextBoolean();
        if(czyPada==true && czySwieciSlonce==false){
            System.out.println("Jest plucha.");
        } else if(czyPada==true && czySwieciSlonce==true){
            System.out.println("Jest tęcza na niebie.");
        } else if(czyPada==false && czySwieciSlonce==true){
            System.out.println("Jest słonecznie.");
        } else if(czyPada==false && czySwieciSlonce==false){
            System.out.println("Jest pochmurno.");
        }

//zadanie4

        System.out.println("Wprowadź dwie zmienne:");
        int zmienna1= scan.nextInt();
        int zmienna2= scan.nextInt();
        System.out.println("Wybierz polecenie z pośród: ADD,SUB,DIV,MUL");
        String polecenie= scan.next();
        if(polecenie.equals("ADD")){
            System.out.println(ADD(zmienna1,zmienna2));
        } else if(polecenie.equals("SUB")){
            System.out.println(SUB(zmienna1,zmienna2));
        } else if(polecenie.equals("DIV")){
            System.out.println(DIV(zmienna1,zmienna2));
        } else if(polecenie.equals("MUL")){
            System.out.println(MUL(zmienna1,zmienna2));
        } else{
            System.out.println("Nieprawidłowe polecenie!");
        }

        //zadanie5


        //zadanie6

        System.out.println("Wprowadż 2 liczby rzeczywiste i naciśnij ENTER po każdej z nich:");
        double a= scan.nextDouble();
        double b= scan.nextDouble();
        if(a>b) {
            a = a - b;
            b = b + a;
            a = b - a;
        }
        System.out.println(("Wybrany przedział to: ["+a+", "+b+"]"));
        double d1,d2,d3;
        System.out.println("Wartości wygenerowane losowo to:");
        d1= roundDec(r.nextDouble(b-a)+a);
        System.out.println(d1);
        d2= roundDec(r.nextDouble(b-a)+a);
        System.out.println(d2);
        d3= roundDec(r.nextDouble(b-a)+a);
        System.out.println(d3);

        if(d1<d2 && d2<d3){
            System.out.println("Gdzie:"+d1+"< "+d2+"< "+d3);
        } else if(d1<d3 && d3<d2){
            System.out.println("Gdzie:"+d1+"< "+d3+"< "+d2);

        } else if(d2<d1 && d1<d3){
            System.out.println("Gdzie:"+d2+"< "+d1+"< "+d3);

        } else if(d2<d3 && d3<d1){
            System.out.println("Gdzie:"+d2+"< "+d3+"< "+d1);

        } else if(d3<d2 && d2<d1){
            System.out.println("Gdzie:"+d3+"< "+d2+"< "+d1);

        }else if(d3<d1 && d1<d2){
            System.out.println("Gdzie:"+d3+"< "+d1+"< "+d2);

        }

        //zadanie8
        System.out.println("Witaj w kantorze!");
        System.out.println("Wybierz walutę:");
        System.out.println("      1 - PLN");
        System.out.println("      2 - USD");
        int waluta= scan.nextInt();
        if(waluta==1){
            System.out.println("Wprowadź kwotę:");
            double kwota= scan.nextDouble();
            System.out.println(kwota+" zł => "+ roundDec((kwota/4.5367))+" $");
        } else if(waluta==2){
            System.out.println("Wprowadź kwotę:");
            double kwota= scan.nextDouble();
            System.out.println(kwota+" $ => "+ roundDec((kwota*4.5367))+" zł");
        } else if (waluta!=1 && waluta!=2){
            System.out.println("Nie mamy takiej waluty");
        }

    }
}
