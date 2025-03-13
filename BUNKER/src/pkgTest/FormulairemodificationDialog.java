package pkgTest;

import org.jdatepicker.JDatePicker;
//import org.jdatepicker.UtilDateModel;
import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
//import org.jdatepicker.impl.SqlDateModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Properties;

import pkgGestionnairePersonne.GestionnairePersonne;
import pkgPersonnage.EmploydeMaintenance.*;
import pkgPersonnage.Gestionnaire.*;
import pkgPersonnage.pkgAbstract.Personne;
import pkgPersonnage.ForceDeSecurite.*;

public class FormulairemodificationDialog extends JDialog {
    
    private int indexPersonne;
    //ForceDESecurite, Gestionnaire, EmployeDeMaintenance
    public JLabel secteurLabel;
    public JLabel gradeLabel;
    public JLabel posteLabel;
    public JLabel armeLabel;
    public JLabel anneesExperienceLabel;
    public JLabel nombreEmploye;
    public JLabel secteurGestionLabel;
    //Milice, Armee, Scientifique, Administrateur
    public JLabel nombreDePlainte;
    public JLabel nombreDeSortie;
    public JLabel nombreVictime;
    public JLabel tabMatricule; 
    public JLabel matricule1;
    public JLabel matricule2;
    public JLabel matricule3;
    public JLabel matricule4;
    public JLabel matricule5;
    public JLabel projet1;
    public JLabel projet2;
    public JLabel projet3;
    public JLabel projet4;
    public JLabel projet5;
    public JLabel nombreDeProjet;
    public JLabel tabProjets;
    public JLabel projetAffectation;
    public JLabel titre;
    public JLabel specialite;
    public JLabel dateFinDEtude;
    public JLabel niveauEtude;
    public JLabel quartDeTravail;
    public JLabel genreDeTravail;
    public JLabel nombreDeSecteurValide;
    public JLabel dateFinDEtudeLabel;

    //ForceDESecurite, Gestionnaire, EmployeDeMaintenance
    public JTextField matriculeField;
    public JTextField nomField;
    public JTextField prenomField;
    public JTextField sexeField;
    public JDatePicker dateNaissancePicker;
    public JTextField secteurField; 
    public JTextField gradeField;
    public JTextField posteField;
    public JTextField armeField;
    public JTextField anneesDeServiceField;
    public JTextField nombreEmployeField;
    public JTextField secteurGestionField;
    public JComboBox<String> typePersonneBox;
    public GestionnairePersonne gestionnaire;
    //Milice, Armee, Scientifique, Administrateur
    public JTextField nombreDePlainteField;
    public JTextField nombreDeSortieField;
    public JTextField nombreVictimeField;
    public JTextField nombreDeProjetField;
    public JTextField projetAffectationField;
    public JTextField titreField;
    public JTextField specialiteField;
    public JDatePicker dateFinDEtudePicker;
    public JComponent dateFinDEtudePickerComponent;
    public JTextField niveauEtudeField;
    public JTextField quartDeTravailField;
    public JTextField genreDeTravailField;
    public JTextField nombreDeSecteurValideField;

    public JTextField matriculeField1;
    public JTextField matriculeField2;
    public JTextField matriculeField3;
    public JTextField matriculeField4;
    public JTextField matriculeField5;
    public JTextField projetField1;
    public JTextField projetField2;
    public JTextField projetField3;

    JDatePanelImpl dateFinDEtudePanel;
    JDatePanelImpl dateNaissancePanel;
    org.jdatepicker.impl.UtilDateModel dateFinDEtudeModel;

