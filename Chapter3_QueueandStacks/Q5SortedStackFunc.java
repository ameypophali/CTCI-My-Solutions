package Chapter3QueueandStacks;

import java.util.Stack;

/**
 * Created by ameyp on 6/19/2017.
 */
public class Q5SortedStackFunc {

    Stack<Integer> mainStack;

    public Q5SortedStackFunc(int[] array){

        mainStack = new Stack<>();

        for (int element : array) {
            mainStack.push(element);
        }
    }

    public void sortMainStack(){
        Stack<Integer> stack = new Stack<>();

        while(!mainStack.isEmpty()){
            int temp = mainStack.pop();

            while(!stack.isEmpty() && stack.peek() > temp){
                mainStack.push(stack.pop());
            }

            stack.push(temp);

        }

        mainStack = stack;
    }
}
