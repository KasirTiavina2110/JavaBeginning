package pkgLaboratoire3;

import java.util.Arrays;
import java.util.Objects;

public class Etudiant {
    private static final int[] PONDERATIONS_PAR_DEFAUT = { 20, 30, 50 };

    private int numeroEtudiant;
    private String nom;
    private String prenom;
    private CIDate dateNaissance;
    private int[] notes = new int[3];

    // Variables de classe
    private String cours;
    private static int[] ponderations = PONDERATIONS_PAR_DEFAUT;

    // Constructeurs
    public Etudiant() {
        try {
            this.numeroEtudiant = -1;
            this.nom = "";
            this.prenom = "";
            this.dateNaissance = new CIDate();
            this.notes = new int[] { -1, -1, -1 }; // -1 indique des notes manquantes
            this.cours = "POO";
        } catch (Exception e) {
            System.out.println("Erreur lors de la création de l'étudiant : " + e.getMessage());
        } finally {
            System.out.println("Création de l'étudiant terminée.");
        }
    }

    public Etudiant(int numeroEtudiant, String nom, String prenom, CIDate dateNaissance, int[] notes, String cours) {
        try {
            this.numeroEtudiant = numeroEtudiant;
            this.nom = nom;
            this.prenom = prenom;
            this.dateNaissance = dateNaissance;
            this.setNotes(notes);
            this.cours = cours;
        } catch (Exception e) {
            System.out.println("Erreur lors de la création de l'étudiant parametre: " + e.getMessage());
        } finally {
            System.out.println("Création de l'étudiant terminée.");
        }
    }

    // Accesseurs (getters et setters)
    public int getNumeroEtudiant() {
        return numeroEtudiant;
    }

    public void setNumeroEtudiant(int numeroEtudiant) {
        this.numeroEtudiant = numeroEtudiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public CIDate getDateNaissance() {
        return dateNaissance;
    }

    public String getCours() {
        return cours;
    }

    public void setDateNaissance(CIDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int[] getNotes() {
        return Arrays.copyOf(notes, notes.length);
    }

    public void setNotes(int[] notes) {
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] < 0 || notes[i] > 100) {
                System.out.println(
                        "Note invalide pour l'indice " + i + ". La note est réinitialisée à la valeur par défaut.");
                this.notes[i] = -1;
            } else {
                this.notes[i] = notes[i];
            }
        }
    }

    public void setCours(String cours) {
        this.cours = cours;
    }

    public static int[] getPonderations() {
        return Arrays.copyOf(ponderations, ponderations.length);
    }

    public static void setPonderations(int[] ponderations) {
        if (isValidPonderations(ponderations)) {
            Etudiant.ponderations = Arrays.copyOf(ponderations, ponderations.length);
        } else {
            System.out.println("Pondérations invalides. Les pondérations sont réinitialisées à la valeur par défaut.");
            Etudiant.ponderations = Arrays.copyOf(PONDERATIONS_PAR_DEFAUT, PONDERATIONS_PAR_DEFAUT.length);
        }
    }

    // Méthodes
    public double calculerNoteFinale() {
        if (numeroEtudiant == -1) {
            System.out.println("Abandon de l'étudiant. Impossible de calculer la note finale.");
            return -1;
        }

        for (int note : notes) {
            if (note == -1) {
                System.out.println("Manque d'une ou de plusieurs notes. Impossible de calculer la note finale.");
                return -2;
            }
        }

        if (!isValidPonderations(ponderations)) {
            System.out.println("Pondérations absentes ou erronées. Impossible de calculer la note finale.");
            return -3;
        }

        double noteFinale = 0;
        for (int i = 0; i < notes.length; i++) {
            noteFinale += notes[i] * (ponderations[i] / 100.0);
        }

        return noteFinale;
    }

    public int verifierPonderations() {
        if (!isValidPonderations(ponderations)) {
            System.out.println("Pondérations absentes ou erronées.");
            return -4; // Code d'erreur pour pondérations absentes ou erronées
        }

        int totalPonderations = Arrays.stream(ponderations).sum();
        if (totalPonderations != 100) {
            System.out.println("Le total des pondérations doit être égal à 100.");
            return -5; // Code d'erreur pour total des pondérations différent de 100
        }

        return 100; // Aucune erreur, retourne 100
    }

    // Méthode privée pour vérifier si les pondérations sont valides
    private static boolean isValidPonderations(int[] ponderations) {
        if (ponderations == null || ponderations.length != 3) {
            return false; // Retourne false si les pondérations sont null ou de taille différente de 3
        }

        for (int value : ponderations) {
            if (value < 0 || value > 100) {
                return false;
            }
        }

        return true; // Retourne true si toutes les pondérations sont valides
    }

    // Equals, hashCode, et toString

    public boolean equals(Etudiant etudiant) {
        return numeroEtudiant == etudiant.getNumeroEtudiant() &&
                nom.equals(etudiant.getNom()) &&
                prenom.equals(etudiant.getPrenom()) &&
                dateNaissance.equals(etudiant.getDateNaissance()) &&
                Arrays.equals(notes, etudiant.getNotes());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(numeroEtudiant, nom, prenom, dateNaissance);
        result = 31 * result + Arrays.hashCode(notes);
        return result;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "numeroEtudiant=" + numeroEtudiant +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", notes=" + Arrays.toString(notes) +
                ",cours =" + cours +
                '}';
    }
}
