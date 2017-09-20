package Chap8DynamicProgAndRecursion.Q5RecusiveMultiplication;

public class RMultiply {


    private int multiplyRecursive(int a, int b){
        int smaller = a > b ? b : a;
        int bigger = a > b ? a : b;
        int[] memo = new int[smaller+1];
        return multiplyRecursiveHelper(smaller, bigger, memo);
    }

    private int multiplyRecursiveHelper(int smaller, int bigger, int[] memo) {
        if(smaller == 0){
            return 0;
        }
        else if(smaller == 1){
            return bigger;
        }
        else if(memo[smaller] > 0){
            return memo[smaller];
        }

        int s = smaller>>1;
        int firstSide = multiplyRecursive(s, bigger);
        int secondSide = firstSide;
        if(smaller%2 == 1){
            //secondSide = multiplyRecursiveHelper(smaller - s, bigger, memo);
            //Even better
            secondSide = firstSide + firstSide + bigger;
        }

        memo[smaller] = firstSide + secondSide;
        System.out.println(smaller + " " + memo[smaller]);
        return firstSide + secondSide;
    }

    public static void main(String[] args){
        RMultiply r = new RMultiply();
        int a = 1123;
        int b = 345676;

        int multiply = r.multiplyRecursive(a,b);

    }
}
