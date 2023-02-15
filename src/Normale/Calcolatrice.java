package Normale;
import java.util.Scanner;

public class Calcolatrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, risultato;
        char operazione;

        System.out.println("Inserisci il primo numero:");
        num1 = input.nextDouble();

        System.out.println("Inserisci il secondo numero:");
        num2 = input.nextDouble();

        System.out.println("Scegli l'operazione da effettuare (+, -, *, /):");
        operazione = input.next().charAt(0);

        switch (operazione) {
            case '+':
                risultato = num1 + num2;
                System.out.println("Il risultato dell'addizione e': " + risultato);
                break;
            case '-':
                risultato = num1 - num2;
                System.out.println("Il risultato della sottrazione e': " + risultato);
                break;
            case '*':
                risultato = num1 * num2;
                System.out.println("Il risultato della moltiplicazione e': " + risultato);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Errore: divisione per zero.");
                } else {
                    risultato = num1 / num2;
                    System.out.println("Il risultato della divisione e': " + risultato);
                }
                break;
            default:
                System.out.println("Operazione non valida.");
        }
        input.close();
    }
    }
}
