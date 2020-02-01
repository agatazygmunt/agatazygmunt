import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
//Stwórz oddzielnego maina, a w nim kolejną listę String'ów. Wykonaj zadania:
//        - dodaj do listy losowe 100 elementów z zakresu 0-100. ( konwersja int na string to
//        String.valueOf())
//        - oblicz średnią liczb
//        - usuń wszystkie liczby powyżej średniej
//        - wypisz wszystkie liczby
//        - wykonaj kopię listy do tablicy

public class LosoweStringi {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            lista.add(String.valueOf(random.nextInt(100)));
        }

        double suma = 0.0;
        for (String element : lista) {
            suma += Integer.parseInt(element);
        }
        double średnia = suma / lista.size();
        System.out.println("Średnia = " + (suma / lista.size()));


        //        Exception in thread "main" java.util.ConcurrentModificationException
        //        for (String el: lista) {
        //            if(Integer.parseInt(el) > średnia){
        //                lista.remove(el);
        //            }
        //        }
        System.out.println(lista);

        // ##### OPCJA 1
        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            String element = it.next();

            if (Integer.parseInt(element) > średnia) {
                it.remove();
            }
        }
        System.out.println(lista);

        // ##### OPCJA 2
        for (int i = 0; i < lista.size(); i++) {
            if (Integer.parseInt(lista.get(i)) > średnia) {
                lista.remove(i);
                i--;
            }
        }

        // ##### OPCJA 3
        // kopiujemy elementy do tablicy.
        // następnie iterujemy tablicę, a usuwamy z listy.
        String[] tablica = new String[lista.size()];
        tablica = lista.toArray(tablica);

        // iterujemy tablicę
        for (String str : tablica) {
            if (Integer.parseInt(str) > średnia) {
                // usuwamy z listy
                lista.remove(str);
            }
        }
    }
}