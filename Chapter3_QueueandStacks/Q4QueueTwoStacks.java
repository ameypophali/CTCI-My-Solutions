package Chapter3_QueueandStacks;


import java.util.Stack;

public class Q4QueueTwoStacks<T> {
    private Stack<T> inStack;
    private Stack<T> outStack;

    public Q4QueueTwoStacks(){
        inStack = new Stack<T>();
        outStack = new Stack<T>();
    }

    public void push(T value){
        inStack.push(value);
    }

    public T pop(){
        shiftStacks();
        return outStack.pop();

    }

    private void shiftStacks() {
        if(outStack.isEmpty()){
            while(!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
    }

    public T peek(){
        shiftStacks();
        return outStack.peek();
    }

    public int size(){
        return inStack.size() + outStack.size();
    }

}
