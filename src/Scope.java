public class Scope {

    public static void main(String[] args) {
        fonction1();
        //fonction2();
    }

    public static void fonction1() {
        String example = "Hello";
        System.out.println(example); //ceci est une instruction
    }

//    public static void fonction2() {
//        System.out.println(example);
//        //cette instruction donnera une erreur à cause du scope (portée) des variables
//        //plus particulièrement de la variable "example"
//        //car déclarée dans une fonction indépendante et inaccessible pour la fonction2
//    }
}
