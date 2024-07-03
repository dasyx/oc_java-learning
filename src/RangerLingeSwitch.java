public class RangerLingeSwitch {

    public static void main(String[] args) {

        int rangerLinge = 12;

        while (rangerLinge > 0) {

            rangerLinge--;

            switch (rangerLinge) {
                case 1:
                case 2:
                case 3:
                    String message = "Il me reste " + rangerLinge + " vêtements à ranger !!";
                    message = message.toUpperCase();
                    System.out.println(message);
                    break;
                case 4:
                case 7:
                    System.out.println("Je fais une pause et je reprends");
                    break;
                case 10:
                    System.out.println("J'ai perdu le " + rangerLinge + "ème vêtement !");
                    break;
                default:
                    System.out.println("Il me reste " + rangerLinge + " vêtements à ranger");
                    break;
            }
        }

        System.out.println("Enfin, j'ai rangé tout le linge !");
    }
}

