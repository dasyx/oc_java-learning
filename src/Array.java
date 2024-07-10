public class Array {

    public static void main(String[] args) {

        int[] nombres;

        nombres = new int[5];

        nombres[0] = 10;
        nombres[1] = 20;
        nombres[2] = 30;
        nombres[3] = 40;
        nombres[4] = 50;

        for(int i = 0; i < nombres.length; i++) {
            //System.out.println(nombres[i]);
            System.out.println("nombres[" + i + "] = " + nombres[i]);
        }

    }

}
