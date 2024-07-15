public class Parameter {

    public static void main(String[] args){
        int result = displayParameter(4, 8);
        System.out.println(result);
    }
    public static int displayParameter(int length, int width){
        return 2*(length + width);
    }

}
