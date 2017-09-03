package Chapter2LinkedLists;

public class Q4Sol {
    private static class LinkedListnodeSingly {

        LinkedListnodeSingly next;
        int value;

        LinkedListnodeSingly(int v) {
            value = v;
        }
    }

    private static LinkedListnodeSingly PartitionLinkedList(LinkedListnodeSingly node, int x){

        LinkedListnodeSingly currentSmall = null;
        LinkedListnodeSingly headSmall = null;
        LinkedListnodeSingly currentLarge = null;
        LinkedListnodeSingly headLarge = null;

        while(node != null) {

            if (node.value < x) {
                if (currentSmall == null) {
                    currentSmall = node;
                    headSmall = currentSmall;
                }
                else{
                    currentSmall.next = node;
                    currentSmall = node;
                }

            } else {
                if(currentLarge == null){
                    currentLarge = node;
                    headLarge = currentLarge;
                }
                else{
                    currentLarge.next = node;
                    currentLarge = node;
                }
            }
            node = node.next;
        }

        if(headSmall == null){
            return headLarge;
        }

        currentSmall.next = headLarge;

        return headSmall;
    }

    private static LinkedListnodeSingly PartitionLinkedList2(LinkedListnodeSingly node, int x){

        if(node == null){
            return null;
        }

        LinkedListnodeSingly head = node;
        LinkedListnodeSingly tail = node;

        while(node != null){

            if(node.value < x){
                   node.next = head;
                    head = node;
            }
            else{
                tail.next = node;
                tail = node;
            }
            node = node.next;
        }

        tail.next = null;

        return head;
    }

    public static void main (String[] args){
        LinkedListnodeSingly newLinkedList = new LinkedListnodeSingly(3);
        LinkedListnodeSingly head = newLinkedList;
        LinkedListnodeSingly passed = newLinkedList;

        newLinkedList.next = new LinkedListnodeSingly(5);
        newLinkedList = newLinkedList.next;
        newLinkedList.next = new LinkedListnodeSingly(7);
        newLinkedList = newLinkedList.next;
        newLinkedList.next = new LinkedListnodeSingly(9);
        newLinkedList = newLinkedList.next;
        newLinkedList.next = new LinkedListnodeSingly(19);
        newLinkedList = newLinkedList.next;
        newLinkedList.next = new LinkedListnodeSingly(1);

        LinkedListnodeSingly result = PartitionLinkedList(passed,5);

        LinkedListnodeSingly result1 = PartitionLinkedList2(passed,5);

    }
}

