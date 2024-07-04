public class ObjectClass {

    public static void main(String[] args) {
        //déclaration d'un nouvel objet de type Marque
        //l'objet est appelé instance de classe
        Marque apple = new Marque("Apple");

        Telephone iphone = new Telephone(34000, "Iphone", apple);

        System.out.println(iphone);

    }
}

class Telephone {
    int pixels;
    String nom;
    Marque marque;

    //ceci est un constructor
    public Telephone(int pixels, String nom, Marque marque) {
        //ne pas oublier de mettre à jour la valeur des attributs par les arguments
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
