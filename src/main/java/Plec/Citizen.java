package Plec;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

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
@ToString
@Getter
@AllArgsConstructor
public class Citizen {
    Gender gender;
    String name;
    String surname;
    long pesel;
}
