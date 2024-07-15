public class TypeValue {

    public static void main(String[] args){
        // Type valeur
        // Déclarez la variable "a" en tant que "int" et l'initialiser avec une valeur de 10
        int a = 10;
        // Déclarez la variable "b" en tant que "int" et l'initialiser avec une copie de la valeur de "a"
        int b = a;
        System.out.println(a); // -> 10
        System.out.println(b); // -> 10
        a = 15;
        System.out.println(a); // -> 15
        System.out.println(b); // -> 10
    }

}
