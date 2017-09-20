package Chapter3_QueueandStacks;

import java.util.Stack;

/**
 * Created by ameyp on 6/19/2017.
 */
public class Q5SortedStack {
    Stack<Integer> stack, sortedStack;

    public Q5SortedStack(){
        stack = new Stack<>();
        sortedStack = new Stack<>();
    }

    public void push(int value){
        if(sortedStack.isEmpty() && stack.isEmpty()){
            sortedStack.push(value);
        }
        else {
            while (sortedStack.peek() > value) {
                stack.push(sortedStack.pop());
            }

            sortedStack.push(value);

            while (stack.isEmpty()) {
                sortedStack.push(stack.pop());
            }
        }
    }

}


