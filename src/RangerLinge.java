public class RangerLinge {

    public static void main(String[] args) {
        int rangerLinge = 12;

        while (rangerLinge > 0) {

            rangerLinge--;

            String message = "Il me reste " + rangerLinge + " vêtements à ranger.";
            if (rangerLinge < 4) {
                message = message.toUpperCase();
            }
            System.out.println(message);

            if (rangerLinge == 4 || rangerLinge == 7) {
                System.out.println("Je fais une pause et je reprends !");
            }

            if (rangerLinge == 10) {
                System.out.println("J'ai perdu le " + rangerLinge + "ème vêtement !");
                continue;
            }
        }
        System.out.println("J'ai rangé tout le linge !!");
    }

}
