package Chapter2_LinkedLists;
import java.util.HashSet;

public class Q1Sol1 {

    private class LinkedListnodeDoubly{

        LinkedListnodeDoubly next;
        LinkedListnodeDoubly prev;
        int value;

        LinkedListnodeDoubly(int v){
            value = v;
        }
    }

    private class LinkedListnodeSingly{

        LinkedListnodeSingly next;
        int value;

        LinkedListnodeSingly(int v){
            value = v;
        }
    }

    public static void RemoveDupDoubly(LinkedListnodeDoubly head){
        while(head != null){
            int d = head.value;

            LinkedListnodeDoubly current = head;

            while(current != null){
                if(current.value == head.value){
                    current.prev.next = current.next;
                    if(current.next != null){
                        current.next.prev = current.prev;
                    }
                current = current.next;
                }
                head = head.next;
            }
        }
    }


    public static void RemoveDupSingly(LinkedListnodeSingly head){
        HashSet<Integer> set = new HashSet<>();

        LinkedListnodeSingly current = head;
        LinkedListnodeSingly previous = null;

        while(current != null){
            if(set.contains(current.value)){
                previous.next = current.next;
            }
            else{
                set.add(current.value);
                previous = current;
            }
            current = current.next;
        }


    }

}
