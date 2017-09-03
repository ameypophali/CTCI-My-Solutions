package Chapter3QueueandStacks;

import java.util.NoSuchElementException;

public class C3SolStackArray {
    private final int size;
    private int top;
    private int[] array;

    public C3SolStackArray(int c){

        if(c<=0){
            throw new IllegalArgumentException();
        }

        size = c;
        array = new int[c];
        top = -1;
    }

    public void push(int num){
        if(top == size-1){
            System.out.println("Stack full!");
        }
        else{
            top++;
            array[top] = num;
        }
    }

    public int remove(){
        if(top < 0){
            System.out.println("Stack empty!");
            throw new NoSuchElementException();
        }

        int i = array[top];
        top = top - 1;

        return i;
    }


}
