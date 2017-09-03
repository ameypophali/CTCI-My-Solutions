package Chapter16Moderate;

import java.util.HashMap;
import java.util.Map;

public class Q2FindWord {

    public static HashMap<String, Integer> getFreq(String[] book){
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : book){
            word = word.trim().toLowerCase();
            int count = map.getOrDefault(word, 0);
            count++;
            map.put(word, count);
        }
        return map;
    }

    public static int findWordFreq(HashMap map, String word){
        word = word.trim().toLowerCase();
        if(map.containsKey(word)){
            return (int) map.get(word);
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args){
        String[] book = {"Amey", "Pophali", "Amey", "Pophali", "Amey", "Abcd"};
        String amey = "Amey";
        String abcd = "Abcd";
        String p = "Pophali";

        HashMap map = getFreq(book);
        int countAmey = findWordFreq(map, amey);
        int countAbcd = findWordFreq(map, abcd);
        int countP = findWordFreq(map, p);

        System.out.print(countAmey + " " + countAbcd + " " + countP);
    }
}
