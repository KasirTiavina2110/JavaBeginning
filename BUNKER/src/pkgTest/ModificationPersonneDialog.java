package pkgTest;
import javax.swing.*;

import pkgGestionnairePersonne.GestionnairePersonne;
import pkgPersonnage.pkgAbstract.Personne;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ModificationPersonneDialog extends JDialog {

    private JTextField matriculeField, nomField;
    public GestionnairePersonne gestionnaire;

    public ModificationPersonneDialog(JFrame parent, GestionnairePersonne gestionnaire) {
        super(parent, "Modification de personne", true);

        // Charger l'image de fond
        ImageIcon backgroundImageIcon = new ImageIcon("img/simpsons.jpg");
        Image backgroundImage = backgroundImageIcon.getImage();
        // Définition de la police et de la couleur de fond pour le contenu principal
        setFont(new Font("Arial", Font.PLAIN, 14));
        // Créer un JPanel pour afficher l'image de fond
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };
        backgroundPanel.setLayout(new BorderLayout());

        // Ajouter les composants
        JPanel searchPanel = new JPanel(new FlowLayout());
        searchPanel.setOpaque(false); // Rendre le panneau transparent

        matriculeField = new JTextField(15);
        nomField = new JTextField(15);
        JButton rechercherModifButton = new JButton("Rechercher");
        
        searchPanel.add(new JLabel("Matricule :"));
        searchPanel.add(matriculeField);
        searchPanel.add(new JLabel("Nom :"));
        searchPanel.add(nomField);
        searchPanel.add(rechercherModifButton);

        // Changer la couleur du texte des labels en blanc
        for (Component component : searchPanel.getComponents()) {
            if (component instanceof JLabel) {
                component.setForeground(Color.WHITE);
            }
        }

        backgroundPanel.add(searchPanel, BorderLayout.CENTER);

        rechercherModifButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Récupérer la recherche de l'utilisateur
                boolean trouve = false;
                int indexTrouve = -1; // Index de la personne trouvée
                
                for (int i = 0; i < ((GestionnairePersonne) gestionnaire).getPersonnes().size(); i++) {
                    Personne personne = ((GestionnairePersonne) gestionnaire).getPersonnes().get(i);
                    if (personne.getMatricule().equalsIgnoreCase(matriculeField.getText()) && personne.getNom().equalsIgnoreCase(nomField.getText())) {
                        trouve = true;
                        indexTrouve = i; // Stocker l'index de la personne trouvée
                        break;
                    }
                }
                
                if (trouve) {
                    // Si le survivant est trouvé, ouvrir le formulaire de modification
                    try {
                        FormulairemodificationDialog formulaire = new FormulairemodificationDialog(parent, gestionnaire, indexTrouve);
                        formulaire.setVisible(true); // afficher la fenêtre de modification
                        System.out.println("tu es ici");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } else {
                    // Si le survivant n'est pas trouvé, afficher un message d'erreur
                    System.out.println("Erreur t'es pas dans le try");
                    JOptionPane.showMessageDialog(null, "Aucun survivant trouvé avec ce matricule ou ce nom.", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(backgroundPanel);

        // Définir les propriétés de la fenêtre
        setResizable(true);
        setSize(800, 600);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(parent);
        setVisible(true);
    }

}
