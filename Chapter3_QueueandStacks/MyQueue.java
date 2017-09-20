package Chapter3_QueueandStacks;

import java.util.NoSuchElementException;

public class MyQueue<T> {

    private static class Node<T>{
        T data;
        Node<T> next;

        Node(T t){
            this.data = t;
        }
    }

    private Node<T> top;
    private Node<T> last;

    public void push(T t){
        Node<T> newNode = new Node<T>(t);

        if(last != null){
            last.next = newNode;
        }
         last = newNode;

        if(top == null){
            top = last;
        }
    }

    public T pop(){
        if(top == null){
            throw new NoSuchElementException();
        }
        T item = top.data;

        top = top.next;

        if(top == null){
            last = null;
        }

        return item;

    }

    public boolean isEmpty(){
        return top == null;
    }

    public T peek(){
        if(top == null) {
            throw new NoSuchElementException();
        }
        return top.data;
    }

}

class QueueTest{

    public static void main(String[] args){

        MyQueue<Integer> q = new MyQueue<>();

        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);

        q.pop();

        int a = q.peek();

        System.out.print(a);

    }

}



