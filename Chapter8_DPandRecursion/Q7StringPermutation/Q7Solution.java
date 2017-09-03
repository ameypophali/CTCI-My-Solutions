package Chap8DynamicProgAndRecursion.Q7StringPermutation;

import java.util.ArrayList;

public class Q7Solution {

    private ArrayList<String> getStringPermutation(String string){
        if(string == null) return null;

        ArrayList<String> allPerms = new ArrayList<>();;
        if(string.length() == 0){
            allPerms.add("");
        }
        else{
            char firstChar = string.charAt(0);
            String remainder = string.substring(1);
            ArrayList<String> words = getStringPermutation(remainder);
            for(String word : words) {
                for (int i = 0; i <= word.length(); i++) {
                    String newPermutation = insertCharAt(word, firstChar, i);
                    allPerms.add(newPermutation);
                }
            }
        }

        return allPerms;
    }

    private String insertCharAt(String word, char firstChar, int i) {
        String start = word.substring(0, i);
        String end = word.substring(i,word.length());
        return start+firstChar+end;
    }
}
