package Chap8DynamicProgAndRecursion.Q3MagicIndex;

public class MagicIndex {

    private int getMagicIndexBruteForce(int[] array){
        if(array == null ){
            return -1;
        }

        for(int i=0;i<array.length;i++){
            if(array[i] == i){
                return i;
            }
        }

        return -1;
    }

    private int magicIndexBinarySearch(int[] array){
        if(array == null)
        {
            return -1;
        }

        return magicIndexBinarySearch(array, 0, array.length);
    }

    //Works only if values in the array are distinct
    private int magicIndexBinarySearch(int[] array, int start, int end) {
        if(end < start){
            return -1;
        }

        int mid = (start + end)/2;

        if(mid == array[mid]){
            return mid;
        }
        else if(mid > array[mid]){
            return magicIndexBinarySearch(array, mid+1, end);
        }
        else {
            return magicIndexBinarySearch(array, start, mid-1);
        }
    }

    //Works for non distinct valued array as well
    private int magicIndex(int[] array){
        if(array == null){
            return -1;
        }

        return magicIndexHelper(array, 0, array.length);
    }

    private int magicIndexHelper(int[] array, int start, int end) {
        if(end < start){
            return -1;
        }

        int mid = (start + end)/2;

        if(mid == array[mid]){
            return mid;
        }

        int leftIndex = Math.min(mid-1, array[mid]);
        int left = magicIndexHelper(array, 0, leftIndex);
        if(left > 0){
            return left;
        }

        int rightIndex = Math.max(array[mid], mid+1);
        return magicIndexHelper(array, rightIndex, end);
    }

}
