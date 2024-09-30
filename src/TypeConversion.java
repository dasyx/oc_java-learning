public class TypeConversion {
    public static void main(String[] args){
        //Conversion de type automatique
        byte fromByte = 12; // 1 octet
        int toInt = fromByte; // 4 octets
        System.out.println(toInt);

        float fromFloat = 12.43f; // 4 octets
        double toDouble = fromFloat;

        char fromChar = 'a'; //
        int toIntFromChar = fromChar;
        System.out.println(toIntFromChar);

        //Conversion de type par cast
        int valeurDeD = 100;
        char d = (char) valeurDeD;

        //Le cast permet de convertir des types
        //Mais peut amener à de la perte de données
        //Le résultat sera arrondi
        float fromFloat2 = 12.5f;
        int toInt2 = (int) fromFloat2;
        System.out.println(toInt2);

        //Autre exemple
        int fromInt = 1321654651;
        byte toByte = (byte) fromInt;
        System.out.println(toByte);

    }
}
