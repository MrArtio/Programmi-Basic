package Normale.ElencoStudenti;

import java.util.ArrayList;
import java.util.Scanner;

public class ElencoStudenti {

    // Dichiarazione della classe Studente
    public static class Studente {
        private String nome;
        private int eta;

        public Studente(String nome, int eta) {
            this.nome = nome;
            this.eta = eta;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getEta() {
            return eta;
        }

        public void setEta(int eta) {
            this.eta = eta;
        }
    }

    // Metodo per aggiungere uno studente all'elenco
    public static void aggiungiStudente(ArrayList<Studente> elenco) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il nome dello studente: ");
        String nome = input.nextLine();
        System.out.print("Inserisci l'età dello studente: ");
        int eta = input.nextInt();
        elenco.add(new Studente(nome, eta));
        System.out.println("Lo studente è stato aggiunto all'elenco.");
    }

    // Metodo per modificare i dati di uno studente dell'elenco
    public static void modificaStudente(ArrayList<Studente> elenco) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il nome dello studente da modificare: ");
        String nome = input.nextLine();
        for (Studente studente : elenco) {
            if (studente.getNome().equalsIgnoreCase(nome)) {
                System.out.print("Inserisci il nuovo nome dello studente: ");
                String nuovoNome = input.nextLine();
                System.out.print("Inserisci la nuova età dello studente: ");
                int nuovaEta = input.nextInt();
                studente.setNome(nuovoNome);
                studente.setEta(nuovaEta);
                System.out.println("Lo studente è stato modificato.");
                return;
            }
        }
        System.out.println("Lo studente non è presente nell'elenco.");
    }

    // Metodo per eliminare uno studente dall'elenco
    public static void eliminaStudente(ArrayList<Studente> elenco) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il nome dello studente da eliminare: ");
        String nome = input.nextLine();
        for (Studente studente : elenco) {
            if (studente.getNome().equalsIgnoreCase(nome)) {
                elenco.remove(studente);
                System.out.println("Lo studente è stato eliminato dall'elenco.");
                return;
            }
        }
        System.out.println("Lo studente non è presente nell'elenco.");
    }

    // Metodo per visualizzare l'elenco degli studenti
    public static void visualizzaElenco(ArrayList<Studente> elenco) {
        if (elenco.isEmpty()) {
            System.out.println("L'elenco e' vuoto.");
        } else {
            System.out.println("Elenco degli studenti:");
            for (Studente s : elenco) {
                System.out.println(s);
            }
        }
    }
}
