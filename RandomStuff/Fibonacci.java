package RandomStuff;

import java.util.Scanner;

/**
 * Created by ameyp on 6/2/2017.
 */
public class Fibonacci {

    private static int fibonacci(int a){

        int[] f = new int[a+1];

        f[0] = 0;
        f[1] = 1;

        f[a] = f[a-1]+f[a-2];

        if(a==0){
            return 0;
        }
        else if(a==1){
            return 1;
        }

       return fibonacci(a-1) + fibonacci(a-2);
    }

    public static void main(String args[]){

        for(int j=0;j<100;j++){
            System.out.print(fibonacci(j) + " ");
        }

    }

}
