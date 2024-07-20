package exceptions; // Déclaration du package 'exceptions'

import java.util.ArrayList; // Importation de la classe ArrayList de la bibliothèque Java
import java.util.List; // Importation de la classe List de la bibliothèque Java

public class TemperatureAverage {

    /**
     * Affiche la température moyenne à partir des valeurs fournies comme arguments en ligne de commande
     *
     * @param args liste de températures séparées par des espaces
     */
    public static void main(String[] args) {

        try {
            // Crée une nouvelle liste pour stocker les températures enregistrées en degrés Celsius
            List<Integer> recordedTemperaturesInDegreesCelcius = new ArrayList<>();

            // Ajoute quelques températures fixes à la liste
            recordedTemperaturesInDegreesCelcius.add(8);
            recordedTemperaturesInDegreesCelcius.add(12);
            recordedTemperaturesInDegreesCelcius.add(15);
            recordedTemperaturesInDegreesCelcius.add(22);

            // Remplissez la liste à partir des valeurs fournies comme arguments en ligne de commande
            for (String stringRepresentationOfTemperature : args) {
                // Convertit chaque argument de chaîne en un entier (température)
                int temperature = Integer.parseInt(stringRepresentationOfTemperature);
                // Ajoute la température convertie à la liste
                recordedTemperaturesInDegreesCelcius.add(temperature);
            }

            // Calculez et affichez la température moyenne
            int averageTemperature = SimpleMaths.calculateAverage(recordedTemperaturesInDegreesCelcius);
            System.out.println("The average temperature is " + averageTemperature);
        } catch (NumberFormatException e) {
            // Gère l'exception si un argument ne peut pas être converti en entier
            System.out.println("All arguments should be provided as numbers");
            System.exit(-1); // Termine le programme avec un code de sortie indiquant une erreur
        } catch (ArithmeticException e) {
            // Gère l'exception si la liste est vide (division par zéro lors du calcul de la moyenne)
            System.out.println("At least one temperature should be provided");
            System.exit(-1); // Termine le programme avec un code de sortie indiquant une erreur
        }

    }
}
