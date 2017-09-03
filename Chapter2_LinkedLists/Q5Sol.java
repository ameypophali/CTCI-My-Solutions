package Chapter2LinkedLists;

public class Q5Sol {

    private static class LinkedListnodeSingly {

        LinkedListnodeSingly next;
        int value;

        LinkedListnodeSingly(int v) {
            value = v;
        }

        LinkedListnodeSingly() {}

    }

    private static LinkedListnodeSingly LinkedListSum(LinkedListnodeSingly node, LinkedListnodeSingly node1) {

        if(node == null && node1 == null){
            return null;
        }

        int firstNum = convertToInteger(node);
        int secondNum = convertToInteger(node1);

        int sum = firstNum + secondNum;

        LinkedListnodeSingly result = convertToLinkedlist(sum);

        return result;

    }

    private static LinkedListnodeSingly convertToLinkedlist(int sum) {
        int num = 0;
        LinkedListnodeSingly head = null, current = null;

        while(sum != 0){
            num = sum%10;
            if(head == null){
                head = new LinkedListnodeSingly(num);
                head.next = null;
                current = head;
            }
            else{
                LinkedListnodeSingly newNode = new LinkedListnodeSingly(num);
                current.next = newNode;
                current = newNode;
            }
            sum = sum/10;
        }
        return head;
    }

    private static int convertToInteger(LinkedListnodeSingly node) {
        int num = 0;
        int i = 0;

        LinkedListnodeSingly head = node;

        while(head != null){
            num = (int) (num + head.value* Math.pow(10,i));
            i++;
            head = head.next;
        }

        return num;

    }

    private static LinkedListnodeSingly LinkedListSum(LinkedListnodeSingly node, LinkedListnodeSingly node1, int carry) {

        if(node == null && node1 == null && carry == 0){
            return null;
        }

        LinkedListnodeSingly result = new LinkedListnodeSingly();

        int value = 0;

        if(node != null){
            value += node.value;
        }

        if(node1 != null){
            value += node1.value;
        }

        result.value = value%10;

        if(node != null || node1 != null){
            LinkedListnodeSingly more = LinkedListSum(node == null ? null : node.next,
                                    node1 == null ? null : node1.next,
                                    value > 10 ? 1 : 0);
           // result.setNext(more);
        }

        return result;
    }

    public static void main (String[] args){
        LinkedListnodeSingly newLinkedList = new LinkedListnodeSingly(9);
        LinkedListnodeSingly head = newLinkedList;
        LinkedListnodeSingly passed = newLinkedList;

        newLinkedList.next = new LinkedListnodeSingly(5);
        newLinkedList = newLinkedList.next;
        newLinkedList.next = new LinkedListnodeSingly(7);
        newLinkedList = newLinkedList.next;
        newLinkedList.next = new LinkedListnodeSingly(9);
        newLinkedList = newLinkedList.next;
        newLinkedList.next = new LinkedListnodeSingly(7);
        newLinkedList = newLinkedList.next;
        newLinkedList.next = new LinkedListnodeSingly(0);

        newLinkedList = newLinkedList.next;

        newLinkedList.next = null;

        LinkedListnodeSingly result = LinkedListSum(passed, passed);

        System.out.print("Idieee 111" );
        System.out.print(" First num is - " + result);

    }




}