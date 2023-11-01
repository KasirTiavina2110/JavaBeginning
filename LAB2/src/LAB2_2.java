import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.*;

public class LAB2_2 {
    public static void main(String[] args) {
        
        final double PRIMEORDI = 50.00;
        final float POURCCOMISSIONTOTAL = 0.02f;
        //Creation d'un fenetre 
        JFrame fenetre = new JFrame("Calcul de salaire des vendeurs");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(1000,500);

        JPanel panel = new JPanel(new BorderLayout());

        DefaultTableModel monTableau = new DefaultTableModel(new Object[]{"Mois", "Prenom", "Nom","Nbr ordis","Montant ventes (en $)", "Affichage du programme"}, 0);
        JTable table = new JTable(monTableau);
        table.getColumnModel().getColumn(5).setPreferredWidth(300);
         JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane, BorderLayout.CENTER);

        JButton calculerButton = new JButton("Calculer le Salaire");
        //placement du bouton en bas du programme
        panel.add(calculerButton, BorderLayout.SOUTH);

        //Saisi de donné
        calculerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mois = JOptionPane.showInputDialog("Entrez le mois : ");
                String prenomVendeur = JOptionPane.showInputDialog("Entrez le prenom du vendeur : ");
                String nomVendeur = JOptionPane.showInputDialog("Entrez le nom du vendeur : ");
                int nombreOrdinateurs = Integer.parseInt(JOptionPane.showInputDialog("Entrez le nombre d'ordinateurs vendus : "));
                double ventesMensuelles = Double.parseDouble(JOptionPane.showInputDialog("Entrez le montant des ventes mensuelles : "));
                
                // Calcul du salaire
                DecimalFormat format = new DecimalFormat("0.00");
              final  double salaireFixe = 900.0;
                double commissionVentes = POURCCOMISSIONTOTAL * ventesMensuelles;
                double salaireTotal = salaireFixe + (PRIMEORDI * nombreOrdinateurs) + commissionVentes;
                String details = " Pour le mois  " + mois +"  "+ prenomVendeur +"  a reçu un salaire de  " + format.format(salaireTotal) + "$";
               
                // Ajouter la ligne au tableau
                monTableau.addRow(new Object[]{mois,prenomVendeur ,nomVendeur, nombreOrdinateurs, format.format(ventesMensuelles),  details });
            }
        });

        fenetre.add(panel);
        fenetre.setVisible(true);
        System.exit(0);
    }
    
    }

