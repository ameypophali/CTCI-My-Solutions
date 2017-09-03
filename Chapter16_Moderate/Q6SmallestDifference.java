package Chapter16Moderate;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q6SmallestDifference {

    public static int bruteForce(int[] a, int[] b){
        if(a == null || b == null){
            return -1;
        }

        int min = Integer.MAX_VALUE;

        for (int anA : a) {
            for (int aB : b) {
                if (Math.abs((anA - aB)) < min) {
                    min = Math.abs(anA - aB);
                }
            }
        }

        return min;
    }

    public static int optimized(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);

        int indexA = 0;
        int indexB = 0;
        int min = Integer.MAX_VALUE;

        while(indexA < a.length && indexB < b.length){
            if(Math.abs(a[indexA] - b[indexB]) < min){
                min = Math.abs(a[indexA] - b[indexB]);
            }


            if(a[indexA] < b[indexB]){
                indexA++;
            }
            else{
                indexB++;
            }
        }

        return min;
    }
}
