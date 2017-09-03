package RandomStuff;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Created by ameyp on 7/5/2017.
 */
public class MaxHeapList <T extends Comparable<T>>{
    private ArrayList<T> items;

    public MaxHeapList(){
        items = new ArrayList<>();
    }

    //Add the item at the last position and make changes as required
    public void insert(T t){
        items.add(t);
        shiftUp();
    }

    //Shifts the newly added item upwards if its greater than its parent
    private void shiftUp() {
        int k = items.size()-1;
        while(k>0){
            //Parent of an item resides at (k-1)/2 in the ArrayList
            // where k is the item's index
            int p = (k-1)/2;

            T item = items.get(k);
            T parent = items.get(p);

            if(item.compareTo(parent) > 0){
                //Swap the elements
                items.set(k,parent);
                items.set(p,item);

                k = p;
            }
            else{
                break;
            }
        }
    }

    //Remove the root and shift the tree upwards
    public T remove(){
        //Handle special cases
        if(items.isEmpty()){
            throw new NoSuchElementException();
        }
        if(items.size()==1){
            return items.remove(0);
        }

        T temp = items.get(0);
        items.set(0,items.remove(items.size()-1));
        shiftDown();

        return temp;
    }

    //After removing root, shift the corresponding child nodes upwards
    //The bigger child goes to parent node
    private void shiftDown() {
        int k = 0;
        int l = 2*k+1; //Left child resides at 2k+1 index

        while(l<items.size()){
            int maxOfChilds = l;
            int r = l+1;  //right child resides at 2k+2 index

            if(r<items.size()){
                if(items.get(r).compareTo(items.get(l)) > 0){
                    maxOfChilds++;
                }
            }

            if(items.get(k).compareTo(items.get(maxOfChilds)) > 0) {
                T temp = items.get(k);
                items.set(k, items.get(maxOfChilds));
                items.set(maxOfChilds, temp);
                k = maxOfChilds;
                l = 2*k+1;
            }
            else{
                break;
            }
        }
    }

    //Returns size of heap
    public int size(){
        return items.size();
    }

    //Returns if the heap is empty
    public boolean isEmpty(){
        return items.isEmpty();
    }

    //Returns heap elements in a String
    public String toString(){
        return items.toString();
    }
}
