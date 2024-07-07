// Déclaration de la classe principale
public class ClassPolymorphism {

    // Déclaration de la classe interne statique Vehicle
    // Cette classe sert de base pour les autres véhicules
    static class Vehicle {
        // Méthode move() qui sera redéfinie dans les sous-classes
        void move() {
            System.out.println("Vehicle is moving");
        }
    }

    // Déclaration de la classe interne statique Car qui étend Vehicle
    static class Car extends Vehicle {
        // Redéfinition de la méthode move() pour Car
        @Override
        void move() {
            System.out.println("Car is moving");
        }
    }

    // Déclaration de la classe interne statique Bicycle qui étend Vehicle
    static class Bicycle extends Vehicle {
        // Redéfinition de la méthode move() pour Bicycle
        @Override
        void move() {
            System.out.println("Bicycle is moving");
        }
    }

    // Déclaration de la classe interne statique TestVehicle
    // Cette classe contient la méthode main pour tester les classes précédentes
    public static class TestVehicle {

        // Méthode main : point d'entrée de l'application
        public static void main(String[] args) {
            // Création d'une instance de Car en utilisant une référence de type Vehicle
            Vehicle myCar = new Car();
            // Création d'une instance de Bicycle en utilisant une référence de type Vehicle
            Vehicle myBicycle = new Bicycle();

            // Appel de la méthode move() sur l'instance myCar
            // Cela utilisera la méthode redéfinie dans la classe Car
            myCar.move(); // Affichera "Car is moving"

            // Appel de la méthode move() sur l'instance myBicycle
            // Cela utilisera la méthode redéfinie dans la classe Bicycle
            myBicycle.move(); // Affichera "Bicycle is moving"
        }
    }

}
