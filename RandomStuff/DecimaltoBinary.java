package RandomStuff;

import java.util.Stack;

public class DecimaltoBinary {

    private static String decimaltoBinary(int num){


        Stack<Integer> result = new Stack<>();
        StringBuilder r = new StringBuilder();

        while(num > 0){
            int remainder = num%2;
            num = num/2;
            result.push(remainder);
        }

        while(!result.isEmpty()){
            r.append(result.pop());
        }

        return r.toString();

    }

    private static int BinarytoDecimal(String binary){
        int result = 0;
        int digit = 0, p = 0;

        char[] c = binary.toCharArray();

        Stack<Character> s = new Stack<>();

        for (char aC : c) {
            s.push(aC);
        }

        while(!s.isEmpty()){
            result = result + (int) (Character.getNumericValue(s.pop()) * Math.pow(2,p));
            p++;
        }

        return result;
    }

    public static void main(String[] args){
       String b =  decimaltoBinary(14);

        int num = BinarytoDecimal(b);

        System.out.print(num + " " + b);

    }

}
