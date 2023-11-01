import javax.swing.JOptionPane;

public class LAB3_6 {
    public static void main(String[] args) {
         // Demande à l'utilisateur de saisir les résultats des deux premiers examens et des laboratoires
        String examen1Str = JOptionPane.showInputDialog("Entrez le résultat du premier examen (sur 25 points) :");
        String examen2Str = JOptionPane.showInputDialog("Entrez le résultat du deuxième examen (sur 25 points) :");
        String laboratoiresStr = JOptionPane.showInputDialog("Entrez le résultat des laboratoires (sur 25 points) :");

        // Convertit les entrées en nombres entiers
        int examen1 = Integer.parseInt(examen1Str);
        int examen2 = Integer.parseInt(examen2Str);
        int laboratoires = Integer.parseInt(laboratoiresStr);

        // Calcule le total des points obtenus
        int totalPoints = examen1 + examen2 + laboratoires;

        // Vérifie si le total des points est supérieur ou égal à 60 (note de passage)
        if (totalPoints >= 60) {
            JOptionPane.showMessageDialog(null, "Félicitations, vous êtes assurés de passer le cours.");
        } else if (totalPoints >= 45) {
            JOptionPane.showMessageDialog(null, "Bravo, vous pouvez encore passer le cours.");
        } else {
            JOptionPane.showMessageDialog(null, "Désolé, vous ne pouvez pas passer le cours.");
        }
    }
}
