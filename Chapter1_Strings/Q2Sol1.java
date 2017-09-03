package Chapter1Strings;

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
/*
        boolean h = CheckPermutationString("Ameyaa", "ymafaeA");
        int t = 999;
        int j = 1000;

        StringBuilder s = new StringBuilder();

        while(t>0){
            int r=t%2;
            s.append(r);
            t=t/2;
        }


            while (j > 0) {
                int r = j % 2;
                s.append(r);
                j = j / 2;
            }

            System.out.print(s);*/
            byte b = 0;

            byte g = 1;

            byte h = 'a';

            if(h == 'a'){

            }


    }
}
