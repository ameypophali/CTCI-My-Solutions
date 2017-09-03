package Chapter1Strings;

/**
 * Created by ameyp on 5/17/2017.
 */
public class Q2Sol2 {

    public static boolean CheckPermutation(String s, String s1){

        if(s.length() != s1.length()){
            return false;
        }

        int[] count = new int[128];

        char[] c = s.toCharArray();
        char[] c1 = s.toCharArray();

        for(char a : c){
            int i = a;
            count[i]++;
        }

        for(char a : c1){
            int i = a;
            count[i]--;
            if(count[i] < 0){
                return false;
            }
        }

        return true;

    }

}
