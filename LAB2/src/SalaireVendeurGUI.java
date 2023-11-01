import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalaireVendeurGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calcul du Salaire des Vendeurs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel panel = new JPanel(new BorderLayout());

        DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"Mois", "Nom du Vendeur", "Salaire"}, 0);
        JTable table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane, BorderLayout.CENTER);

        JButton calculerButton = new JButton("Calculer le Salaire");
        panel.add(calculerButton, BorderLayout.SOUTH);

        calculerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mois = JOptionPane.showInputDialog("Entrez le mois : ");
                String nomVendeur = JOptionPane.showInputDialog("Entrez le nom du vendeur : ");
                int nombreOrdinateurs = Integer.parseInt(JOptionPane.showInputDialog("Entrez le nombre d'ordinateurs vendus : "));
                double ventesMensuelles = Double.parseDouble(JOptionPane.showInputDialog("Entrez le montant des ventes mensuelles : "));

                // Calcul du salaire
                double salaireFixe = 900.0;
                double commissionVentes = 0.02 * ventesMensuelles;
                double salaireTotal = salaireFixe + (50 * nombreOrdinateurs) + commissionVentes;

                // Ajouter la ligne au tableau
                tableModel.addRow(new Object[]{mois, nomVendeur, "$" + salaireTotal});
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
