package Facile;

import java.util.Scanner;

public class Somma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1;
        int n2;
        int somma;

        System.out.print("Inserisci primo numero da sommare: ");
        n1 = in.nextInt();

        System.out.print("Inserisci secondo numero da sommare: ");
        n2 = in.nextInt();

        somma = n1 + n2;

        System.out.print(somma);
    }
}
