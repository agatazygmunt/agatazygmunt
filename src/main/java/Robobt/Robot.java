package Robobt;
//3. Stwórz enum RuchRobota która posiada wartości:
//        KROK_LEWA, KROK_PRAWA, RUCH_REKA_LEWA, RUCH_REKA_PRAWA, SKOK
//        każdy z ruchów posiada również dodatkową informację (liczbową) która reprezentuje ile % baterii robota jest potrzebne do wykonania podanego ruchu.
//        Stwórz klasę Robot która posiada pola:
//        - poziom baterii ( wartość od 0 do 100)
//        - nazwa robota
//        - czy włączony
//        stwórz metody:
//        - poruszRobotem(RuchRobota):void - ktora porusza robotem jeśli robot posiada dostateczną ilość energii (oraz odejmuje zadaną ilość energii z robota)
//        - naładujRobota():void - która zwiększa ilość % baterii do 100%
//        - włączRobota():void - włącza robota
//        - wyłączRobota():void - wyłącza robota
//        UWAGI:
//        Robot nie może się poruszać kiedy jest wyłączony!
//        Robot może być ładowany tylko gdy jest wyłączony!
//        Dodaj obsługę komend:
//        ruch RUCH
//        naladuj
//        wlacz
//        wylacz
//        z linii poleceń w Main'ie. Komendy powinny pozwalać kontrolować “robota”. Tworzymy instancję klasy robot i wywołując “ruch REKA_LEWA” powinniśmy wywołać metodę ‘poruszRobotem’ i przekazać mu podany ruch do metody (aby robot wykonał ten ruch zgodnie z warunkami jakie są zadane (jeśli jest włączony i ma dostateczną ilość energii).
//        Tak samo wykonać komendy naładuj - wywołująca metodę ‘naładujRobota()’
//        Wpisanie w konsole quit powinno zakończyć działanie programu. Jeśli nie wpiszę quit to program powinien oczekiwać komend.

public class Robot {
    double poziomBaterii=100;
    String nazwa;
    boolean off = false;

    //    stwórz metody:
//        - poruszRobotem(RuchRobota):void - ktora porusza robotem jeśli robot posiada dostateczną ilość energii (oraz odejmuje zadaną ilość energii z robota)
//        - naładujRobota():void - która zwiększa ilość % baterii do 100%
//        - włączRobota():void - włącza robota
//        - wyłączRobota():void - wyłącza robota
    public void poruszRobotem(RuchRobota ruchRobota) {
        if (off == true && poziomBaterii >= ruchRobota.getZuzyciebterii()) {
            System.out.println("ruch zostal wykonany");
            poziomBaterii = poziomBaterii - ruchRobota.getZuzyciebterii();
            System.out.println("poziom baterii wynosi: " +poziomBaterii);
        } else {
            System.out.println("Robot jest wylaczony. Włacz go.");
        }

    }

    public void naładujRobota() {
        if (off==false) {
            poziomBaterii = 100;
            System.out.println("Robot naladowany do 100%");
        }else {
            System.out.println("Aby naladowac wylacz robota");
        }

    }

    public void włączRobota() {
        if (off == false) {
            off = true;
            System.out.println("Robot włączony");

        }else {
            System.out.println("Robot jest juz wylaczony");
        }

    }

    public void wyłączRobota() {
        if (off == true) {
            off = false;
            System.out.println("Robot wylaczony");

        }else {
            System.out.println("Robot jest juz wlaczony");
        }
    }


}
