public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */
/*
        int x=1000;
        do
        {
            String czyparzyste=x%35==0 ? " (Liczba "+x+" podzielna przez 35)" : "";
            System.out.println(x + czyparzyste);
        }
        while (--x > 0);
*/

        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        */

        int[] tab1 = new int[5];
        tab1[0] = 15; tab1[1] = 45; tab1[2]=13; tab1[3]=78; tab1[4]=29;
        int i=0;
        while (i<tab1.length)
                {
                    System.out.print(tab1[i]+" ");
                    i++;
                }
        //b) jak wyżej tylko dla tablicy typu double[],
        System.out.println();

        Double[] tab2 = new Double[5];
        tab2[0] = 15.0; tab2[1] = 45.0; tab2[2]=13.0; tab2[3]=78.0; tab2[4]=29.0;
        i=0;
        while (i<tab2.length)
            {
                System.out.print(tab2[i] + " ");
                i++;
            }

        //c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        System.out.println();

        String[] tab3 = new String[5];
        tab3[0] = "Ala"; tab3[1] = "ma"; tab3[2]= "kota"; tab3[3]= "i"; tab3[4]= "psa.";
        i=tab3.length-1;
        while (i>-1)
        {
            System.out.print(tab3[i] + " ");
            i--;
        }

        //zad.3


        /*
        //a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        while (true)
        {
            System.out.println("REPEAT INDEFINITELY");
        }
        */

        //b) a jak gdy damy false --> while(false)
        i=1;
        while (i<0) //przy false wyrzuca błąd "unreachable statement więc użyłem zawsze fałszywego stwierdzenia
        {
            System.out.println("NEVER HAPPENS");
            i++;
        }

    }
}
