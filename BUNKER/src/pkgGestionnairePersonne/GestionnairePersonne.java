package pkgGestionnairePersonne;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import pkgPersonnage.EmploydeMaintenance.EmployeDeMaintenance;
import pkgPersonnage.EmploydeMaintenance.Ingenieur;
import pkgPersonnage.EmploydeMaintenance.Ouvrier;
import pkgPersonnage.EmploydeMaintenance.Ouvrier.QuartDeTravail;
import pkgPersonnage.ForceDeSecurite.Armee;
import pkgPersonnage.ForceDeSecurite.ForceDeSecurite;
import pkgPersonnage.ForceDeSecurite.Milice;
import pkgPersonnage.Gestionnaire.Administrateur;
import pkgPersonnage.Gestionnaire.Gestionnaire;
import pkgPersonnage.Gestionnaire.Scientifique;
import pkgPersonnage.pkgAbstract.Personne;

public class GestionnairePersonne  implements Serializable{

    private ArrayList<Personne> personnes;

    // Déclaration et initialisation d'un tableau de matricules par défaut
   protected String[] tabMatricules = {"AM1", "AM2", "AM3", "AM4", "AM5"};
   protected String[] tabProjet = {"Projet1", "Projet2", "Projet3"};


    public GestionnairePersonne() {
        personnes = new ArrayList<Personne>();
    }

    public ArrayList<Personne> getPersonnes() {
        return personnes;
    }

    public void ajouterPersonne(Personne p) {
        personnes.add(p);
    }

    public void supprimerPersonne(Personne p) {
        personnes.remove(p);
    }

    

