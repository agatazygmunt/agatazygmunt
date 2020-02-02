package Plec;

import java.util.Scanner;

//1. Stwórz enum Płeć która posiada wartości: KOBIETA, MĘŻCZYZNA
//        Stwórz klasę Obywatel która posiada pola:
//        Płeć
//        Imie
//        Nazwisko
//        Pesel
//        - Stwórz Maina w formie 'formularza' w którym zadajemy użytkownikowi pytania o jego dane (imie, nazwisko, pesel, płeć).
//        - Zaimplementuj w klasie Obywatel metodę toString.
//        - Stwórz main’a, w mainie stwórz obiekt Obywatel (Użytkownik podaje informacje o sobie i po podaniu wszystkich wartości tworzymy nowy obiekt typu "Obywatel".)
//        i pozwól użytkownikowi wpisać wszystkie dane (przemyśl jak zrobić pytanie o płeć).
//        Po stworzeniu obiektu wypisz go na ekran.
public class GenderMain {
    public static void main(String[] args) {
        System.out.println("Podaj imie: ");
        Scanner scanner = new Scanner(System.in);
        String nameX = scanner.next();
        System.out.println("Podaj nazwisko: ");
        String surnameX = scanner.next();
        System.out.println("Podaj pesel: ");
        long peselX = scanner.nextLong();
        System.out.println("Podaj plec: ");
        String scannerGender = scanner.next();
        Gender genderWyninkX = Gender.valueOf(scannerGender.trim().toUpperCase());
        System.out.println(new Citizen(genderWyninkX,nameX,surnameX,peselX));
    }
}
//    public static Long pobierzLong(String tresc, int dlugosc) {
//        Scanner scanner = new Scanner(System.in);
//        Long wartosc = null;
//        do {
//            System.out.println(tresc);
//            try {
//                wartosc = scanner.nextLong();
//                if (String.valueOf(wartosc).length() < dlugosc) {
//                    throw new InputMismatchException("Wrong length");
//                }
//            } catch (InputMismatchException ime) {
//                if(ime.getMessage() == null){
//                    String bledneSlowo = scanner.next(); // skip wrong token
//                    System.out.println("Twoja błędna treść brzmi: " + bledneSlowo);
//                }
//                wartosc = null;
//                System.out.println("Try again, length(" + dlugosc + "):");
//            }
//        } while (wartosc == null);
//        scanner.close();
//        return wartosc;
