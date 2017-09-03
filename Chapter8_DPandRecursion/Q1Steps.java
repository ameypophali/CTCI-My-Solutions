package Chap8DynamicProgAndRecursion;

import java.util.Arrays;

public class Q1Steps {

    private int numberOfWays(int n){
        if(n < 0){
            return 0;
        }
        else if(n == 0){
            return 1;
        }
        else{
            return numberOfWays(n-1) + numberOfWays(n-2) + numberOfWays(n-3);
        }
    }

    private int numberOfWaysTopDown(int n){
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        int count = numberOfWaysTopDown(n, memo);
        return count;
    }

    private int numberOfWaysTopDown(int n, int[] memo) {
        if(n < 0){
            return 0;
        }
        else if(n ==0){
            return 1;
        }
        else if(memo[n] > -1){
            return memo[n];
        }
        else{
            memo[n] = numberOfWaysTopDown(n-1, memo)
                        + numberOfWaysTopDown(n-2, memo)
                        + numberOfWaysTopDown(n-3, memo);
        }

        return memo[n];
    }
}
