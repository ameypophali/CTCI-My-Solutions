package Chapter3_QueueandStacks.Q3SetofStacks;

import java.util.EmptyStackException;

public class Stack{
    private Node top;
    private int capacity;
    public int size = 0;

    Stack(int cap){
        this.capacity = cap;
    }

    public void push(int val)  {
        if(isEmpty()){
            top = new Node(val);
        }
        else {
            size++;
            Node newNode = new Node(val);
            newNode.next = top;
            top = newNode;
        }
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        else{
            size--;
            int data = top.data;
            top = top.next;

            return data;
        }
    }

    private boolean isEmpty() {
        return top == null;
    }

    private int peek(){
        return top.data;
    }

    boolean isFull(){
        return size == capacity;
    }
}
