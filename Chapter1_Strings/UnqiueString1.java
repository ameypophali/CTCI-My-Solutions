package Chapter1Strings;

import java.util.HashSet;

/**
 * Created by ameyp on 5/17/2017.
 */
public class UnqiueString1 {
    public static boolean CheckStringUnique(String s){

        HashSet<Character> set = new HashSet<>();

        char[] c = s.toCharArray();

        for(char a : c){
            if(!set.contains(a)){
                System.out.print("here " + a +"\n");
                set.add(a);
            }
            else{
                System.out.print(a);
                return false;
            }
        }
        return true;
    }


    public static boolean checkUnique(String s){
        int checker = 0;

        for(int i=0;i<s.length();i++){
            int value = s.charAt(i) - 'a';
            if((checker & (1<<value)) > 0){
                return false;
            }
            checker = checker | (1<<value);
        }
        return true;
    }

    public static void main(String[] a){
        String s = "AAmey";

        boolean h = CheckStringUnique(s);
        System.out.print(h);
    }
}
