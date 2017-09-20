package Chapter3_QueueandStacks.Q3SetofStacks;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Created by ameyp on 6/17/2017.
 */
public class SetofStacks {
    private int stackSize;
    private ArrayList<Stack> arrayList = new ArrayList<>();

    public SetofStacks(int capacity) {
        stackSize = capacity;
    }

    public void push(int value) {
        Stack s = getTopStack();
        if (s != null && !s.isFull()) {
            s.push(value);
        } else {
            Stack stack = new Stack(stackSize);
            stack.push(value);
            arrayList.add(stack);
        }
    }

    public int pop(){
        Stack s = getTopStack();
        if(s == null){
            throw new EmptyStackException();
        }
        int data = s.pop();
        if(s.size == 0){
            arrayList.remove(arrayList.size() - 1);
        }

        return data;

    }

    private Stack getTopStack() {
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList.get(arrayList.size() - 1);
    }

}
