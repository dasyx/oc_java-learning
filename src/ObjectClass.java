public class ObjectClass {

    public static void main(String[] args) {
        // Déclaration d'un nouvel objet de type Marque
        // L'objet est appelé instance de classe
        Marque maMarque = new Marque("Apple");
        // Réassignation de la valeur "nom" de l'objet maMarque
        maMarque.nom = "La Pomme Croquée";

        Telephone monTelephone = new Telephone(34000, "Iphone", maMarque);

        // Affichage de la marque du téléphone
        System.out.println(monTelephone.marque.nom); // Apple
        System.out.println(maMarque.nom);            // Apple

    }
}

class Telephone {
    int pixels;
    String nom;
    Marque marque;

    // Ceci est un constructeur
    public Telephone(int pixels, String nom, Marque marque) {
        // Ne pas oublier de mettre à jour la valeur des attributs par les arguments
        this.pixels = pixels;
        this.nom = nom;
        this.marque = marque;
    }
}

class Marque {
    String nom;

    public Marque(String nom) {
        this.nom = nom;
    }
}
