import java.util.Scanner;
import java.util.Random;

public class Zadanie06 {
    //do zadania1
    public static void tablican() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą n: ");
        int n = scan.nextInt();
        int[] tablican = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            tablican[i] = r.nextInt(101);
            System.out.print(tablican[i] + " ");
        }
    }

    public static void tablica_liczb() {
        System.out.println("Podaj liczbę elementów: ");
        Scanner scan = new Scanner(System.in);
        int rozmiar = scan.nextInt();
        int[] tablica_liczb = new int[rozmiar];
        System.out.println("Podaj elementy tablicy: ");
        for (int i = 0; i < rozmiar; i++) {
            tablica_liczb[i] = scan.nextInt();
        }
        for (int i = 0; i < tablica_liczb.length; i++) {
            System.out.print(tablica_liczb[i] + " ");
        }
    }

    //do zadania2
    public static void sortedTab() {
        System.out.println("Podaj liczbę elementów: ");
        Scanner scan = new Scanner(System.in);
        int rozmiar = scan.nextInt();
        int[] tablica_liczb = new int[rozmiar];
        System.out.println("Podaj elementy tablicy: ");
        for (int i = 0; i < rozmiar; i++) {
            tablica_liczb[i] = scan.nextInt();
        }
        for (int i = 0; i < tablica_liczb.length; i++) {
            System.out.print(tablica_liczb[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < tablica_liczb.length - 1; i++) {
            for (int j = 0; j < tablica_liczb.length - 1; j++) {
                if (tablica_liczb[j] > tablica_liczb[j + 1]) {
                    int temp = tablica_liczb[j];
                    tablica_liczb[j] = tablica_liczb[j + 1];
                    tablica_liczb[j + 1] = temp;
                }
            }
        }
        System.out.println("Posortowana tablica: ");
        for (int i = 0; i < tablica_liczb.length; i++) {
            System.out.print(tablica_liczb[i] + " ");
        }
    }

    //do zadania3
    public static void reverseTab() {
        System.out.println("Podaj liczbę elementów: ");
        Scanner scan = new Scanner(System.in);
        int rozmiar = scan.nextInt();
        int[] reverseTab = new int[rozmiar];
        System.out.println("Podaj elementy tablicy: ");
        for (int i = 0; i < rozmiar; i++) {
            reverseTab[i] = scan.nextInt();
        }
        for (int i = 0; i < reverseTab.length; i++) {
            System.out.print(reverseTab[i] + " ");
        }
        System.out.println();
        System.out.println("Odwrotna kolejność tablicy: ");
        for (int i = reverseTab.length - 1; i >= 0; i--) {
            System.out.print(reverseTab[i] + " ");
        }

    }

    //do zadania4


    public static void main(String[] args) {

        //Zadanie1
        //tablican();
        //tablica_liczb();

        //Zadanie2
        //sortedTab();

        //Zadanie3
        //reverseTab();

        //Zadanie4
    }
}
