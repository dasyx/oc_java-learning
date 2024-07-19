public class ValuesCompare {

    public static void main(String[] args){
        System.out.println(compareFunction(firstValue, secondValue));
   }

   static String firstValue = "Un exemple de texte";
   static String secondValue = "Un autre exemple";

    public static String compareFunction(String value1, String value2){
        if(value1.equals(value2)){
            return "Les valeurs sont identiques !";
        } else {
            return "Les valeurs sont différentes !";
        }
    }
}