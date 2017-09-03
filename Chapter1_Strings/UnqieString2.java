package Chapter1Strings;

/**
 * Created by ameyp on 5/17/2017.
 */
public class UnqieString2 {

    public static boolean CheckUniqueString(String s){

        boolean[] b = new boolean[128];
        char[] c = s.toCharArray();

        for(char h : c){
            int i = h;

            if(b[h]){
                return false;
            }
            else {
                b[h] = true;
            }

        }

        return true;

    }

    public static void main(String[] a){
        String s = "bbAmey";

        boolean h = CheckUniqueString(s);
        System.out.print(h);
    }

}
