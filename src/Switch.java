public class Switch {

    public static void main(String[] args) {
        int day = 5;
        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };

        System.out.println(dayType);

    }

}
