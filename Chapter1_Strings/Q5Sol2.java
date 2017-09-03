package Chapter1Strings;

/**
 * Created by ameyp on 5/18/2017.
 */
public class    Q5Sol2 {

    private static boolean CheckOneAwayDiff(String s, String t) {

        if(s.length() - t.length() > 1 || s.length() - t.length() < -1 ){
            return false;
        }

       String large = s.length() > t.length() ? s : t;
        String small = s.length() > t.length() ? t : s;

        int index1 = 0, index2 = 0;
        boolean diff= false;

        while(index1 < large.length() && index2 < small.length()) {
            if (s.charAt(index1) != t.charAt(index2)) {

                if(diff){
                    return false;
                }

                diff = true;

                if(index1 != index2){
                    return false;
                }
                index1++;
            }
            else{
                index1++;
                index2++;
            }
        }
        return true;
    }


}
