package pkgTryCatch;

public class TestTryCatch {

    public static void main(String[] args) {

        String str;
        int[] arr = new int[5];
        int a;

        // Exemples de try-catch avec exceptions qui sont interceptées
        try {
            System.out.println(arr[5] = 10);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        try {
            str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }

        try {
            str = "abc";
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }

        // Exemple de try-catch avec exception qui n'est pas interceptée
        // try {
        //     str = "abc";
        //     int num = Integer.parseInt(str);
        //     System.out.println(num);
        // } catch (NullPointerException e) {
        //     System.out.println("NullPointerException: " + e.getMessage());
        // }

        // Exemple de try-catch avec plusieurs catch
        try {
            str = "abc";
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }

        // Exemple de try-catch avec finally
        try {
            str = "abc";
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } finally {
            System.out.println("On est rendus au finally!!");
        }

        // Test de la classe GenerateurException
        GenerateurException ge = new GenerateurException();
        System.out.println(ge);

        // TODO : Tester la classe GenerateurException avec des valeurs invalides
        // et ensuite modifier l'instanciation de ge2 pour qu'elle soit gérée par un try-catch
        GenerateurException ge2 = new GenerateurException("Bob", 25);



    }
}
