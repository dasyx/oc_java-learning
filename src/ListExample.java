import java.util.List;
import java.util.ArrayList;

public class ListExample {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(12);
        numbers.add(25);
        numbers.add(33);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

