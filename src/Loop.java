public class Loop {
//    public static void main(String[] args) {
//        for(int i=0; i < 5; i++) {
//            System.out.println("Clap your hands");
//        }
//    }
//    // Enhanced for loop
//    public static void main(String[] args) {
//        int[] myArray = {4, 13, 22, 31};
//        for (int j : myArray) {
//            System.out.println(j);
//        }
//    }
    public static void main(String[] args) {
        int[] myArray = {4, 13, 25, 36, 47};
        int sum = 0;
        for(int i=0; i < myArray.length; i++){
            sum += myArray[i];
        }
        System.out.println(sum);
    }
}
