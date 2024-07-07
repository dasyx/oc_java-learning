public class ObjectHeritage {

    public static void main(String[] args) {

        // Création d'une instance de la sous-classe
        Dog dog = new Dog("Buddy", 8, "Cocker");
        System.out.println(dog.eat());
    }

}
// Super classe
class Animal {
    // Attribut de la super classe
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String eat() {
       return name + " is eating.";
    }
}
// Sous classe
class Dog extends Animal {

    //Attribut de la sous-classe
    protected String breed;

    // Constructeur de la sous-classe
    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }
    // Méthode de la sous-classe
    public void bark() {
        System.out.println(name + " is barking.");
    }

}