    public FormulairemodificationDialog(JFrame parent, GestionnairePersonne gestionnaire, int indexPersonne) {
        super(parent, "modifier une personne", true);
        this.gestionnaire = gestionnaire;
        this.indexPersonne = indexPersonne;
        setLayout(new GridLayout(0,2));
                // Charger votre propre logo
                ImageIcon logo = new ImageIcon("img/zombi.png");
        // Appliquer le logo comme icône de la fenêtre
        setIconImage(logo.getImage());

        // Définition de la police et de la couleur de fond pour le contenu principal
        setFont(new Font("Arial", Font.PLAIN, 14));
       // getContentPane().setBackground(new Color(77,77,79,200));
        setPreferredSize(new Dimension(800, 600));
        
        

        // modifier les étiquettes et les champs de texte pour les informations de base
        add(new JLabel("Matricule :"));
        matriculeField = new JTextField();
        add(matriculeField);
    
        add(new JLabel("Nom :"));
        nomField = new JTextField();
        add(nomField);
    
        add(new JLabel("Prénom :"));
        prenomField = new JTextField();
        add(prenomField);
    
        add(new JLabel("Sexe :"));
        sexeField = new JTextField();
        add(sexeField);
        
                // Créer les pickers de date
        org.jdatepicker.impl.UtilDateModel dateNaissanceModel = new org.jdatepicker.impl.UtilDateModel();
        Properties dateNaissanceProperties = new Properties();
        dateNaissanceProperties.put("text.today", "Aujourd'hui");
        dateNaissanceProperties.put("text.month", "Mois");
        dateNaissanceProperties.put("text.year", "Année");
        dateNaissancePanel = new JDatePanelImpl(dateNaissanceModel, dateNaissanceProperties);
        dateNaissancePicker = new JDatePickerImpl(dateNaissancePanel, new DateComponentFormatter());
        add(new JLabel("Date de naissance:"));
        add((JComponent) dateNaissancePicker);
        
        
        // Initialiser la liste déroulante pour le type de personne
        add(new JLabel("Type de personne :"));
        typePersonneBox = new JComboBox<>(new String[]{"Employé de maintenance", "Force de sécurité", "Gestionnaire","Milice","Armee","Scientifique","Administrateur","Ingenieur","Ouvrier"});
        typePersonneBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedType = (String) typePersonneBox.getSelectedItem();
                switch (selectedType) {
                    case "Employé de maintenance":
                        afficherChampsEmployeMaintenance();
                        break;
                    case "Force de sécurité":
                        afficherChampsForceSecurite();
                        break;
                    case "Gestionnaire":
                        afficherChampsGestionnaire();
                        break;
                    case "Milice" :
                    afficherChampsMilice();
                        break;
                    case "Armee" :
                    afficherChampsArmee();
                        break;
                    case "Scientifique" :
                        afficherChampsScientifiques();
                        break;
                    case "Administrateur" :
                        afficherChampsAdmin();
                        break;
                    case "Ingenieur" :
                        afficherChampsIngenieur();
                        break;
                    case "Ouvrier" :
                        afficherChampsOuvrier();
                        break;            
                    default:
                        break;
                }
            }
        });
        add(typePersonneBox);

        // Initialiser le champ secteurField
        secteurLabel = new JLabel("Secteur d'employe de Maintenance:");
        secteurLabel.setVisible(false);
        add(secteurLabel);
        secteurField = new JTextField(); 
        secteurField.setVisible(false); 
        add(secteurField); // Ajout de cette ligne
     
        // Initialiser le champ gradeField
        gradeLabel = new JLabel("Grade :");
        gradeLabel.setVisible(false);
        add(gradeLabel);
        gradeField = new JTextField(); 
        gradeField.setVisible(false); 
        add(gradeField); // Ajout de cette ligne
    
        // Initialiser les autres champs supplémentaires
        posteLabel = new JLabel("Poste :");
        posteLabel.setVisible(false);
        add(posteLabel);
        posteField = new JTextField();
        posteField.setVisible(false);
        add(posteField);

        armeLabel = new JLabel("Arme :");
        armeLabel.setVisible(false);
        add(armeLabel);
        armeField = new JTextField();
        armeField.setVisible(false);
        add(armeField);

        anneesExperienceLabel = new JLabel("Annee d'experience :");
        anneesExperienceLabel.setVisible(false);
        add(anneesExperienceLabel);
        anneesDeServiceField = new JTextField();
        anneesDeServiceField.setVisible(false);
        add(anneesDeServiceField);
        
        
        nombreEmploye = new JLabel("Nombre d'employe :");
        nombreEmploye.setVisible(false);
        add(nombreEmploye);
        nombreEmployeField = new JTextField();
        nombreEmployeField.setVisible(false);
        add(nombreEmployeField);
        
        secteurGestionLabel = new JLabel("Secteur de Gestion :");
        secteurGestionLabel.setVisible(false);
        add(secteurGestionLabel);
        secteurGestionField = new JTextField();
        secteurGestionField.setVisible(false);
        add(secteurGestionField);


         // Initialiser le champ nombreDePlainteField
         nombreDePlainte = new JLabel("Nombre de Plainte:");
         nombreDePlainte.setVisible(false);
         add(nombreDePlainte);
         nombreDePlainteField = new JTextField();
         nombreDePlainteField.setVisible(false);
         add(nombreDePlainteField);
 
         // Initialiser le champ nombreDeSortieField
         nombreDeSortie = new JLabel("Nombre de Sortie:");
         nombreDeSortie.setVisible(false);
         add(nombreDeSortie);
         nombreDeSortieField = new JTextField();
         nombreDeSortieField.setVisible(false);
         add(nombreDeSortieField);
 
         // Initialiser le champ nombreVictimeField
         nombreVictime = new JLabel("Nombre Victime:");
         nombreVictime.setVisible(false);
         add(nombreVictime);
         nombreVictimeField = new JTextField();
         nombreVictimeField.setVisible(false);
         add(nombreVictimeField);

            // Initialiser les champs de texte pour les matricules
            matricule1 = new JLabel("Matricule 1:");
            matricule1.setVisible(false);
            add(matricule1);
            matriculeField1 = new JTextField();
            matriculeField1.setVisible(false);
            add(matriculeField1);

            matricule2 = new JLabel("Matricule 2:");
            matricule2.setVisible(false);
            add(matricule2);
            matriculeField2 = new JTextField();
            matriculeField2.setVisible(false);
            add(matriculeField2);

            matricule3 = new JLabel("Matricule 3:");
            matricule3.setVisible(false);
            add(matricule3);
            matriculeField3 = new JTextField();
            matriculeField3.setVisible(false);
            add(matriculeField3);

            
            matricule4 = new JLabel("Matricule 4:");
            matricule4.setVisible(false);
            add(matricule4);
            matriculeField4 = new JTextField();
            matriculeField4.setVisible(false);
            add(matriculeField4);
            
            matricule5 = new JLabel("Matricule 5:");
            matricule5.setVisible(false);
            add(matricule5);
            matriculeField5 = new JTextField();
            matriculeField5.setVisible(false);
            add(matriculeField5);

            
            // Initialiser le champ nombre de projet avec le texte obtenu
            nombreDeProjet = new JLabel("Nombre de Projet: ");
            nombreDeProjet.setVisible(false);
            add(nombreDeProjet);
            nombreDeProjetField =new JTextField();
            nombreDeProjetField.setVisible(false);
            add(nombreDeProjetField);

            // Initialiser les champs de texte pour les projets
            projet1 = new JLabel("Projet 1:");
            projet1.setVisible(false);
            add(projet1);
            projetField1 = new JTextField();
            projetField1.setVisible(false);
            add(projetField1);

            projet2 = new JLabel("Projet 2:");
            projet2.setVisible(false);
            add(projet2);
            projetField2 = new JTextField();
            projetField2.setVisible(false);
            add(projetField2);

            projet3 = new JLabel("Projet 3:");
            projet3.setVisible(false);
            add(projet3);
            projetField3 = new JTextField();
            projetField3.setVisible(false);
            add(projetField3);


            
        // Initialiser le champ projetAffectationField
        projetAffectation = new JLabel("Projet Affectation:");
        projetAffectation.setVisible(false);
        add(projetAffectation);
        projetAffectationField = new JTextField();
        projetAffectationField.setVisible(false);
        add(projetAffectationField);

        // Initialiser le champ titreField
        titre = new JLabel("Titre:");
        titre.setVisible(false);
        add(titre);
        titreField = new JTextField();
        titreField.setVisible(false);
        add(titreField);

        // Initialiser le champ specialiteField
        specialite = new JLabel("Spécialité:");
        specialite.setVisible(false);
        add(specialite);
        specialiteField = new JTextField();
        specialiteField.setVisible(false);
        add(specialiteField);

        // Initialiser le modèle de date pour la date de fin d'étude
        dateFinDEtudeModel = new org.jdatepicker.impl.UtilDateModel();
        Properties dateFinDEtudeProperties = new Properties();
        dateFinDEtudeProperties.put("text.today", "Aujourd'hui");
        dateFinDEtudeProperties.put("text.month", "Mois");
        dateFinDEtudeProperties.put("text.year", "Année");

        // Créer le panneau de sélection de date de fin d'étude
        dateFinDEtudePanel= new JDatePanelImpl(dateFinDEtudeModel, dateFinDEtudeProperties);
        // Créer le composant de sélection de date de fin d'étude
        dateFinDEtudePicker = new JDatePickerImpl(dateFinDEtudePanel, new DateComponentFormatter());
        // Créer le libellé pour la date de fin d'étude
        dateFinDEtudeLabel = new JLabel("Date de fin d'étude:");
        // Stocker le composant de sélection de date de fin d'étude dans une variable
        dateFinDEtudePickerComponent = (JComponent) dateFinDEtudePicker;

        // Rendre invisibles les composants de sélection de date de fin d'étude et le libellé associé
        dateFinDEtudePanel.setVisible(false);
        dateFinDEtudeLabel.setVisible(false);
        dateFinDEtudePickerComponent.setVisible(false); // Cacher le composant de sélection de date de fin d'étude

        // modifier les composants à votre conteneur (par exemple, un JPanel)
        add(dateFinDEtudeLabel);
        add(dateFinDEtudePickerComponent);

        
        // Initialiser le champ niveauEtudeField
        niveauEtude = new JLabel("Niveau d'étude:");
        niveauEtude.setVisible(false);
        add(niveauEtude);
        niveauEtudeField = new JTextField();
        niveauEtudeField.setVisible(false);
        add(niveauEtudeField);

            // Initialiser le champ quartDeTravailField
            quartDeTravail = new JLabel("Quart de travail:");
            quartDeTravail.setVisible(false);
            add(quartDeTravail);
            quartDeTravailField = new JTextField();
            quartDeTravailField.setVisible(false);
            add(quartDeTravailField);

            // Initialiser le champ genreDeTravailField
            genreDeTravail = new JLabel("Genre de travail:");
            genreDeTravail.setVisible(false);
            add(genreDeTravail);
            genreDeTravailField = new JTextField();
            genreDeTravailField.setVisible(false);
            add(genreDeTravailField);

            // Initialiser le champ nombreDeSecteurValideField
            nombreDeSecteurValide = new JLabel("Nombre de secteur valide:");
            nombreDeSecteurValide.setVisible(false);
            add(nombreDeSecteurValide);
            nombreDeSecteurValideField = new JTextField();
            nombreDeSecteurValideField.setVisible(false);
            add(nombreDeSecteurValideField);

        // modifier le bouton "modifier"
        add(new JLabel());
            // Charger l'image
            ImageIcon icon = new ImageIcon("img/modifier.png");
            // Récupérer l'image à partir de l'ImageIcon
            Image img = icon.getImage();
            // Redimensionner l'image à une taille appropriée
            Image newImg = img.getScaledInstance(10, 10, Image.SCALE_SMOOTH);
            // Créer un nouvel ImageIcon avec l'image redimensionnée
            ImageIcon newIcon = new ImageIcon(newImg);
            // Créer le bouton avec le nouvel ImageIcon
            JButton modifierButton = new JButton("modifier", newIcon);
            modifierButton.setPreferredSize(new Dimension(150, 300));
            modifierButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                modifierPersonne();
            }
        });
                 // Définition de la police et des couleurs pour le bouton "modifier"
                 Font buttonFont = new Font("Arial", Font.BOLD, 17);
                 Color foregroundColor = Color.WHITE;
                 Color backgroundColor = new Color(0, 102, 204); // Exemple de couleur bleue
                // Définition de la marge interne pour le bouton
                modifierButton.setMargin(new Insets(50, 20, 50, 20)); // Augmenter la marge interne pour agrandir en hauteur
                 modifierButton.setFont(buttonFont);
                 modifierButton.setForeground(foregroundColor);
                 modifierButton.setBackground(backgroundColor);
         
        
         add(modifierButton);
       
            // Charger l'image
            ImageIcon icon2 = new ImageIcon("img/porte.png");
            // Récupérer l'image à partir de l'ImageIcon
            Image img2 = icon2.getImage();
            // Redimensionner l'image à une taille appropriée
            Image newImg2 = img2.getScaledInstance(10, 10, Image.SCALE_SMOOTH);
            // Créer un nouvel ImageIcon avec l'image redimensionnée
            ImageIcon newIcon2 = new ImageIcon(newImg2);
            // Créer le bouton avec le nouvel ImageIcon
            JButton quitterButton = new JButton("Quitter", newIcon2);
            quitterButton.setPreferredSize(new Dimension(150, 300));
            quitterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Ferme la fenêtre de dialogue lorsque le bouton "Quitter" est cliqué
            }
        });
        // Définition de la police et des couleurs pour le bouton "Quitter"
            quitterButton.setFont(buttonFont);
            quitterButton.setForeground(foregroundColor);
            quitterButton.setBackground(backgroundColor);

            // Définition de la marge interne pour le bouton
            quitterButton.setMargin(new Insets(50, 20, 50, 20));

            // Ajout d'un espace entre les deux boutons
            add(Box.createRigidArea(new Dimension(100, 50))); // Espace horizontal de 10 pixels

        add(quitterButton);

    
    
        // Dimensionner la fenêtre
        pack();
        setLocationRelativeTo(parent);
    }
    
    public void afficherChampsEmployeMaintenance() {
        // Masquer tous les champs
        cacherChamps();
        // Afficher les champs pertinents pour les employés de maintenance
        secteurField.setVisible(true);
        secteurLabel.setVisible(true);
    }
    public void afficherChampsForceSecurite() {
        // Masquer tous les champs
        cacherChamps();
        // Afficher les champs pertinents pour la force de sécurité
        gradeField.setVisible(true);
        gradeLabel.setVisible(true); // Afficher le JLabel correspondant
       
        posteField.setVisible(true);
        posteLabel.setVisible(true); // Afficher le JLabel correspondant
       
        armeField.setVisible(true);
        armeLabel.setVisible(true); // Afficher le JLabel correspondant
       
        anneesDeServiceField.setVisible(true);
        anneesExperienceLabel.setVisible(true); // Afficher le JLabel correspondant
    }
    
    public void afficherChampsGestionnaire() {
        cacherChamps();
        nombreEmployeField.setVisible(true);
        nombreEmploye.setVisible(true); // Afficher le JLabel correspondant
       
        secteurGestionField.setVisible(true);
        secteurGestionLabel.setVisible(true); // Afficher le JLabel correspondant
    }



    protected void afficherChampsIngenieur() {
        cacherChamps();
        afficherChampsEmployeMaintenance();
        specialite.setVisible(true);
        specialiteField.setVisible(true);
        dateFinDEtudeLabel.setVisible(true);
        dateFinDEtudePanel.setVisible(true);
        dateFinDEtudePickerComponent.setVisible(true);
        niveauEtude.setVisible(true);
        niveauEtudeField.setVisible(true);       
    }


    protected void afficherChampsOuvrier() {
        cacherChamps();
        afficherChampsEmployeMaintenance();
        quartDeTravail.setVisible(true);
        quartDeTravail.setVisible(true);
        genreDeTravail.setVisible(true);
        genreDeTravailField.setVisible(true);
        nombreDeSecteurValide.setVisible(true);
        nombreDeSecteurValideField.setVisible(true);
        quartDeTravail.setVisible(true);
        quartDeTravailField.setVisible(true);
        
    }


    protected void afficherChampsAdmin() {
        cacherChamps();
        afficherChampsGestionnaire();
        projetAffectationField.setVisible(true);
        projetAffectation.setVisible(true);            
    }


    protected void afficherChampsScientifiques() {
        cacherChamps();
        afficherChampsGestionnaire();
        nombreDeProjet.setVisible(true);
        nombreDeProjetField.setVisible(true);
        
        projet1.setVisible(true);
        projetField1.setVisible(true);
        
        projet2.setVisible(true);
        projetField2.setVisible(true);
        
        projet3.setVisible(true);
        projetField3.setVisible(true);
    }


    protected void afficherChampsMilice() {
        cacherChamps();
        afficherChampsForceSecurite();
        nombreDePlainteField.setVisible(true);
        nombreDePlainte.setVisible(true);    
    }


    protected void afficherChampsArmee() {
        cacherChamps();
        afficherChampsForceSecurite();
        nombreDeSortieField.setVisible(true);
        nombreDeSortie.setVisible(true);

        nombreVictimeField.setVisible(true);
        nombreVictime.setVisible(true);

        matricule1.setVisible(true);
        matriculeField1.setVisible(true);
        
        matricule2.setVisible(true);
        matriculeField2.setVisible(true);
        
        matricule3.setVisible(true);
        matriculeField3.setVisible(true);
        
        matricule4.setVisible(true);
        matriculeField4.setVisible(true);
        
        matricule5.setVisible(true);
        matriculeField5.setVisible(true);
    }
    public void cacherChamps() {

        // Cacher tous les JLabel correspondants
        secteurLabel.setVisible(false);
        gradeLabel.setVisible(false);
        posteLabel.setVisible(false);
        armeLabel.setVisible(false);
        anneesExperienceLabel.setVisible(false);
        nombreEmploye.setVisible(false);
        secteurGestionLabel.setVisible(false);
        matricule1.setVisible(false);
        matricule2.setVisible(false);
        matricule3.setVisible(false);
        matricule4.setVisible(false);
        matricule5.setVisible(false);
        nombreDeProjet.setVisible(false);
        projet1.setVisible(false);
        projet2.setVisible(false);
        projet3.setVisible(false);
        projetAffectation.setVisible(false);
        titre.setVisible(false);
        specialite.setVisible(false);
        niveauEtude.setVisible(false);
        quartDeTravail.setVisible(false);
        genreDeTravail.setVisible(false);
        nombreDeSecteurValide.setVisible(false);
        nombreDePlainte.setVisible(false);
        nombreDeSortie.setVisible(false);
        nombreVictime.setVisible(false);
        dateFinDEtudeLabel.setVisible(false); //date entete 

        // Cacher tous les JTextField correspondants
        secteurField.setVisible(false);
        gradeField.setVisible(false);
        posteField.setVisible(false);
        armeField.setVisible(false);
        anneesDeServiceField.setVisible(false);
        nombreEmployeField.setVisible(false);
        secteurGestionField.setVisible(false);
        nombreDeProjetField.setVisible(false);
        projetAffectationField.setVisible(false);
        titreField.setVisible(false);
        specialiteField.setVisible(false);
        dateFinDEtudePanel.setVisible(false);
        niveauEtudeField.setVisible(false);
        quartDeTravailField.setVisible(false);
        genreDeTravailField.setVisible(false);
        nombreDeSecteurValideField.setVisible(false);
        nombreDePlainteField.setVisible(false);
        nombreDeSortieField.setVisible(false);
        nombreVictimeField.setVisible(false);
        matriculeField1.setVisible(false);
        matriculeField2.setVisible(false);
        matriculeField3.setVisible(false);
        matriculeField4.setVisible(false);
        matriculeField5.setVisible(false);
        projetField1.setVisible(false);
        projetField2.setVisible(false);
        projetField3.setVisible(false);

    }
    public void modifierPersonne() {
        try {
            // Récupérer les valeurs des champs de texte
            String matricule = matriculeField.getText();
            String nom = nomField.getText();
            String prenom = prenomField.getText();
            String sexe = sexeField.getText();
            Date dateNaissanceDate = (Date) dateNaissancePicker.getModel().getValue();
            // Convertir la date en GregorianCalendar
            GregorianCalendar dateNaissance = new GregorianCalendar();
            dateNaissance.setTime(dateNaissanceDate);
    
            // Trouver l'index de la personne dans la liste
            int index = getIndexPersonne(); // Utiliser l'index fourni
    
            // Récupérer la personne à modifier à partir de l'index
            Personne personneAModifier = gestionnaire.getPersonnes().get(index);
    
            // Modifier les valeurs de la personne existante
            personneAModifier.setMatricule(matricule);
            personneAModifier.setNom(nom);
            personneAModifier.setPrenom(prenom);
            personneAModifier.setSexe(sexe);
            personneAModifier.setDateDeNaissance(dateNaissance);
    
            // Switch pour modifier les autres champs spécifiques à chaque type de personne
            switch ((String) typePersonneBox.getSelectedItem()) {
                case "Employé de maintenance":
                    EmployeDeMaintenance employe = (EmployeDeMaintenance) personneAModifier;
                    String secteur = secteurField.getText();
                    employe.setSecteur(secteur);
                    break;
                case "Force de sécurité":
                    ForceDeSecurite force = (ForceDeSecurite) personneAModifier;
                    String grade = gradeField.getText();
                    String poste = posteField.getText();
                    String arme = armeField.getText();
                    int anneesExperience = Integer.parseInt(anneesDeServiceField.getText());
                    force.setGrade(grade);
                    force.setPoste(poste);
                    force.setArme(arme);
                    force.setAnneeDeService(anneesExperience);
                    break;
                case "Gestionnaire":
                    Gestionnaire gestionnaire = (Gestionnaire) personneAModifier;
                    int nombreEmploye = Integer.parseInt(nombreEmployeField.getText());
                    String secteurGestion = secteurGestionField.getText();
                    gestionnaire.setNombreEmploye(nombreEmploye);
                    gestionnaire.setSecteur(secteurGestion);
                    break;
                default:
                    break;
            }
    
            // Fermer la fenêtre de dialogue après avoir modifié la personne
            dispose();
        } catch (NumberFormatException e) {
            // Gérer les erreurs de conversion de texte en nombre
            JOptionPane.showMessageDialog(null, "Veuillez saisir des valeurs numériques valides.", "Erreur de saisie", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            // Gérer toutes les autres exceptions imprévues
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Méthode pour récupérer l'index de la personne
    public int getIndexPersonne() {
        return indexPersonne;
    }
}
