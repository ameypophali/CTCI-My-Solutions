package Chapter16Moderate;

public class Q1SwapNumbers {

    public static void swapNumbers(int a, int b){
        System.out.println("Initial a and b - "  + a + " " + b);
        a = a - b;
        b = a + b;
        a = b - a;
        System.out.println("Final a and b - "  + a + " " + b);
    }

    public static void swap(boolean a, boolean b){
        a = a^b;
        b = a^b;
        a = a^b;
    }

    public static void main(String[] args){
        swapNumbers(12,9);
        swapNumbers(45,44);

        swap(true,false);

    }
}
