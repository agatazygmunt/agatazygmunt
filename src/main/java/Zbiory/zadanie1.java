package Zbiory;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//1. Umieść wszystkie elementy tablicy { 10 , 12 , 10 , 3 , 4 , 12 , 12 , 300 , 12 , 40 , 55 } w
//        zbiorze (HashSet) oraz:
//        Konstruktor kopiujący elementy listy do setu:
//        Set<Integer> liczby = new HashSet<>(Arrays. asList ( 1 , 2 … ));
//        a. Wypisz liczbę elementów na ekran (metoda size())
//        b. Wypisz wszystkie zbioru elementy na ekran (forEach)
//        c. Usuń elementy 10 i 12, wykonaj ponownie podpunkty a) i b)
//        d. zmień implementacje na TreeSet (zamień HashSet na TreeSet przy tworzeniu
//        instancji kolekcji)
//        2. Napisz statyczną metodę
public class zadanie1 {
    public static void main(String[] args) {
//
//    List<Integer> listaLiczb = new HashSet<>(10,12,10,3,4,12,12,300,12,40,55);
//
        Integer[] ints = {10, 12, 10, 3, 4, 12, 12, 300, 12, 40, 55};
        Set<Integer> liczby = new HashSet<>(Arrays.asList(ints));

        System.out.println("liczba elementow w zbiorze: " + liczby.size());
        for (Integer integer : liczby) {
            System.out.println(integer);

        }
        liczby.remove(10);
        liczby.remove(12);



        for (Integer integer : liczby) {
            System.out.println(integer);}


        System.out.println();


}}
