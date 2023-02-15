package Facile;

import java.util.Scanner;

public class Trasforma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci un numero in codice binario: (ex: 1010)");
        String n = in.next();

        int numeroDecimale = Integer.parseInt(n,2);

        System.out.print(numeroDecimale);

    }
}
