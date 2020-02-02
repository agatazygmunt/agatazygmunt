package zadanie6;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

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
public Optional<Double> obliczSrednia(){
        double sum =0.0;
        for (Double ocena:oceny){
            sum+=ocena;
        }
        if (oceny.size()>0){
            return Optional.of(sum/oceny.size());
        }return Optional.empty();
}

    public OptionalDouble obliczSrednia2() {
        return oceny.stream().mapToDouble(aDouble -> aDouble).average(); // OptionalDouble
    }
}
