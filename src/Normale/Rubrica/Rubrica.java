package Normale.Rubrica;
import java.util.Scanner;
import java.util.ArrayList;

public class Rubrica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Contatto> contatti = new ArrayList<Contatto>();

        while (true) {
            System.out.println("Scegli un'opzione:");
            System.out.println("1. Aggiungi contatto");
            System.out.println("2. Modifica contatto");
            System.out.println("3. Elimina contatto");
            System.out.println("4. Cerca contatto");
            System.out.println("5. Visualizza tutti i contatti");
            System.out.println("6. Esci");

            int scelta = input.nextInt();
            input.nextLine();

            switch (scelta) {
                case 1:
                    aggiungiContatto(input, contatti);
                    break;
                case 2:
                    modificaContatto(input, contatti);
                    break;
                case 3:
                    eliminaContatto(input, contatti);
                    break;
                case 4:
                    cercaContatto(input, contatti);
                    break;
                case 5:
                    visualizzaContatti(contatti);
                    break;
                case 6:
                    System.out.println("Arrivederci!");
                    input.close();
                    return;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }

            System.out.println();
        }
    }

    private static void aggiungiContatto(Scanner input, ArrayList<Contatto> contatti) {
        System.out.print("Inserisci il nome: ");
        String nome = input.nextLine();

        System.out.print("Inserisci il numero di telefono: ");
        String numero = input.nextLine();

        contatti.add(new Contatto(nome, numero));

        System.out.println("Contatto aggiunto con successo.");
    }

    private static void modificaContatto(Scanner input, ArrayList<Contatto> contatti) {
        System.out.print("Inserisci il nome del contatto da modificare: ");
        String nome = input.nextLine();

        Contatto contattoDaModificare = null;
        for (Contatto contatto : contatti) {
            if (contatto.getNome().equals(nome)) {
                contattoDaModificare = contatto;
                break;
            }
        }

        if (contattoDaModificare == null) {
            System.out.println("Contatto non trovato.");
        } else {
            System.out.print("Inserisci il nuovo nome (lascia vuoto se non vuoi modificarlo): ");
            String nuovoNome = input.nextLine();
            if (!nuovoNome.isEmpty()) {
                contattoDaModificare.setNome(nuovoNome);
            }

            System.out.print("Inserisci il nuovo numero di telefono (lascia vuoto se non vuoi modificarlo): ");
            String nuovoNumero = input.nextLine();
            if (!nuovoNumero.isEmpty()) {
                contattoDaModificare.setNumero(nuovoNumero);
            }

            System.out.println("Contatto modificato con successo.");
        }
    }
    private static void cercaContatto(Scanner input, ArrayList<Contatto> contatti) {
        System.out.print("Inserisci il nome del contatto da cercare: ");
        String nome = input.nextLine();

        boolean trovato = false;
        for (Contatto contatto : contatti) {
            if (contatto.getNome().equals(nome)) {
                System.out.println("Contatto trovato:");
                System.out.println(contatto);
                trovato = true;
                break;
            }
        }

        if (!trovato) {
            System.out.println("Contatto non trovato.");
        }
    }

    private static void eliminaContatto(Scanner input, ArrayList<Contatto> contatti) {
        System.out.print("Inserisci il nome del contatto da eliminare: ");
        String nome = input.nextLine();

        Contatto contattoDaEliminare = null;
        for (Contatto contatto : contatti) {
            if (contatto.getNome().equals(nome)) {
                contattoDaEliminare = contatto;
                break;
            }
        }

        if (contattoDaEliminare == null) {
            System.out.println("Contatto non trovato.");
        } else {
            contatti.remove(contattoDaEliminare);
            System.out.println("Contatto eliminato con successo.");
        }
    }

    private static void visualizzaContatti(ArrayList<Contatto> contatti) {
        System.out.println("Elenco contatti:");
        for (Contatto contatto : contatti) {
            System.out.println(contatto);
        }
    }

}
