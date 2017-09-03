package Chapter5BitManipulation;

/**
 * Created by ameyp on 7/11/2017.
 */
public class Q1ClearBitItoJ {

    /*
    EXAMPLE
    Input: N = 10000000000, M = 11001, i= 2, j = 6
    Output: N = 10001001100
    */

    public static int clearBitItoJ(int num, int m, int i, int j){
        int allOnes = ~0;

        int right = (1<<i)-1;
        int left = allOnes<<(j+1);

        int mask = right | left;

        int shiftJ = m<<i;

        int num_cleared = num & mask;

        System.out.println(Integer.toBinaryString(num) + "\n" +
                           Integer.toBinaryString(m) + "\n" +
                           Integer.toBinaryString(shiftJ | num_cleared));


        return shiftJ | num_cleared;
    }

    public  static void main(String[] args){
        clearBitItoJ(1048577, 32,2,6);

    }

}
