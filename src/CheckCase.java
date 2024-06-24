public class CheckCase {
    public static void main(String[] args) {

        String mot = verifyCase("individu");

        System.out.println(mot);
    }

    public static String verifyCase(String word) {
        if(word.equals(word.toLowerCase())) {
            return word.toUpperCase();
        } else {
            return word.toLowerCase();
        }
    }
}
