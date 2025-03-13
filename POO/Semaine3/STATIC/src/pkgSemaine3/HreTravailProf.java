package pkgSemaine3;

public class HreTravailProf {
    
        public String nom;
    private int nbrHreCours;
    private static int nbrHreDispo;

    static {
        nbrHreDispo = 6;
    }

    public HreTravailProf() {
        nom = "aucun";
        nbrHreCours = 0;
    }

    public HreTravailProf(String _nom, int _nbrHreCours) {
        nom = _nom;
        nbrHreCours = _nbrHreCours;
    }

    public void setNbrHreCours(int _nbrHreCours) {
        nbrHreCours = _nbrHreCours;
    }

    public static void setNbrHreDispo(int _nbrHreDispo) {
        nbrHreDispo = _nbrHreDispo;
    }

    public int getNbrHreCours() {
        return nbrHreCours;
    }

    public static int getNbrHreDispo() {
        return nbrHreDispo;
    }

    public int nbrHreSemaine() {
        return (nbrHreCours + nbrHreDispo);
    }

    public static void ajoutNbrHreDispo() {
        nbrHreDispo = nbrHreDispo + 3;
    }

    public String toString() {
        return "nom=" + nom + " nbrHreCours=" + nbrHreCours + " nbrHreDispo= " + nbrHreDispo;
    }

}

/*En Java, le mot-clé static est utilisé pour déclarer des membres (variables ou méthodes) de classe plutôt que des membres d'instance. Voici une explication simple :

Variables statiques (membres de classe) :

Une variable statique appartient à la classe plutôt qu'à une instance particulière de la classe.
Elle est partagée entre toutes les instances de la classe.
Elle peut être accédée directement via le nom de la classe, sans avoir besoin d'instancier un objet de cette classe

public class Exemple {
    static int variableStatique = 42;
}

On peut accéder à variableStatique en utilisant Exemple.variableStatique sans créer d'objet de la classe Exemple.

Méthodes statiques :

Une méthode statique est associée à la classe plutôt qu'à une instance particulière.
Elle peut être appelée directement via le nom de la classe, sans avoir besoin d'instancier un objet de cette classe.
Elle ne peut pas accéder directement aux variables d'instance, car elle ne fait pas partie d'une instance spécifique.

public class Exemple {
    static void maMethodeStatique() {
        System.out.println("Ceci est une méthode statique");
    }
}

On peut appeler maMethodeStatique en utilisant Exemple.maMethodeStatique() sans créer d'objet de la classe Exemple.

En résumé, les membres statiques appartiennent à la classe elle-même, plutôt qu'à des instances spécifiques de cette classe. Ils sont partagés entre toutes les instances et peuvent être utilisés sans créer d'objet de la classe.









*/