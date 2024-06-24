public class Control {

    public static void main(String[] args) {
        System.out.println(Exemple.text);
    }

}

class Exemple {

    static String text = "hello";
    //private static String text = "hello";
    //public String text = "hello";

    static void printText(){
        System.out.println(text);
    }
}
