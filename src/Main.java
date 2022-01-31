import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */

        for (int i=100; i>0; i--)
        {
            if (i%5==0)
            {
                System.out.print(i+" ");
            }
        }


        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */
        System.out.println("\n");

        int[] liczby = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj 5 liczb (oddzielonych enterem):");
        for (int i=0; i<5; i++)
        {
            int x = scan.nextInt();
            liczby[i]=x;
        }

        for (int x : liczby)
        {
            System.out.print(x+11+" ");
        }
    }
}
