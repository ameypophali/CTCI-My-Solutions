package Chapter3QueueandStacks;

import java.util.EmptyStackException;

public class MyStack<T> {
    private Node<T> top;

    private static class Node<T> {
        T val;
        Node<T> next;

        Node(T t) {
            this.val = t;
        }
    }

    public void push(T t){
       Node<T> newNode = new Node<T>(t);
       newNode.next = top;
       top = newNode;
    }

    public T pop() throws EmptyStackException{
        if(top == null){
            throw new EmptyStackException();
        }
        T returnVal = top.val;

        top = top.next;

        return returnVal;
    }

    public T peek(){
        if(top == null){
            throw new EmptyStackException();
        }
        return top.val;
    }

    public boolean isEmpty(){
        return top == null;
    }

}
