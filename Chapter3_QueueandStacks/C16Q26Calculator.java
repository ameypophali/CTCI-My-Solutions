package Chapter3QueueandStacks;


public class C16Q26Calculator {

    public static int arithmeticCalculator(String seq){

        int result = 0;
        int buffer;

        if(seq.equals(null)){
            return 0;
        }

        for(char s : seq.toCharArray()){
            if(s == '-'){
                result = result + Character.getNumericValue(s);
            }

            System.out.print(result);
        }

        return result;

    }

    public static void main(String[] args){
        int val = arithmeticCalculator("-2");
        System.out.print(val + " result ");
    }

}
