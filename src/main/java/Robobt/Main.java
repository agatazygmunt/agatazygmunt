package Robobt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Robot robot = new Robot(); // odpowiednio stworzony

        String komenda;

        do {
            System.out.println("Podaj komendę:");
            komenda = scanner.next();

            if (komenda.equalsIgnoreCase("wlacz")) {
robot.wyłączRobota();
            } else if (komenda.equalsIgnoreCase("wylacz")) {
robot.włączRobota();
            } else if (komenda.equalsIgnoreCase("naladuj")) {
robot.naładujRobota();
            } else if (komenda.equalsIgnoreCase("porusz")) {
                System.out.println("Podaj rodzaj ruchu:");
                String ruch = scanner.next();
                RuchRobota ruchRobota = RuchRobota.valueOf(ruch.toUpperCase());
                robot.poruszRobotem(ruchRobota);
            }
        } while (!komenda.equalsIgnoreCase("quit"));
    }
}
