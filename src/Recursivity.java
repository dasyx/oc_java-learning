public class Recursivity {

    /**
     * Méthode récursive pour calculer la factorielle d'un nombre.
     * @param n le nombre pour lequel calculer la factorielle.
     * @return la factorielle de n.
     * @throws IllegalArgumentException si n est négatif.
     */
    public static int factorial(int n) {
        // Vérifie si l'entrée est un nombre négatif et lance une exception dans ce cas.
        if (n < 0) {
            throw new IllegalArgumentException("Le nombre doit être non négatif.");
        }

        // Cas de base : la factorielle de 0 ou 1 est 1.
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Appel récursif : la factorielle de n est n multiplié par la factorielle de (n-1).
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Teste la méthode factorial avec le nombre 4.
        int n = 4;
        // Affiche le résultat de la factorielle de n.
        System.out.println("La factorielle de " + n + " est " + factorial(n));
    }
}

