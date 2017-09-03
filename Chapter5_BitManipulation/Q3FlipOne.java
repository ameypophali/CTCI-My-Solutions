package Chapter5BitManipulation;

import java.util.ArrayList;


/**
 * Created by ameyp on 7/11/2017.
 */
public class Q3FlipOne {

    public static int longestSeq(int num){
        ArrayList<Integer> freq = getSequence(num);
        return getlongestSeq(freq);
    }

    private static int getlongestSeq(ArrayList<Integer> freq) {
        int maxSeq = 0;


        for(int i=0;i<freq.size();i=i+2){
            int prevSeq = i==0 ? 0 : freq.get(i-1);
            int nextSeq = i==freq.size()-1 ? 0 : freq.get(i+1);
            int thisSeq = freq.get(i);

            if(thisSeq ==1){
                thisSeq = 1+prevSeq+nextSeq;
            }

            else if(thisSeq > 1){
                thisSeq = 1 + Math.max(prevSeq,nextSeq);
            }
            else if(thisSeq == 0){
                thisSeq = Math.max(prevSeq,nextSeq);
            }

            maxSeq = Math.max(maxSeq,thisSeq);
        }

        return maxSeq;
    }

    private static ArrayList<Integer> getSequence(int num) {

        int count = 0;
        int searchingFor = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0;i<Integer.BYTES*8;i++){
            if ((num & 1) != searchingFor) {
                result.add(count);
                searchingFor = num & 1;
                count = 0;
                }
            count++;
            num >>>= 1;
        }
        result.add(count);

        return result;
    }

    public static int longestSequence2(int num){
        int prev = 0;
        int current = 0;
        int maxSeq = 0;

        while(num != 0){
            if((num&1) ==1){
                current++;
            }
            else{
                prev = (num&2)==0 ? 0:current;
                current = 0;
            }
                maxSeq = Math.max(maxSeq, 1+prev+current);
                num>>>=1;
        }

        return maxSeq;
    }

    public static void main(String[] args){
        int num = 0;

        int result = longestSeq(num);

        System.out.print("Longest Sequence is : " + result);
    }

}

