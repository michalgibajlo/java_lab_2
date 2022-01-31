import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 21,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
         */

        System.out.println("\nZadanie 1:");

        int a=0;
        int[] array = new int[20];
        for (int i : array)
        {
            array[i] = 40-a; a++;
            System.out.print(array[i]+" ");
        }


        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
         */

        System.out.println("\nZadanie 2:");

        a=0;
        String[] chain = new String[6];
        Scanner scan = new Scanner(System.in);
        for (String i : chain)
        {
            System.out.print("Wprowadź tekst "+(a+1)+": ");
            chain[a] = scan.nextLine(); a++;
        }
        a=5;
        for (String i : chain)
        {
            System.out.print(chain[a]+" "); a--;
        }

        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

        System.out.println("\nZadanie 3:");

        metoda1("Michał");
        metoda1("Michał","Gibajło");
        metoda1("Michał","Gibajło",27);

        System.out.println("\nZadanie 4:");

        int zmiennaint2 = suma2(7,9);
        System.out.println(zmiennaint2);

        int zmiennaint3 = suma3(7,9, 4);
        System.out.println(zmiennaint3);

        System.out.println("Suma: "+(suma2(7,9)+suma3(7,9, 4)));

    }

    public static void metoda1(String imie)
    {
        System.out.println(imie);
    }

    public static void metoda1(String imie, String nazwisko)
    {
        System.out.println(imie+" "+nazwisko);
    }
    public static void metoda1(String imie, String nazwisko, int wiek)
    {
        System.out.println(imie+" "+nazwisko+" "+wiek+" lat");
    }

        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */

    public static int suma2(int a, int b)
    {
        return a+b;
    }

    public static int suma3(int a, int b, int c)
    {
        return a+b+c;
    }




}
