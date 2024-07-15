public class TypeReference {

    public static void main(String[] args) {
        // Création d'une nouvelle instance de la classe Car
        Car car = new Car();
        // carToPaint est une référence à la même instance de Car que car
        Car carToPaint = car;
        // Affiche la couleur de la voiture référencée par car, qui est initialement "red"
        System.out.println(car.color); // -> red
        // Affiche la couleur de la voiture référencée par carToPaint, qui est aussi "red" car c'est la même instance que car
        System.out.println(carToPaint.color); // -> red
        // Change la couleur de la voiture référencée par carToPaint à "yellow"
        carToPaint.color = "yellow";
        // Affiche la couleur de la voiture référencée par car, qui est maintenant "yellow" car c'est la même instance que carToPaint
        System.out.println(car.color); // -> yellow
        // Affiche la couleur de la voiture référencée par carToPaint, qui est aussi "yellow"
        System.out.println(carToPaint.color); // -> yellow
    }

    // Définition de la classe interne Car
    public static class Car {
        // La variable d'instance color est initialisée à "red"
        String color = "red";
    }
}

