import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
//Stwórz oddzielnego maina, a w nim kolejną listę integerów. Wykonaj zadania:
//        - dodaj do listy 10 liczb losowych
//        - oblicz sumę elementów na liście (wypisz ją)
//        - oblicz średnią elementów na liście (wypisz ją)
//        - podaj medianę elementów na liście (wypisz ją) (Collections.sort( listaDoPosortowania) -
//        sortuje listę)
//        (przykład użycia Collections.sort(lista):
//        ArrayList<Integer> liczby = new ArrayList<>();
//        liczby.add(5);
//        liczby.add(10);
//        liczby.add(15);
//        Collections.sort(liczby);
//        - znajdź największy oraz najmniejszy element na liście
//        1. znajdź największy i najmniejszy element pętlą for
//        2. po znalezieniu elementu znajdź index elementu używając kolejnej pętli for
//        3. po znalezieniu elementów (największy i najmniejszy) znajdź index posługując się
//        metodą indexof
//        Sprawdź działanie aplikacji.Stwórz oddzielnego maina, a w nim kolejną listę integerów.

public class SumaSredniaMediana<lista> {
    public static void main(String[] args) {
        List<Integer> lista = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            lista.add(random.nextInt(100));
        }
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {

            suma = +lista.get(i) + suma;
        }

        System.out.println(("Suma: " + suma));
        System.out.println(("Srednia: " + suma / lista.size()));
        int min;
        int max;
        min = max = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (min > lista.get(i)) {
                min = lista.get(i);

            }
            if (max < lista.get(i)) {
                max = lista.get(i);
            }


            int minIndex;
            int maxIndex;
            maxIndex = minIndex =0;
            for (int j = 1; j < lista.size(); j++) {
                if (min == lista.get(j)) {
                    minIndex = j;

                }
                if (max == lista.get(j)) {
                    maxIndex = j;
                }

        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);


        System.out.println("MinIndex: " + minIndex);
        System.out.println("MaxIndex: " + maxIndex);




        Collections.sort(lista);
    double mediana;
        if(lista.size()%2==0)

    {

        int liczba1 = lista.get((lista.size() % 2));
        int liczba2 = lista.get((lista.size() % 2) + 1);
        mediana = (liczba1 + liczba2) / 2.0;

    } else

    {
        mediana = lista.get((lista.size() % 2) + 1);
    }
        System.out.println(("Mediana: "+mediana));

}
}}
