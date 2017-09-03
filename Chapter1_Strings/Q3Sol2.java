package Chapter1Strings;

public class Q3Sol2 {

    public static boolean CheckPalindrome(String s) {

        int[] freq = new int[128];

        for(int i = 0; i<s.length();i++){
            int f = s.charAt(i);
            freq[i]++;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]%2 != 0){
                return false;
            }
        }

        return true;
    }


    public static boolean checkPalinPerm(String s){
        int checker = arrangeBits(s);
        return checkOneBitSet(checker);
    }

    private static boolean checkOneBitSet(int checker) {
        return (checker&(checker-1)) == 0;
    }

    private static int arrangeBits(String s) {
        if(s == null){
            return 0;
        }

        int checker = 0;

        for(int i=0;i<s.length();i++){
            int value = s.charAt(i) - 'a';

            boolean bitVal = getBit(checker, value);
            checker = setBit(checker, value, !bitVal);
        }

        return checker;

    }

    private static boolean getBit(int num, int pos) {
        return ((num & (1<<pos)) != 0);
    }

    private static int setBit(int checker, int value, boolean b) {
        int i = b ? 1 : 0;
        int mask = ~(1<<value);

        return (checker&mask) | (1<<value);
    }

    public static void main(String[] args){

    }

}
