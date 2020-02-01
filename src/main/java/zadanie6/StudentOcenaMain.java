package zadanie6;
//Stwórz aplikację, a w niej klasę Dziennik i student . Stwórz również klasę Student. Klasa
//        Student powinna:
//        - posiadać listę ocen studenta (List<Double>)
//        - posiadać (pole) numer indeksu studenta (String)
//        - posiadać (pole) imię studenta
//        - posiadać (pole) nazwisko studenta
//        Klasa Dziennik powinna:
//        - posiadać (jako pole) listę Studentów.
//        - posiadać metodę 'dodajStudenta(Student):void' do dodawania nowego studenta do
//        dziennika
//        - posiadać metodę 'usuńStudenta(Student):void' do usuwania studenta
//        - posiadać metodę 'usuńStudenta(String):void' do usuwania studenta po jego numerze
//        indexu
//        - posiadać metodę 'zwróćStudenta(String):Student' która jako parametr przyjmuje numer
//        indexu studenta, a w wyniku zwraca konkretnego studenta.
//        - posiadać metodę 'podajŚredniąStudenta(String):double' która przyjmuje indeks studenta
//        i zwraca średnią ocen studenta.
//        - posiadać metodę 'podajStudentówZagrożonych():List<Student>'
//        - posiadać metodę 'posortujStudentówPoIndeksie():List<Student>' - która sortuje listę
//        studentów po numerach indeksów, a następnie zwraca posortowaną listę.
//        Polecenia VarArgs:
//        - dodanie kilku studentów
//        - usunięcie kilku studentów
//        - wyszukiwanie studentów (i zwrócenie znalezionych w liście)
//        - dodanie/usuwanie ocen studentom
//        Wszystkie polecenia zrealizowane jako VarArgs.

import zadanie5.Plec;
import zadanie5.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentOcenaMain {
    public static void main(String[] args) {


    List<Student> listaStudentow = new ArrayList<>();
//                listaStudentow.add(new Student("126566", "Agata", "Zygmunt"));
//                listaStudentow.add(new Student("126676", "piotr", "Zygmunt"));
//                listaStudentow.add(new Student("145566", "marta", "Zygmunt"));
//                listaStudentow.add(new Student("1269836", "marcin", "Zygmunt"));

}}
