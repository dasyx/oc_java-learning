package exceptions; // Déclaration du package 'exceptions'

import java.util.List; // Importation de la classe List de la bibliothèque Java

public class SimpleMaths {

    /**
     * Calculez la valeur moyenne d'une liste d'entiers
     *
     * @param listOfIntegers une liste contenant des nombres entiers
     * @return la moyenne de la liste
     */
    public static int calculateAverage(List<Integer> listOfIntegers) {
        int average = 0; // Initialisation de la variable 'average' à 0

        // Boucle à travers chaque entier dans la liste
        for (int value : listOfIntegers) {
            average += value; // Ajoute la valeur actuelle à 'average'
        }

        // Divise la somme totale par la taille de la liste pour obtenir la moyenne
        average /= listOfIntegers.size();

        return average; // Retourne la moyenne calculée
    }
}