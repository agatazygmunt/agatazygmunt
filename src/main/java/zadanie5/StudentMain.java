package zadanie5;

import java.util.ArrayList;
import java.util.List;
//5. Stwórz klasę Student która posiada pola:
//        nr indeksu
//        imie
//        nazwisko
//        płeć (wartość enum)
//        W mainie stwórz instancję kolekcji typu ArrayList, która zawiera obiekty klasy Student.
//        Dodaj do kolekcji kilku studentów (dodaj je ręcznie - wpisz cokolwiek).
//        a. Spróbuj wypisać elementy listy stosując zwykłego "sout'a"
//        b. Spróbuj wypisać elementy stosując pętlę foreach
//        c. Wypisz tylko kobiety
//        d. Wypisz tylko mężczyzn
//        e. Wypisz tylko indeksy osób

public class StudentMain {

    public static void main(String[] args) {
        List<Student> listaStudentow = new ArrayList<>();
                listaStudentow.add(new Student("126566", "Agata", "Zygmunt", Plec.KOBIETA));
                listaStudentow.add(new Student("126676", "piotr", "Zygmunt", Plec.MEZCZYZNA));
                listaStudentow.add(new Student("145566", "marta", "Zygmunt", Plec.KOBIETA));
                listaStudentow.add(new Student("1269836", "marcin", "Zygmunt", Plec.MEZCZYZNA));

        System.out.println(listaStudentow.toString());

        for (int i = 0; i < listaStudentow.size(); i++) {
            System.out.println(listaStudentow.get(i));

        }
        System.out.println("Tylko Kobiety");
        for (int i = 0; i < listaStudentow.size(); i++) {
            if (listaStudentow.get(i).getPlec()==Plec.KOBIETA){
                System.out.println(listaStudentow.get(i));
            }

        }
        System.out.println("Tylko Mężczyźni");
        for (int j = 0; j < listaStudentow.size(); j++) {
            if (listaStudentow.get(j).getPlec()==Plec.MEZCZYZNA){
                System.out.println(listaStudentow.get(j));
            }

        }
        System.out.println("Numery indexow");
        for (int k = 0; k < listaStudentow.size(); k++) {

                System.out.println(listaStudentow.get(k).getNumerIndexu());


        }
    }


}
