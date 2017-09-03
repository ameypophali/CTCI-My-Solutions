package Chapter1Strings;

/**
 * Created by ameyp on 5/17/2017.
 */
public class Q3Sol1 {

    public static boolean CheckPalindrome(String s){

        char[] c = s.toCharArray();
        int length = c.length;

        for(int i=0;i<length;i++){
            if(c[i] != c[length-i-1]){
                return false;
            }
        }

        return true;
        }


    public static void main(String[] a){
        String s = "ABCBA";

        boolean h = CheckPalindrome(s);
        System.out.print(h);
    }

    }

