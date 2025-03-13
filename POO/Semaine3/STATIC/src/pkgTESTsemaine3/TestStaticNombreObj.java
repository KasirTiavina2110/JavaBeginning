package pkgTESTsemaine3;

import pkgSemaine3.StaticNombreObj;

public class TestStaticNombreObj {

    public static void main(String[] args) {
        // Création d'objets et affichage du nombre total d'objets

        StaticNombreObj unObjet = new StaticNombreObj();
        System.out.println("-- ProgPrinc unObjet ");

        StaticNombreObj deuxObjet = new StaticNombreObj();
        System.out.println("-- ProgPrinc deuxObjet ");

        StaticNombreObj troisObjet = new StaticNombreObj();
        System.out.println("-- ProgPrinc troisObjet ");

        System.out.println("-- ProgPrinc il y a au total " +
                StaticNombreObj.getNombreObj() + " objets ");
    }
}
