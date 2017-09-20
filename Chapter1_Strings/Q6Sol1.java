package Chapter1Strings;

/**
 * Created by ameyp on 5/18/2017.
 */
public class Q6Sol1 {

    public static String StringCompress(String s){

        int count = 1;
        char c = s.charAt(0);
        StringBuilder result = new StringBuilder();

        for(int i = 1; i < s.length(); i++){
            if(c == s.charAt(i)){
                count++;
            }
            else {
                result.append(c).append(count);
                c = s.charAt(i);
                count = 1;
            }
        }

        result.append(c).append(count);

        return result.length() < s.length() ? result.toString() : s;
    }

    public static void main(String[] args){
        String result = StringCompress("aaaabbbcccd");
        System.out.println(result);
    }
}
