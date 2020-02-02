package Zbiory;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//2. Napisz statyczną metodę sprawdzającą, czy w tekście nie powtarzają się litery z
//        wykorzystaniem zbioru. (boolean zawieraDuplikaty(String text))
public class zadanie2Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo:");
        String slowo = scanner.next();

        System.out.println("Zawiera duplikaty:" + zawieraDuplikaty(slowo));
    }

    public static boolean zawieraDuplikaty(String text) {
        // todo: zwróć true jeśli tak (zawiera duplikaty)


        Set<Character> characters = new HashSet<>();
        for (int j = 0; j <text.length() ; j++) {
            characters.add(text.charAt(j));
        }
return characters.size()!=text.length();


    }

}