public class Array {

    public static void main(String[] args) {
        // On commence par déclarer le type d'éléments que l'on va stocker
        String[] tableau = new String[10]; // On écrit le nb d'éléments que l'on souhaite stocker

        // Ajoute une valeur à la variable "tableau" à la quatrième occurrence de la boucle
        //tableau[3] = "Index 3";
        //tableau[3] = "Une autre valeur"    // va écraser la valeur précédente dans le tableau au même index (position)

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = "Index " + i;
            System.out.println(tableau[i]);
        }
    }
}
