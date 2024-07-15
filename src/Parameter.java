public class Parameter {

    public static void main(String[] args){
        int result = displayParameter(4, 8);
        System.out.println(result);

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
    public static int displayParameter(int length, int width){
        return 2*(length + width);
    }


}
