package Chapter3QueueandStacks;

import java.util.EmptyStackException;

public class Q2MinElement {

    public class Node{
        int data;
        Node next;

        private Node(int val) {
            this.data = val;
        }
    }

    private Node top;
    private Node min = new Node(Integer.MAX_VALUE);

    public void push(int val){
        if(top == null){
            top = new Node(val);
        }
        else{
            Node newNode = new Node(val);
            if(val < min.data){
                min = newNode;
            }
            newNode.next = top;
            top = newNode;
        }
    }

    public int pop(){
        if(top == null){
            throw new EmptyStackException();
        }
        if(top == min){
            min = findNewMin();
        }
            int data = top.data;
            top = top.next;

        return data;
    }

    private Node findNewMin() {
        Node current = top;
        Node min = new Node(Integer.MAX_VALUE);
        while(current != null){
            if(current.data < min.data){
                min = current;
            }
            current = current.next;
        }
        return min;
    }


}
