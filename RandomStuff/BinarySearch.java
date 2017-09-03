package RandomStuff;

import java.util.Arrays;

/**
 * Created by ameyp on 5/31/2017.
 */
public class BinarySearch {

    public static int binarySearch(int[] numbers, int key){
        int size = numbers.length;

        int start = 0;
        int end = size -1;
        int mid;

        while(start <= end){
            mid = (start+end)/2;

            if(numbers[mid] == key){
                return mid;
            }

            if(numbers[mid] < key){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] num = {1,4,6,7,99,8,34,43,54};
        Arrays.sort(num);

        int index = binarySearch(num, 99);

        System.out.print("index is : " + index);

    }

}


