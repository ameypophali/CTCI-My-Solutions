package RandomStuff;

public class Solution {

      public static class ListNode {
          int val;
          ListNode next;

          ListNode(int x) {
              val = x;
              next = null;
          }
      }


    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }

        int lengthA = getLength(headA);
        int lengthB = getLength(headB);

        if(lengthA-lengthB >= 0){
            headA = equalizeLength(headA, lengthA-lengthB);
        }
        else{
            headB = equalizeLength(headB, lengthB-lengthA);
        }


        while(headA != null && headB != null){
            //System.out.println(headA.val+ " " + headB.val);
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }

    private static ListNode equalizeLength(ListNode node, int num){
        if(node == null){
            return null;
        }

        while(num > 0 && node != null){
            node = node.next;
            num--;
        }
        return node;
    }

    private static int getLength(ListNode node){
        ListNode current = node;
        int length = 0;

        if(current == null) {
            return 0;
        }

        while(current != null){
            length++;
            current = current.next;
        }

        return length;
    }

 /*   public static void main(String[] args){

        Solution s = new Solution();

        ListNode node0 = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(1);

        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        ListNode node9 = new ListNode(9);
        ListNode node10 = new ListNode(10);


        node1.next = node2;
        node2.next = node3;
        node3.next = node10;

        node6.next = node7;
        node7.next = node8;
        node8.next = node10;
        node10.next = node9;
        node9.next = node0;

        ListNode node = s.getIntersectionNode(node1,node6);
        System.out.println(node.val);

    }*/

  public static void main(String[] args) {

      char a = 'a';
      char b = 'b';

    a = (char) (a ^ b);
    System.out.println(a + " " + b);
    b = (char) (a ^ b);
      System.out.println(a + " " + b);
    a = (char) (a ^ b);
      System.out.println(a + " " + b);


  }
    public char[] reverse(char[] array, int start, int end){
        while(start<end){
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }
}