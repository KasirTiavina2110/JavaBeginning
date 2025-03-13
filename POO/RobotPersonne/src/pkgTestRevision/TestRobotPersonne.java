package pkgTestRevision;

import javax.swing.JOptionPane;

import pkgRevision.*;

public class TestRobotPersonne {

    public static void main(String[] args) {
        
        // Créez deux robots, le premier se nommera martini et l'autre tequila.
        // Demandez à l'utilisateur de donner un nom au premier robot.
      Robot robot1 = new Robot("Nemo", new ClDate(), new ClDate());
      Robot robot2 = new Robot("Nemo232", new ClDate(), new ClDate());
      robot1.setNom(JOptionPane.showInputDialog(null, "Nommez le robot 1 svp"));
      System.out.println(robot1.getNom());

        // Créer les 4 personnes
        Personne alice = new Personne ( "Alice", 18, 100 );
        Personne benoit = new Personne ( "Benoit", 17, 50 );
        Personne mathieu = new Personne ( "Mathieu", 14, 100 );
        Personne emile = new Personne ( "Emile", 20, 80 );

        // Le premier robot sert Alice.
        // Indiquez ce que le robot répondra à Alice.
        robot1.verifierAgeMontant(alice);

        // Benoit passe au deuxième robot
        // Indiquez ce que le robot répondra à Benoit.
        robot2.verifierAgeMontant(benoit);

        // Mathieu passe au premier robot.
        // Indiquez ce que le robot répondra à Mathieu.
        robot1.verifierAgeMontant(mathieu);

        // C'est au tour d'Émile de se faire servir par le premier robot.
        // Indiquez ce que le robot répondra à Émile.
        robot1.verifierAgeMontant(emile);

        // Vu qu'Émile n'a pas assez d'argent,
        // il se retourne vers son chum qui lui donne l'argent manquant.
        // Il sera de nouveau servi mais par le premier robot.
        // Indiquez ce que le robot répondra à Émile.
        int montantmaquant = 100 - emile.getMontantArgent();
        emile.setMontantArgent(montantmaquant + emile.getMontantArgent());

        // Créez un objet de type Personne a votre prénom. Inscrivez 28 comme âge et avec 100$.
        Personne kasir = new Personne("Kasir", 28, 100);

        // Créez un autre objet de type Personne sous le nom d’ami. 
       // Personne ami = new Personne(kasir.getNom(), kasir.getAge(), kasir.);
        // L'objet ami de type Personne doit recevoir un objet de type Personne en paramètre 
        // pour prendre vos coordonnées comme donnée. Utilisez un constructeur paramétré (de copie).


        // Le robot 2 doit vérifier si ton ami peut entrer dans la boîte de nuit.


        // Inscrivez les instructions permettant de vérifier si les deux objets sont égaux ( c'est-à-dire les mêmes coordonnées ).
        // Inscrivez comme message: Ces 2 personnes sont les mêmes ou Ces 2 personnes sont différentes.
        // 1) Vérifiez pour toi et ton ami.

        // 2) Vérifiez pour toi et Benoit.


        // Vu l'achalandage des mois d'été dans cette boîte de nuit, le robot 2 a eu un nouvel horaire, 
        // il doit travailler du sixième au huitième mois.
        // Assignez ces mois pour ce robot par les méthodes appropriées.


        // Le robot 1 lui, doit travailler du mois de juin à décembre.
        // Assignez ces mois pour ce robot par les méthodes appropriées.


        // Affichez le nombre de mois que Martini travaille dans une année. Complétez l'instruction suivante :
        // System.out.println ( "Martini travaille " + … + " mois par année" );

    }

}
