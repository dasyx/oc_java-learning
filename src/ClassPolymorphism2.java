public class ClassPolymorphism2 {

    public static void main(String[] args) {

        Animal a1 = new Animal();
        Animal a2 = new Chien();

        a1.deplacer();
        a2.deplacer();

    }
    public static class Animal {
        void deplacer() {
            System.out.println("Je me déplace");
        }
    }
    static class Chien extends Animal {
        @Override
        void deplacer() {
            System.out.println("Je marche");
        }
    }
    static class Oiseau extends Animal {
        @Override
        void deplacer() {
            System.out.println("Je vole !");
        }
    }
    static class Poisson extends Animal {
        @Override
        void deplacer() {
            System.out.println("Je nage !");
        }
    }
}
