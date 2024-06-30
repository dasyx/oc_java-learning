import java.util.Random; // Importer la classe Random de java.util

public class RandomNumber {
    public static void generateRandomNumber() {
        Random rand = new Random(); // Créer une nouvelle instance de la classe Random
        int randomNumber = rand.nextInt(101); // Générer un nombre aléatoire entre 0 (inclus) et 101 (exclus)
        System.out.println(randomNumber); // Afficher le nombre aléatoire généré
    }

    public static void main(String[] args) {
        generateRandomNumber(); // Appeler la méthode generateRandomNumber dans la méthode main
    }
}
