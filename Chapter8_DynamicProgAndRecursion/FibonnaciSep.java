package Chap8DynamicProgAndRecursion;

public class FibonnaciSep {

    public static int FibMemoization(int n){
        int[] memo = new int[n+1];
        return fibnacciMemoiHelper(n, memo);
    }

    private static int fibnacciMemoiHelper(int n, int[] memo) {
        if(n==0||n==1){
            return n;
        }
        if(memo[n] == 0){
            memo[n] = fibnacciMemoiHelper(n-1, memo) + fibnacciMemoiHelper(n-2, memo);
        }

        return memo[n];
    }



    private static int FibonnaciBottomUp(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int[] memo = new int[n+1];

        for(int i=2;i<n;i++){
            memo[i] = memo[i-1] + memo[i-2];
        }

        return memo[n-1] + memo[n-2];

    }


    private static int FibonnaciBottomUpSpaceEfficient(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int a = 2, b = 3;
        int c = 0;


        while(b<n){
            c = a+ b;
            a = b;
            b = c;
        }

        return c;

    }
}
