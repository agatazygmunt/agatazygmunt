package Bike;

import lombok.Getter;
import lombok.ToString;

//2. Stwórz enum TypRoweru i daj mu dwie wartości: ROWER, TANDEM.
//        a. Dodatkowo enum posiada ​ pole​ o nazwie ​ ilośćMiejsc​ . Dla enuma ROWER
//        pole ma wartość 1, dla TANDEM’u ma wartość 2.
//        b. Stwórz metodę ‘pobierzIlośćMiejsc():int’.
//        c. Stwórz klasę Rower która posiada pola:
//        ilośćPrzerzutek, typRoweru, nazwaRoweru
//        d. Stwórz metodę ‘wypiszInformacjeORowerze():void” która wypisuje informacje
//        oraz podaje/wypisuje ilość miejsc (w postaci liczby).
//        e. Stwórz main’a, w metodzie main stwórz 3 rowery, przechowaj je w tablicy i
//        wypisz je pętlą for.
@Getter
@ToString
public class Bike {

    private int iloscPrzerzutek;
    private BikeType bikeType;
    private String nameBike;

    @Override
    public String toString() {
        return "Rower{" +
                "iloscPrzerzutek=" + iloscPrzerzutek +
                ", ilosc miejsc=" + bikeType.getIloscMiejsc()+
                ", typRoweru=" + bikeType  +
                ", nazwaRoweru='" + nameBike + '\'' +
                '}';
    }
    public void wypiszInformacjeORowerze(){
        System.out.println(this);
    }}