    // Cette méthode va désérialiser l'ArrayList d'objets Personne
    @SuppressWarnings("unchecked")
    public void chargerDuFichier(String nomFichier) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomFichier));
        personnes = (ArrayList<Personne>) ois.readObject();
        ois.close();
    }

    // Cette méthode va sérialiser l'ArrayList d'objets Personne
    public void sauvegarderDansFichier(String nomFichier) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomFichier));
        oos.writeObject(personnes);
        oos.close();
    }

     // Tableau pour stocker les données des personnes
    Personne[] personnesData = new Personne[]{
        // Employés de maintenance
        new EmployeDeMaintenance("EM1", "Martin", "Jean", "M", new GregorianCalendar(1985, 2, 10), true, "Secteur1"),
        new EmployeDeMaintenance("EM2", "Gomez", "Pablo", "M", new GregorianCalendar(1987, 6, 28), true, "Secteur2"),
        new EmployeDeMaintenance("EM3", "Johnson", "Emily", "F", new GregorianCalendar(1993, 10, 12), true, "Secteur3"),
        new EmployeDeMaintenance("EM4", "Dubois", "Sophie", "F", new GregorianCalendar(1980, 4, 5), true, "Secteur4"),
        // Forces de sécurité
        new ForceDeSecurite("FS1", "Dubois", "Marie", "F", new GregorianCalendar(1990, 8, 15), true, "Grade1", "Poste1", "Arme1", 10),
        new ForceDeSecurite("FS2", "Garcia", "Juan", "M", new GregorianCalendar(1992, 3, 15), true, "Grade2", "Poste2", "Arme2", 8),
        new ForceDeSecurite("FS3", "Lopez", "Carlos", "M", new GregorianCalendar(1986, 8, 9), true, "Grade3", "Poste3", "Arme3", 7),
        new ForceDeSecurite("FS4", "Wang", "Lin", "F", new GregorianCalendar(1997, 11, 20), true, "Grade4", "Poste4", "Arme4", 9),
        // Ouvriers
        new Ouvrier("OUV1", "Lefevre", "Sophie", "F", new GregorianCalendar(1983, 5, 20), true, "Secteur1", Ouvrier.QuartDeTravail.MATIN, "Travail1", 8),
        new Ouvrier("OUV2", "Chang", "Sophie", "F", new GregorianCalendar(1986, 10, 14), true, "Secteur2", QuartDeTravail.APRES_MIDI, "Travail2", 4),
        new Ouvrier("OUV3", "Garcia", "Carlos", "M", new GregorianCalendar(1979, 3, 28), true, "Secteur3", QuartDeTravail.SOIR, "Travail3", 5),
        new Ouvrier("OUV4", "Smith", "Alice", "F", new GregorianCalendar(1992, 8, 9), true, "Secteur4", QuartDeTravail.MATIN, "Travail4", 6),
        // Armées
        new Armee("ARM1", "Durand", "Pierre", "M", new GregorianCalendar(1978, 11, 5), true, "Grade1", "Poste1", "Arme1", 15, 8, 5, tabMatricules),
        new Armee("ARM2", "Garcia", "Maria", "F", new GregorianCalendar(1976, 12, 25), true, "Grade2", "Poste2", "Arme2", 12, 7, 3, tabMatricules),
        new Armee("ARM3", "Dubois", "Pierre", "M", new GregorianCalendar(1991, 2, 18), true, "Grade3", "Poste3", "Arme3", 10, 5, 2, tabMatricules),
        new Armee("ARM4", "Wang", "Lin", "F", new GregorianCalendar(1985, 5, 30), true, "Grade4", "Poste4", "Arme4", 8, 6, 1, tabMatricules),
        // Milice
        new Milice("MIL1", "Lopez", "Carlos", "M", new GregorianCalendar(1982, 7, 25), true, "Grade1", "Poste1", "Arme1", 6, 3),
        new Milice("MIL2", "Johnson", "John", "M", new GregorianCalendar(1980, 4, 15), true, "Grade2", "Poste2", "Arme2", 5, 2),
        new Milice("MIL3", "Chang", "Sophie", "F", new GregorianCalendar(1998, 6, 28), true, "Grade3", "Poste3", "Arme3", 6, 3),
        new Milice("MIL4", "Gomez", "Pablo", "M", new GregorianCalendar(1992, 11, 10), true, "Grade4", "Poste4", "Arme4", 4, 1),
        // Gestionnaires
        new Gestionnaire("GES1", "Garcia", "Maria", "F", new GregorianCalendar(1975, 4, 30), true, 6, "Secteur1"),
        new Gestionnaire("GES2", "Smith", "Jane", "F", new GregorianCalendar(1987, 9, 12), true, 7, "Secteur3"),
        new Gestionnaire("GES3", "Lopez", "Carlos", "M", new GregorianCalendar(1975, 3, 28), true, 8, "Secteur4"),
        new Gestionnaire("GES4", "Dubois", "Pierre", "M", new GregorianCalendar(1996, 8, 19), true, 9, "Secteur5"),
        // Scientifiques
        new Scientifique("SCI1", "Chang", "Sophie", "F", new GregorianCalendar(1988, 9, 12), true, "Secteur Recherche", 10, 5, tabProjet),
        new Scientifique("SCI2", "Wang", "Lin", "F", new GregorianCalendar(1989, 5, 20), true, "Secteur Recherche", 11, 6, tabProjet),
        new Scientifique("SCI3", "Gomez", "Maria", "F", new GregorianCalendar(1983, 11, 12), true, "Secteur Recherche", 12, 7, tabProjet),
        new Scientifique("SCI4", "Johnson", "John", "M", new GregorianCalendar(1990, 2, 8), true, "Secteur Recherche", 13, 8, tabProjet),
        
        //Administrateur
        new Administrateur("ADM1", "Smith", "John", "M", new GregorianCalendar(1980, 5, 15),true, 10, "Ressources Humaines", "Projet ABC", "Manager RH"),
        new Administrateur("ADM2", "Garcia", "Maria", "F", new GregorianCalendar(1985, 9, 20),true, 12, "Finance", "Projet XYZ", "Directeur Financier"),
        new Administrateur("ADM3", "Lee", "David", "M", new GregorianCalendar(1975, 3, 10),true, 15, "Marketing", "Projet PRM", "Directeur Marketing"),
        new Administrateur("ADM4", "Liu", "Lin", "F", new GregorianCalendar(1982, 8, 25),true, 8, "Informatique", "Projet IT", "Chef de Projet"),
    
        //Ingenieur
        new Ingenieur("ING1", "Johnson", "Michael", "M", new GregorianCalendar(1985, 7, 10),true, "Informatique", "Développement Web", new GregorianCalendar(2009, 5, 30), 6),
        new Ingenieur("ING2", "Chen", "Li", "F", new GregorianCalendar(1990, 2, 25),true, "Électronique", "Conception de circuits intégrés", new GregorianCalendar(2012, 8, 15), 7),
        new Ingenieur("ING3", "Garcia", "Carlos", "M", new GregorianCalendar(1988, 11, 5),true, "Mécanique", "Ingénierie automobile", new GregorianCalendar(2011, 4, 20), 6),
        new Ingenieur("ING4", "Liu", "Yan", "F", new GregorianCalendar(1983, 4, 15),true, "Aérospatial", "Dynamique des fluides", new GregorianCalendar(2008, 9, 10), 8)
        
    };
    // Utile si jamais on perd nos données!
    public void genererDonnees() {
        // Ajouter chaque personne au gestionnaire de personnes
    for (Personne personne : personnesData) {
        ajouterPersonne(personne);
    }   
}

