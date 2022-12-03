import java.util.Scanner;
import java.util.Random;

public class Zadanie04 {
    public static double ADD(double zmienna1,double zmienna2){
        double ADD= zmienna1+zmienna2;
        return ADD;
    }
    public static double SUB(double zmienna1,double zmienna2){
        double SUB= zmienna1-zmienna2;
        return SUB;
    }
    public static double DIV(double zmienna1,double zmienna2){
        double DIV= zmienna1/zmienna2;
        return DIV;
    }
    public static double MUL(double zmienna1,double zmienna2){
        double MUL= zmienna1*zmienna2;
        return MUL;
    }
    public static double roundDec(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    public static double absoluteValue(double zmienna){
        if (zmienna<0){
            zmienna=(-1)*zmienna;
        }
        return zmienna;
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
        double zmienna1= scan.nextDouble();
        double zmienna2= scan.nextDouble();
        System.out.println("Wybierz polecenie z pośród: ADD,SUB,DIV,MUL");
        String polecenie= scan.next();
        switch (polecenie){
            case "ADD":
                System.out.println("Wynik: "+ (int)ADD(zmienna1,zmienna2));
                break;
            case "SUB":
                System.out.println("Wynik: "+ (int)SUB(zmienna1,zmienna2));
                break;
            case "DIV":
                System.out.println("Wynik: "+ (int)DIV(zmienna1,zmienna2));
                break;
            case "MUL":
                System.out.println("Wynik: "+ (int)MUL(zmienna1,zmienna2));
                break;
            default:
                System.out.println("Nieprawidłowe polecenie!");
        }

        //zadanie5
        System.out.println("Wprowadź dwie zmienne:");
        double zmienna3= scan.nextDouble();
        double zmienna4= scan.nextDouble();
        System.out.println("Wybierz polecenie z pośród: ADD,SUB,DIV,MUL");
        String polecenie2= scan.next();
        switch (polecenie2){
            case "ADD":
                System.out.println("Wynik: "+ (int)ADD(absoluteValue(zmienna3),absoluteValue(zmienna4)));
                break;
            case "SUB":
                System.out.println("Wynik: "+ (int)SUB(absoluteValue(zmienna3),absoluteValue(zmienna4)));
                break;
            case "DIV":
                System.out.println("Wynik: "+ (int)DIV(absoluteValue(zmienna3),absoluteValue(zmienna4)));
                break;
            case "MUL":
                System.out.println("Wynik: "+ (int)MUL(absoluteValue(zmienna3),absoluteValue(zmienna4)));
                break;
            default:
                System.out.println("Nieprawidłowe polecenie!");
        }

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
