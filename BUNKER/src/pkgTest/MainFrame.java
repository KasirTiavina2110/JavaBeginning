package pkgTest;
import javax.swing.*;

import pkgGestionnairePersonne.GestionnairePersonne;
import pkgPersonnage.pkgAbstract.Personne;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;


public class MainFrame extends JFrame {

    private JTextArea outputTextArea;
    public GestionnairePersonne gestionnaire;

    public MainFrame() {
        super("Bunker Menu");
        setSize(900, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        // Charger votre propre logo
        ImageIcon logo = new ImageIcon("img/zombi.png");

        // Appliquer le logo comme icône de la fenêtre
        setIconImage(logo.getImage());

        // Création du panneau principal avec une disposition BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Création d'un JLabel pour afficher l'image d'arrière-plan
        JLabel backgroundLabel = new JLabel(new ImageIcon("img/bunker.jpg"));
        mainPanel.add(backgroundLabel, BorderLayout.CENTER);

        // Création du panneau pour les boutons avec une disposition GridLayout
        JPanel buttonPanel = new JPanel(new GridLayout(0, 1));
        buttonPanel.setOpaque(false); // Rendre le panneau transparent

        gestionnaire = new GestionnairePersonne();
        gestionnaire.chargerDonneesAutomatiquement();

        outputTextArea = new JTextArea();
        outputTextArea.setEditable(false);
        
        JButton ajouterButton = new JButton("Ajouter un survivant");
        JButton supprimerButton = new JButton("Supprimer un survivant");
        JButton modifierButton = new JButton("Modifier un survivant");
        JButton rechercherButton = new JButton("Rechercher un survivant");
        JButton afficherTousButton = new JButton("Afficher tous les personnages");
        JButton afficherTousVivantButton = new JButton("Afficher tous les personnages vivant");
        JButton afficherConsoleButton = new JButton("Afficher en mode console");
        JButton sauvegarderButton = new JButton("Sauvegarder et quitter");

        // Ajouter des styles aux boutons
        Font buttonFont = new Font("Arial", Font.BOLD, 16);
        Color buttonTextColor = new Color(255, 255, 255); // Blanc avec opacité
        Color buttonBackgroundColor = new Color(60, 86, 91); // Bleu avec opacité
        Dimension buttonSize = new Dimension(300, 80);

        JButton[] buttons = {ajouterButton, supprimerButton, modifierButton, rechercherButton,
                             afficherTousButton, afficherTousVivantButton, afficherConsoleButton, sauvegarderButton};

        for (JButton button : buttons) {
            button.setFont(buttonFont);
            button.setForeground(buttonTextColor);
            button.setBackground(buttonBackgroundColor);
            button.setPreferredSize(buttonSize);
            button.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20)); // Ajouter des marges internes
            
        }

        // Ajout des boutons au panneau des boutons
        buttonPanel.add(ajouterButton);
        buttonPanel.add(supprimerButton);
        buttonPanel.add(modifierButton);
        buttonPanel.add(rechercherButton);
        buttonPanel.add(afficherTousButton);
        buttonPanel.add(afficherTousVivantButton);
        buttonPanel.add(afficherConsoleButton);
        buttonPanel.add(sauvegarderButton);

        // Ajout du panneau des boutons à gauche du panneau principal
        mainPanel.add(buttonPanel, BorderLayout.WEST);
        
        // Ajout du panneau principal à la fenêtre
        add(mainPanel);


        setVisible(true);

