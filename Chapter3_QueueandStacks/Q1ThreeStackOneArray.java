package Chapter3_QueueandStacks;

import java.util.EmptyStackException;

public class Q1ThreeStackOneArray {

    private final int STACKSIZE = 10;
    private final int STACKS = 3;
    private int[] buffer;
    private int[] stackPointer = {-1,-1,-1};

    public Q1ThreeStackOneArray(){
        buffer = new int[STACKSIZE*STACKS];
    }

    public void push(int stackNum, int val) throws Exception{
        if(isFull(stackNum)){
             throw new FullStackException();
        }
        else{
            stackPointer[stackNum]++;
            buffer[indexOfTop(stackNum)] = val;
        }
    }

    public int pop(int stackNum){
        if(isEmpty(stackNum)){
            throw new EmptyStackException();
        }
        int data = buffer[indexOfTop(stackNum)];
        stackPointer[stackNum] = 0;
        stackPointer[stackNum]--;

        return data;
    }

    private boolean isEmpty(int stackNum) {
        return stackPointer[stackNum] == -1;
    }

    private int indexOfTop(int stackNum) {
        return stackNum*STACKSIZE + stackPointer[stackNum];
    }

    private boolean isFull(int stackNum) {
        return stackPointer[stackNum] + 1 >= STACKSIZE;
    }

}
