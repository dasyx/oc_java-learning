public class Mutable {
    public static void main(String[] args) {
        var entier = 0;
        entier = 5; // entier est mutable (modifiable) par défaut
        System.out.println("entier = " + entier);

        final var entierFinal = 0;
        // entierFinal = 5; // Erreur de compilation : entierFinal est immuable
        System.out.println("entierFinal = " + entierFinal);

        final var entierFinalMutable = new int[1];
        entierFinalMutable[0] = 5; // entierFinalMutable est mutable
        System.out.println("entierFinalMutable[0] = " + entierFinalMutable[0]);

        final var entierFinalImmutable = new int[1];
        // entierFinalImmutable = new int[1]; // Erreur de compilation : entierFinalImmutable est immuable
        entierFinalImmutable[0] = 5; // entierFinalImmutable est mutable
        System.out.println("entierFinalImmutable[0] = " + entierFinalImmutable[0]);

        final var chaine = "chaine";
        // chaine = "autre chaine"; // Erreur de compilation : chaine est immuable




    }
}
