
//    fichier du nom de Q1.java

//int note1, int note2, int note3, int note4, int note5, String 1-5, int iMoyenne int iMoyenne = (int1+....int5)/5
//

import  javax.swing.JOptionPane;

public  class   Q1  {
 
      public  static  void   main   ( String args[ ] )
                 {
                    
                    JOptionPane.showMessageDialog (null, "Bienvenue au \nlabo numero 1");
                    String nom = JOptionPane.showInputDialog("saisir le nom");


                    int note1, note2, note3, note4, note5, Moyenne;
                    String strnote1, strnote2, strnote3, strnote4, strnote5;
                    //saisie
                    strnote1 = JOptionPane.showInputDialog("Note 1");
                    strnote2 = JOptionPane.showInputDialog("Note 2");
                    strnote3 = JOptionPane.showInputDialog("Note 3");
                    strnote4 = JOptionPane.showInputDialog("Note 4");
                    strnote5 = JOptionPane.showInputDialog("Note 5");
                     //conversion en integer
                    note1 = Integer.parseInt(strnote1);
                    note2 = Integer.parseInt(strnote2);
                    note3 = Integer.parseInt(strnote3);
                    note4 = Integer.parseInt(strnote4);
                    note5 = Integer.parseInt(strnote5);

                    Moyenne = ((note1 + note2 + note3 + note4 + note5)/5) ;

                    

                    JOptionPane.showMessageDialog(null, "La Moyenne de : " + nom + " en Mathematique est " + Moyenne);
                 System.exit (0) ;
                 }                
}
