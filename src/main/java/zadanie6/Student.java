package zadanie6;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import zadanie5.Plec;

import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
@Setter
public class Student {

        private String numerIndexu;
        private String imie;
        private String nazwisko;
        private List<Double> oceny;




    public Student(String numerIndexu, String imie, String nazwisko) {
        this.numerIndexu = numerIndexu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = new ArrayList<>();

    }
    public void dodajOcene (Double ocena){
        this.oceny.add(ocena);
    }

}
