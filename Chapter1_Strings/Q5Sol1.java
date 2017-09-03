package Chapter1Strings;

/**
 * Created by ameyp on 5/18/2017.
 */
public class Q5Sol1 {

    public static boolean CheckOneAway(String s, String t){

        int diffLength = s.length() - t.length();
        boolean oneAway;

        if(diffLength ==0){
            oneAway = CheckOneAwayNoDiff(s,t);
        }
        else if(diffLength == 1){
            oneAway = CheckOneAwayDiff(s,t);
        }
        else if(diffLength == -1){
            oneAway = CheckOneAwayDiff(t,s);
        }
        else{
            return false;
        }

        return oneAway;
    }

    private static boolean CheckOneAwayDiff(String s, String t) {
        int index1 = 0, index2 = 0;

       while(index1 < s.length() && index2 < t.length()) {
           if (s.charAt(index1) != t.charAt(index2)) {
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

    private static boolean CheckOneAwayNoDiff(String s, String t) {
        boolean diff = false;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i) != t.charAt(i)){
                if(diff){
                    return false;
                }
            }

            diff = true;
        }

        return true;
    }
}
