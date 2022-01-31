public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */
        int i;
        System.out.println("\nBREAK on 5");
        for (i=1; i<=10; i++)
        {
            System.out.print(i+" ");
            if (i==5)
            {
                break;
            }
        }

        System.out.println("\nCONTINUE on 5");
        for (i=1; i<=10; i++)
        {
            System.out.print(i+" ");
            if (i==5)
            {
                continue;
            }
        }

        System.out.println("\nRETURN on 5");
        for (i=1; i<=10; i++)
        {
            System.out.print(i+" ");
            if (i==5)
            {
                return; //metoda void nic nie zwraca
            }
        }
    }
}
