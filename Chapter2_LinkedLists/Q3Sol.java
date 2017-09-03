package Chapter2LinkedLists;

/**
 * Created by ameyp on 5/19/2017.
 */
public class Q3Sol {

    private class LinkedListnodeSingly {

        LinkedListnodeSingly next;
        int value;

        LinkedListnodeSingly(int v) {
            value = v;
        }
    }

    public boolean deleteMiddleNode(LinkedListnodeSingly n){
        if(n == null){
            return false;
        }

        LinkedListnodeSingly next = n.next;

        n.value = next.value;

        n.next = next.next;

        return true;

    }
}