    //Formulaire
       ajouterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AjouterPersonneDialog dialog = new AjouterPersonneDialog(MainFrame.this, gestionnaire);
                dialog.setVisible(true);
            }
        });  

        supprimerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             //   mettreAjourStatutVital(gestionnaire);
            }
        });

        modifierButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ModificationPersonneDialog dialog = new ModificationPersonneDialog(MainFrame.this, gestionnaire);
                dialog.setVisible(true);
            }
        });

        rechercherButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             rechercherSurvivant(gestionnaire);
            }
        });

        afficherTousButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                afficherTousLesSurvivants(gestionnaire);
            }
        });

        
        afficherTousVivantButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                afficherTousLesSurvivantsVivants(gestionnaire);
            }
        });

        afficherConsoleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                afficherEnModeConsole(gestionnaire);
            }
        });

        sauvegarderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    sauvegarderEtQuitter(gestionnaire); // Passer le gestionnaire de personnes en tant que paramètre
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

        public static void afficherEnModeConsole(GestionnairePersonne gestionnaire) {
        try {
            gestionnaire.trierEtEcrireListesDansFichiers();
            System.out.println("Données écrites dans les fichiers.");
            System.out.println("Affichage des humains en mode console :");
            gestionnaire.afficherHumainsEnModeConsole();
        } catch (IOException | ParseException e) {
            System.err.println("Erreur lors de l'affichage en mode console : " + e.getMessage());
        }
    }
    
    /*Supprimer */
    public static void mettreAjourStatutVital(GestionnairePersonne gestionnaire) {
        String maj = JOptionPane.showInputDialog("Entrez le matricule ou le nom du survivant qui est mort :");
        boolean trouve = false;
        for (Personne personne : gestionnaire.getPersonnes()) {
            if (personne.getMatricule().equalsIgnoreCase(maj) || personne.getNom().equalsIgnoreCase(maj)) {
                personne.mettreAJourStatutVital(trouve);
                JOptionPane.showMessageDialog(null, "Le statut vital du survivant a été mis à jour avec succès.");
                trouve = true;
                break;
            }
        }
        if (!trouve) {
            JOptionPane.showMessageDialog(null, "Aucun survivant trouvé avec ce matricule ou ce nom. Echec du mis à jour.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
    

        public static void rechercherSurvivant(GestionnairePersonne gestionnaire) {
        String rechercheSurvivant = JOptionPane.showInputDialog("Entrez le matricule ou le nom du survivant à rechercher :");
        boolean trouve = false;
        for (Personne personne : gestionnaire.getPersonnes()) {
            if (personne.getMatricule().equalsIgnoreCase(rechercheSurvivant) || personne.getNom().equalsIgnoreCase(rechercheSurvivant)) {
                JOptionPane.showMessageDialog(null, "Informations sur le survivant :\n" + personne);
                trouve = true;
                break;
            }
        }
        if (!trouve) {
            JOptionPane.showMessageDialog(null, "Aucun survivant trouvé avec ce matricule ou ce nom.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
   

    public static void afficherTousLesSurvivants(GestionnairePersonne gestionnaire) {
        StringBuilder message = new StringBuilder("Tous les survivants :\n");
        int compteur = 0;
        for (Personne personne : gestionnaire.getPersonnes()) {
            message.append(personne).append("\n");
            compteur++;
        }
        if(compteur == 0){

        }else{
            JOptionPane.showMessageDialog(null, message.toString(), "Tous les personnages (" + compteur + ")", JOptionPane.INFORMATION_MESSAGE);
        }
        }

    public static void afficherTousLesSurvivantsVivants(GestionnairePersonne gestionnaire) {
        StringBuilder message = new StringBuilder("Tous les survivants vivants :\n");
        int compteur = 0;
        for (Personne personne : gestionnaire.getPersonnes()) {
            if (personne.isVivant()) {
                message.append(personne).append("\n");
                compteur++;
            }
        }
        if (compteur == 0) {
            JOptionPane.showMessageDialog(null, "Aucun survivant vivant trouvé.", "Erreur", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, message.toString(), "Tous les survivants vivants (" + compteur + ")", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    



    private void sauvegarderEtQuitter(GestionnairePersonne gestionnaire) throws IOException {
        // Appeler la méthode sauvegarderEtQuitter du TestAffichage ici
        try {
            gestionnaire.sauvegarderDansFichier("bunker.ser");
        JOptionPane.showMessageDialog(null, "Les données ont été sauvegardées avec succès dans 'bunker.ser'.\nL'application va maintenant se fermer.", "Sauvegarde et Quitter", JOptionPane.INFORMATION_MESSAGE);
            dispose(); // Fermer la fenêtre
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erreur lors de la sauvegarde : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
}
