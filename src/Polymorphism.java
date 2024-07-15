// Déclaration de la classe mère (superclasse)
class Shape {
    // Méthode générique que toutes les sous-classes vont redéfinir
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// Déclaration de la classe Circle qui hérite de Shape
class Circle extends Shape {
    // Redéfinition de la méthode draw pour la classe Circle
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Déclaration de la classe Rectangle qui hérite de Shape
class Rectangle extends Shape {
    // Redéfinition de la méthode draw pour la classe Rectangle
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// Déclaration de la classe Triangle qui hérite de Shape
class Triangle extends Shape {
    // Redéfinition de la méthode draw pour la classe Triangle
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

// Classe principale pour tester le polymorphisme
public class Polymorphism {
    public static void main(String[] args) {
        // Création d'un tableau d'objets de type Shape
        Shape[] shapes = new Shape[3];

        // Instanciation de différents objets Shape
        shapes[0] = new Circle();    // Objet de type Circle
        shapes[1] = new Rectangle(); // Objet de type Rectangle
        shapes[2] = new Triangle();  // Objet de type Triangle

        // Utilisation du polymorphisme pour appeler la méthode draw
        for (Shape shape : shapes) {
            // Chaque objet appelle sa propre version de la méthode draw
            shape.draw();
        }
    }
}

