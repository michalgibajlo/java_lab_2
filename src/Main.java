import java.util.*;

public class Main {

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 Napisać program który 
                a) stworzy listę ArrayList<String> (lista tablicowa),
                  Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                  elementów i elementami mają być nazwy zwierząt (niech niektóre wartości dublują się).
                  -- podpowiedź: List<String> nazwaListy = new ArrayList<>();
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                  -- podpowiedź: for(String zmienna : List<String>) { }
                c) proszę usunąć 2 ostatnie elementy listy i drugi element, następnie dodać do niej 4 inne elementy,
                  następnie wyświetlić listę i wielkość listy,
                d) proszę wyświetlić posortowną listę, oraz odwrotniee posortowaną i znów użyć metody z punktu b) do wyświetlenia
                  elementów listy

         */

        System.out.println("Zadanie 1:");
        List<String> listazwierzat = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i=1; i<6;i++)
        {
            System.out.print("Nazwa "+i+" zwierzęcia: ");
            listazwierzat.add(scan.nextLine());
        }
        for(String x : listazwierzat)
            {
                System.out.print(x+ " ");
            }
        listazwierzat.remove(4);
        listazwierzat.remove(3);
        listazwierzat.remove(1);
        listazwierzat.add("Wombat");
        listazwierzat.add("Jętka");
        listazwierzat.add("Aligator");
        listazwierzat.add("Płoć");
        System.out.println("\n"+listazwierzat+" dł."+listazwierzat.size());



         /* zad.2 Napisać program który :
                a) stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury, liczby mają się powtarzać,
                b) następnie wyświetlić zawartość set-a w konsoli,
                c) następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */

        System.out.println("\nZadanie 2");

        Set<Integer> liczby = new TreeSet<>();
        Scanner scan1 = new Scanner(System.in);
        for (int i=1; i<=10;i++)
        {
            System.out.print("Podaj "+i+" liczbę: ");
            liczby.add(scan1.nextInt());
        }
        System.out.println(liczby);
        for (Integer x:liczby)
        {
            System.out.print(x+", ");
        }


        /* zad.3* Dla chętnych (nie będzie punktowane):
                Napisać podobny program jak w zad.1 zamiast zwierząt wprowadzć dowolne dane 
                np. imiona, nazwiska, miasta, samochody ... . (dowolność),
                Wykonać na HashSet
                -- podpowiedź: Set<String> nazwaSeta = new HashSet<>();
                posortować kolekcję
                -- podpowiedź można przekonwertować dane do TreeSet albo do listy
         */

    }

}
