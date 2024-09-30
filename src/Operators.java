public class Operators {
    public static void main(String[] args){
        int entier = -12;     // Opérateur unaire (qui s'applique à un seul opérande)
        int entier2 = 5 + 3;  // Opérateur binaire (qui s'applique à deux opérandes)
        System.out.println(entier);
        System.out.println(entier2);

        // Opérateurs arithmétiques
        int addition = 5 + 3;
        int soustraction = 5 - 3;
        int multiplication = 5 * 3;
        int division = 5 / 3;
        int modulo = 5 % 3;
        System.out.println(addition);
        System.out.println(soustraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(modulo);


        // Opérateur d'assignation
        int a = 5;
        a += 3; // a = a + 3;
        System.out.println(a);

        // Opérateurs de comparaison
        var plusPetit = 4;
        var plusGrand = 5;
        var comparaison = plusPetit == plusGrand;
        //boolean estPlusPetit = plusPetit < plusGrand;
        System.out.println(comparaison);

        // Opérateurs logiques
        boolean vrai = true;
        boolean faux = false;
        boolean et = vrai && faux;
        boolean ou = vrai || faux;
        boolean non = !vrai;
        System.out.println(et);

        // Opérateurs de décalage
        int decalageDroite = 5 >> 1; // 5 / 2
        int decalageGauche = 5 << 1; // 5 * 2
        System.out.println(decalageDroite);
        System.out.println(decalageGauche);

        // Chainage d'opérateurs
        int x = 5;
        int y = 3;
        int z = 2;
        boolean chainage = x > y && y > z;
        System.out.println(chainage);

        // Opérateurs ternaires
        int age = 18;
        String majeur = age >= 18 ? "Majeur" : "Mineur";
        System.out.println(majeur);

        // Opérateurs d'instance
        String chaine = "Hello";
        boolean estString = chaine instanceof String;
        System.out.println(estString);

        // Opérateurs de type cast
        double doubleValue = 5.5;
        int intValue = (int) doubleValue;
        System.out.println(intValue);

        // Concaténation de chaînes
        String prenom = "John";
        String nom = "Doe";
        String nomComplet = prenom + " " + nom;
        System.out.println(nomComplet);

        // Opérateurs de comparaison de chaînes
        String chaine1 = "Hello";
        String chaîne2 = new String("Hello");
        // Les deux chaînes de caractères sont différentes en mémoire
        // Parce que chaîne2 est créée avec le mot clé new qui crée un nouvel objet en mémoire
        System.out.println(chaine1 == chaîne2); // false
        // La seule façon de comparer deux chaînes de caractères est d'utiliser la méthode equals
        System.out.println(chaine1.equals(chaîne2)); // true

        // Les règles de précédence des opérateurs
        int resultat = 5 + 3 * 2; // 11
        System.out.println(resultat);
        // Utilisation des parenthèses pour changer l'ordre d'évaluation
        int resultat2 = (5 + 3) * 2; // 16
        System.out.println(resultat2);


    }
}
