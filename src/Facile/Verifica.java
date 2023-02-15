package Facile;

import java.util.Scanner;

public class Verifica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1;

        System.out.print("Inserisci un numero numero: ");
        n1 = in.nextInt();

        if (n1 % 2 == 0) {
            System.out.println("Il numero inserito è pari.");
        } else {
            System.out.println("Il numero inserito è dispari.");
        }

    }
}
