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
    }
}