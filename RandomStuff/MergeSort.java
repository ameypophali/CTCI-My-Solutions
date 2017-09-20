package RandomStuff;

import com.sun.scenario.effect.Merge;

import java.util.Arrays;

public class MergeSort {
    private static int[] nums ;
    private static int[] helper;

    public MergeSort() {
    }

    public int[] mergeSort(int[] array){
        if(array == null){
            return null;
        }

        mergeSort(0,array.length);
    }

    public void mergeSort(int low, int high){
        if(low < high) {
            int middle = (low + high) / 2;
            mergeSort(low, middle);
            mergeSort(middle + 1, high);
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {
        for(int i=0;i<=high;i++){
            helper[i] = nums[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;

        while(i <= middle && j <= high){
            if(helper[i] < helper[j]){
                nums[k] = helper[i];
                i++;
            }
            else {
                nums[k] = helper[j];
                j++;
            }
            k++;
        }

        int remaining = i - middle;
        for(int r=0;r<=remaining;r++){
            nums[k+r] = helper[k+r];
        }
    }
}

class MergeSortTest{

    public static void main(String[] args) throws Exception {
        int[] array = {9,5,3,6,2,3,8,1,7,4};
        MergeSort mergeSort = new MergeSort();
        int[] arraySorted = mergeSort.mergeSort(array);

        System.out.println(Arrays.toString(arraySorted));
    }
}