// Fonction de gestoion des bases de donnees .ser et .txt
    public void chargerDonneesAutomatiquement() {
    String nomFichier = "bunker.ser";

    // Vérifier si le fichier existe
    File fichier = new File(nomFichier);
    if (fichier.exists()) {
        try {
            // Charger les données à partir du fichier
            chargerDuFichier(nomFichier);
            System.out.println("Données chargées avec succès depuis le fichier bunker.ser.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erreur lors du chargement des données depuis le fichier bunker.ser : " + e.getMessage());
        }
    } else {
        // Utiliser les données par défaut
        System.out.println("Le fichier bunker.ser n'existe pas. Utilisation des données par défaut.");
        genererDonnees();
        System.out.println("Data par defaut transferer");
    }

}
// Autres méthodes et variables de la classe omises pour la concision...

    public void ecrireListeForcesSecuriteDansFichier(List<ForceDeSecurite> forcesSecurite) {
        String nomFichier = "Forces de sécurité.txt";
        ecrireListeDansFichier(forcesSecurite, nomFichier);
    }

    public void ecrireListeGestionnairesDansFichier(List<Gestionnaire> gestionnaires) {
        String nomFichier = "Gestion.txt";
        ecrireListeDansFichier(gestionnaires, nomFichier);
    }

    public void ecrireListeEmployesMaintenanceDansFichier(List<EmployeDeMaintenance> employesMaintenance) {
        String nomFichier = "Employé de maintenance.txt";
        ecrireListeDansFichier(employesMaintenance, nomFichier);
    }

    private void ecrireListeDansFichier(List<? extends Personne> personnes, String nomFichier) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomFichier))) {
            // Écrire la première ligne avec le nom du fichier et la date de création
            writer.write("Nom du fichier : " + nomFichier + System.getProperty("line.separator"));
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            writer.write("Date de création : " + formatter.format(new Date(0)) + System.getProperty("line.separator"));
            writer.write(System.getProperty("line.separator"));

            // Écrire les données de chaque personne dans le fichier
            for (Personne personne : personnes) {
                writer.write(personne.toString() + System.getProperty("line.separator"));
            }
            System.out.println("Données écrites dans le fichier " + nomFichier + ".");
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture dans le fichier " + nomFichier + " : " + e.getMessage());
        }
    }

    public void sauvegarderDansFichierObjet() {
        String nomFichier = "bunker.ser";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomFichier))) {
            oos.writeObject(personnes);
            System.out.println("Données sauvegardées dans le fichier objet " + nomFichier + ".");
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde dans le fichier objet " + nomFichier + " : " + e.getMessage());
        }
    }

    // Méthode pour trier et écrire les listes dans les fichiers
    public void trierEtEcrireListesDansFichiers() throws IOException, ParseException {
       try{
         // Trier les listes
        trierListePersonnes();
        // Écrire les listes dans les fichiers
        ecrireListePersonnesDansFichier("Forces de sécurité.txt", filterByType(ForceDeSecurite.class));
        
        ecrireListePersonnesDansFichier("Gestion.txt", filterByType(Gestionnaire.class));
        ecrireListePersonnesDansFichier("Employé de maintenance.txt", filterByType(EmployeDeMaintenance.class));
       } catch (Exception e) {
        System.out.println("Erreur d'ecriture");
       }
        
    }

    // Méthode pour trier la liste de personnes
    private void trierListePersonnes() {
        Collections.sort(personnes, new Comparator<Personne>() {
            @Override
            public int compare(Personne p1, Personne p2) {
                int dateComparison = p1.getDateDeNaissance().compareTo(p2.getDateDeNaissance());
                if (dateComparison == 0) {
                    return p1.getNom().compareTo(p2.getNom());
                }
                return dateComparison;
            }
        });
    }

    // Méthode pour écrire une liste de personnes dans un fichier
    private void ecrireListePersonnesDansFichier(String nomFichier, List<? extends Personne> listePersonnes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomFichier))) {
            // Écrire les données dans le fichier
            for (Personne personne : listePersonnes) {
                writer.write(personne.toString() + System.getProperty("line.separator"));
            }
            System.out.println("Données écrites dans le fichier " + nomFichier + ".");
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture dans le fichier " + nomFichier + " : " + e.getMessage());
        }
    }

    // Méthode pour filtrer les personnes par type
    private <T extends Personne> List<T> filterByType(Class<T> type) {
        List<T> filteredList = new ArrayList<>();
        for (Personne personne : personnes) {
            if (type.isInstance(personne)) {
                filteredList.add(type.cast(personne));
            }
        }
        return filteredList;
    }

    public void afficherHumainsEnModeConsole() {
        // Afficher la liste des Forces de sécurité en ordre de date de naissance
        System.out.println("Forces de sécurité :");
        afficherListeTriee(filterByType(ForceDeSecurite.class));
    
        // Afficher la liste des Gestionnaires en ordre de date de naissance
        System.out.println("\nGestionnaires :");
        afficherListeTriee(filterByType(Gestionnaire.class));
    
        // Afficher la liste des Employés de maintenance en ordre de date de naissance
        System.out.println("\nEmployés de maintenance :");
        afficherListeTriee(filterByType(EmployeDeMaintenance.class));
    }
    
    // Méthode pour afficher une liste triée de personnes
    private void afficherListeTriee(List<? extends Personne> liste) {
        for (Personne personne : liste) {
            System.out.println(personne);
        }
    }
    
    public void mettreAjourStatutVital(boolean vivant) {
        for (Personne personne : personnes) {
            if (personne.isVivant() == vivant) {
                personne.setVivant(!vivant);
            }
        }
        System.out.println("Statut vital mis à jour avec succès pour les personnes vivantes : " + vivant);
    }

    
         

   
}
