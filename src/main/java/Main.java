import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
//Stwórz listę Integerów. Wykonaj zadania:
//        - dodaj do listy 5 elementów ze scannera
//        - dodaj do listy 5 elementów losowych
//        - wypisz elementy
//        Sprawdź działanie aplikacji.

public class Main {
    public static void main(String[] args) {

        List<Integer> listaRandom = new LinkedList<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        for (int i =  0; i<5; i++){
            listaRandom.add(scanner.nextInt());

        }
        for(int i =0; i<5; i++){
            listaRandom.add(random.nextInt(100));
        }

    }
}
