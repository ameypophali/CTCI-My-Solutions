package Chapter1_Strings;

/**
 * Created by ameyp on 5/17/2017.
 */
public class Q2Sol1 {

    public static boolean CheckPermutationString(String s, String s1){

        if(s.length() != s1.length()){
            return false;
        }

        char[] c = s.toCharArray();
        char[] c1 = s1.toCharArray();

        java.util.Arrays.sort(c);
        java.util.Arrays.sort(c1);

        s = new String(c);
        s1 = new String(c1);

        return s.equals(s1);
    }

    public static void main(String[] a){

        boolean h = CheckPermutationString("Ameyaa", "ymafaeA");

        System.out.print(h);

    }
}
