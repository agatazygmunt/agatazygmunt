package Bike;

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
@ToString
public enum BikeType {
    ROWER(1),
    TANDEM(2);


    private int iloscMiejsc;

    BikeType(int iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
    }

    public int getIloscMiejsc() {
        return this.iloscMiejsc;
    }
}






