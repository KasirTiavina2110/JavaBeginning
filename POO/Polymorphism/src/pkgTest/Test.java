package pkgTest;

import pkgPoly.Boisson;
import pkgPoly.BoissonAlcoolisee;

public class Test {
    public static void main(String[] args) {
        Boisson eau = new Boisson("eau minerale", 4);
        BoissonAlcoolisee whisky = new BoissonAlcoolisee("whisky", 7, 40);

        Boisson boisson;
        BoissonAlcoolisee boissonForte;

        Boisson boissonInconnue = null;

        // IMPORTANT -------------------------------------------------------------
        // les instructions se suivent les unes après les autres.
        // Toutes les classes sont dans le même package.
        // -----------------------------------------------------------------------
        // Quand une instruction a une erreur de compilation ou d'exécution
        // mettre cette instruction en commentaire pour continuer l'exécution.
        // -----------------------------------------------------------------------

        // INSCRIRE LE RÉSULTAT DE CHACUNE DES INSTRUCTIONS.
        // SI L'INSTRUCTION FONCTIONNE : INSCRIRE LE RÉSULTAT.
        // SI L'INSTRUCTION NE FONCTIONNE PAS : INSCRIRE LE POURQUOI.

        boisson = (Boisson) whisky;
        // Résultat : Erreur de compilation, type mismatch.

        // Correction : Utiliser les instructions suivantes pour afficher le résultat de
        // chaque instruction.
        System.out.println("boisson.getNom()= " + boisson.getNom());
        System.out.println("boisson.getDegreAlcool= " + boisson.getDegreAlcool());

        // Les instructions suivantes sont déjà correctes.
        // boissonForte = (BoissonAlcoolisee) boisson;
        // System.out.println("boissonForte.getDegreAlcool()= " +
        // boissonForte.getDegreAlcool());

        // Instructions pour connaître exactement le type de boisson.
        System.out.println("boisson.getClass().getSimpleName()= " + boisson.getClass().getSimpleName());

        // Les instructions suivantes sont déjà correctes.
        // System.out.println("boissonForte.getNom()= " + boissonForte.getNom());
        // System.out.println("boissonForte.getPrix()= " + boissonForte.getPrix());
        // System.out.println("eau.getPrix()= " + eau.getPrix());

        // On ne peut pas caster une référence null.
        // boissonForte = (BoissonAlcoolisee) boissonInconnue;
        // System.out.println("boissonForte.getPrix()= " + boissonForte.getPrix());

        // Les instructions suivantes sont déjà correctes.
        // System.out.println("----------------------------------------------");
        // eau = boisson;

        // Les instructions suivantes sont déjà correctes.
        // System.out.println(" eau.getNom()= " + eau.getNom());
        // System.out.println(" eau.getDegreAlcool()= " + eau.getDegreAlcool());

        BoissonAlcoolisee vin = new BoissonAlcoolisee("vin", 15, 22);

        // On ne peut pas assigner un objet de type Boisson à un objet de type
        // BoissonAlcoolisee.
        // vin = eau;
        // vin = (BoissonAlcoolisee) eau;

        // Les instructions suivantes sont déjà correctes.
        // System.out.println(" vin.getNom()= " + vin.getNom());
        // System.out.println(" vin.getDegreAlcool()= " + vin.getDegreAlcool());

        // Les instructions suivantes sont déjà correctes.
        // eau = vin;

        // Les instructions suivantes sont déjà correctes.
        // System.out.println("\n\n----------------------------------------------");
        // System.out.println(" vin= " + vin);
        // System.out.println(" eau= " + eau);
        // System.out.println(" boisson= " + boisson);
        // System.out.println(" whisky= " + whisky);
        // System.out.println("----------------------------------------------\n\n");

        // -------------------------------------------------------------------------
        // Les instructions suivantes sont déjà correctes.
        // vin = (BoissonAlcoolisee) eau;
        // -------------------------------------------------------------------------

        // Affecte à 2 le prix d'une bouteille d'eau.
        eau.setPrix(2);

        // Les instructions suivantes sont déjà correctes.
        // System.out.println("eau.getPrix() " + eau.getPrix());
        // System.out.println("eau.getNom() " + eau.getNom());

        // Les instructions suivantes sont déjà correctes.
        // System.out.println("\n\n----------------------------------------------");
        // System.out.println(" vin= " + vin);
        // System.out.println(" eau= " + eau);
        // System.out.println(" boisson= " + boisson);
        // System.out.println(" whisky= " + whisky);
        // System.out.println("----------------------------------------------\n\n");

        // Les instructions suivantes sont déjà correctes.
        // System.out.println("eau.getDegreAlcool= " + eau.getDegreAlcool());

        // Change le nom de whisky pour WhiskyDouble en promotion 2 pour 1.
        whisky.setNom("WhiskyDouble en promotion 2 pour 1");

        // Les instructions suivantes sont déjà correctes.
        // System.out.println("\n\n----------------------------------------------");
        // System.out.println(" vin= " + vin);
        // System.out.println(" eau= " + eau);
        // System.out.println(" boisson= " + boisson);
        // System.out.println(" whisky= " + whisky);
        // System.out.println("----------------------------------------------\n\n");

        // Les instructions suivantes sont déjà correctes.
        // System.out.println("boisson.getPrix() " + boisson.getPrix());
        // System.out.println("vin.getDegreAlcool() " + vin.getDegreAlcool());
        // System.out.println("vin.getPrix() " + vin.getPrix());

        // Terminer le programme.
        System.exit(0);
    }
}
