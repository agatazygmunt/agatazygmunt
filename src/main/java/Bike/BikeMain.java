package Bike;

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
public class BikeMain {

    public static void main(String[] args) {


    Bike bike1 = new Bike();
    Bike bike2 = new Bike();
    Bike bike3 = new Bike();

       Bike [] tab = {bike1,bike2,bike3};

        System.out.println(tab.toString());

}

}
