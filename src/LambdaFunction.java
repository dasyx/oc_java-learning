import java.util.ArrayList;
import java.util.List;

public class LambdaFunction {

    public static void main(String[] args) {
        // Créer une liste de nombres entiers
        List<Integer> nombres = new ArrayList<>();
        nombres.add(1);
        nombres.add(2);
        nombres.add(3);
        nombres.add(4);
        nombres.add(5);

        // Utiliser une boucle classique pour afficher chaque élément
        System.out.println("Affichage des nombres avec une boucle classique :");
        for (Integer nombre : nombres) {
            System.out.println(nombre);
        }

        // Utiliser une expression lambda pour afficher chaque élément
        System.out.println("\nAffichage des nombres avec une expression lambda :");
        nombres.forEach(System.out::println);

        // Utiliser une expression lambda pour filtrer et afficher les nombres pairs
        System.out.println("\nAffichage des nombres pairs avec une expression lambda :");
        nombres.stream()
                .filter(nombre -> nombre % 2 == 0)  // Filtre pour ne garder que les nombres pairs
                .forEach(System.out::println);  // Affiche chaque nombre pair
    }
}
