package Chapter2LinkedLists;

import java.util.Stack;

/**
 * Created by ameyp on 5/23/2017.
 */
public class Q6Sol {

    private static class LinkedListnodeSingly {

        LinkedListnodeSingly next;
        int value;

        LinkedListnodeSingly(int v) {
            value = v;
        }

        LinkedListnodeSingly() {}

    }

    //Check by reversing the linkedlist and comparing with original
    private boolean checkPalindromeList(LinkedListnodeSingly node){

        if(node == null){
            return false;
        }

        LinkedListnodeSingly head = node;
        LinkedListnodeSingly revrseHead = null;

        while(node != null){
            LinkedListnodeSingly n = new LinkedListnodeSingly(node.value);
            n.next = revrseHead;
            revrseHead = n;
            node = node.next;
        }

        while(head != null && revrseHead != null){
            if(head.value != revrseHead.value){
                return false;
            }

            head = head.next;
            revrseHead = revrseHead.next;
        }

        return true;
    }

    //Check by checking first half with the second half
    private boolean checkPalindromeList1(LinkedListnodeSingly node){

        if(node == null){
            return false;
        }

        LinkedListnodeSingly slow = node;
        LinkedListnodeSingly fast = node;

        Stack<Integer> stack = new Stack<>();

        while(fast != null && fast.next != null){
            stack.push(node.value);
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast != null){
            slow = slow.next;
        }

        while(slow != null){
            int data = stack.pop();
            if(data != slow.value){
                return false;
            }

            slow = slow.next;
        }

        return true;
    }
}
