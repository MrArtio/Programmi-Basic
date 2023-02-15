package Normale.ElencoStudenti;
import java.util.Scanner;
import java.util.ArrayList;

import static Normale.ElencoStudenti.ElencoStudenti.*;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<ElencoStudenti.Studente> elenco = new ArrayList<ElencoStudenti.Studente>();
        int scelta = 0;

        do {
            System.out.println("1. Aggiungi uno studente");
            System.out.println("2. Modifica uno studente");
            System.out.println("3. Elimina uno studente");
            System.out.println("4. Visualizza l'elenco degli studenti");
            System.out.println("5. Esci");
            System.out.print("Scelta: ");
            scelta = input.nextInt();
            input.nextLine(); // Consuma il carattere di fine riga lasciato dal nextInt()
            switch (scelta) {
                case 1:
                    aggiungiStudente(elenco);
                    break;
                case 2:
                    modificaStudente(elenco);
                    break;
                case 3:
                    eliminaStudente(elenco);
                    break;
                case 4:
                    visualizzaElenco(elenco);
                    break;
                case 5:
                    System.out.println("Arrivederci.");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
            System.out.println();
        } while (scelta != 5);
    }
}
