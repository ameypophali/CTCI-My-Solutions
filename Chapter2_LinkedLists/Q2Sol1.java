package Chapter2LinkedLists;

/**
 * Created by ameyp on 5/18/2017.
 */
public class Q2Sol1 {

    private class LinkedListnodeSingly {

        LinkedListnodeSingly next;
        int value;

        LinkedListnodeSingly(int v) {
            value = v;
        }
    }

    public LinkedListnodeSingly ReturnKthElement(LinkedListnodeSingly head, int k) {

        LinkedListnodeSingly first = head;
        LinkedListnodeSingly second = head;

        for (int i = 0; i <= k; i++) {
            if (first == null) return null;
            first = first.next;
        }

        while (first != null) {
            second = second.next;
            first = first.next;
        }

        return second;
    }

    public int KthElementRecursive(LinkedListnodeSingly head, int k) {
        if (head == null) {
            return 0;
        }

        int result = KthElementRecursive(head.next, k) + 1;

        if (result == k) {
            System.out.println("Kth to the last node val - " + head.value);
        }

        return result;
    }

}