package zadanie5;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Student {

        private String numerIndexu;
        private String imie;
        private String nazwisko;
        private Plec plec;

//
//    public Student() {
//        this.numerIndexu = numerIndexu;
//        this.imie = imie;
//        this.nazwisko = nazwisko;
//        this.plec = plec;
//    }


    public Student(String numerIndexu, String imie, String nazwisko, Plec plec) {
        this.numerIndexu = numerIndexu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
    }
}

