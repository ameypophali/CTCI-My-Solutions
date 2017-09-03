package Chapter5BitManipulation;

/**
 * Created by ameyp on 7/15/2017.
 */
public class ClearBit {
    public static String clearBit(){
        int l = ~0;

        for(int i=2;i<=42;i+=2){
            //System.out.print("here = " + Integer.toBinaryString(l) + "\n");
            l = setbitto(l,i,false);
        System.out.print("here = " + Integer.toBinaryString(l) + "\n");
        }

        return Integer.toBinaryString(l);
    }

    public static int setbitto(int num, int i, boolean isOne){
        int value = isOne ? 1 : 0;

        int mask = ~(1<<i);

        return (num & mask) | (value<<i) ;
    }

    public static void main(String[] args){
        String result = clearBit();
        //System.out.print(result);
    }
}
