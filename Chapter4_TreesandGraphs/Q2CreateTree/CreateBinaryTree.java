package Chapter4TreesandGraphs.Q2CreateTree;

import Chapter4TreesandGraphs.Q3ListOfDepth;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ameyp on 6/26/2017.
 */
public class CreateBinaryTree {

    static class DoublyNode{
        int data;
        DoublyNode next;
        DoublyNode prev;

        public DoublyNode(int d){
            this.data = d;
        }

    }

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int d){
            this.data = d;
        }
    }

    public static void createMinimalTree(int[] vSortedArray){
        createMinimalTree(vSortedArray, 0, vSortedArray.length-1);
    }

    private static TreeNode createMinimalTree(int[] vArray, int start, int end) {
        if(end<start){
            return null;
        }
        int mid = (start+end)/2;
        TreeNode v = new TreeNode(vArray[mid]);

        v.left = createMinimalTree(vArray, start, mid -1);
        v.right = createMinimalTree(vArray, mid+1, end);

        return v;
    }

    public static void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void InOrder(TreeNode root){
        if(root == null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data);
        InOrder(root.right);

    }

    public static int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }

        int leftHeight = root.left == null ? 0 : getHeight(root.left);
        int rightHeight = root.right == null ? 0 : getHeight(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static int getHeight1(TreeNode root){
        if(root==null){
            return 0;
        }

        int leftHeight = 1 + getHeight(root.left);
        int rightHeight = 1 + getHeight(root.right);

        return Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args){
        int[] array1 = {0,1,2,3,4};
        TreeNode v = createMinimalTree(array1, 0, array1.length-1);

        preOrder(v);
        System.out.print("\n");
        InOrder(v);
        System.out.print("\n" + " End of Transversal" + "\n");

        DoublyNode result = convertToDoublyLL(v);

        while(result != null){
            System.out.println("Result " + result.data);
            result = result.next;
        }
    }

    public static DoublyNode convertToDoublyLL(TreeNode root){

        if (root == null){
            return null;
        }

        DoublyNode head = null;
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(q.size() != 0){

            TreeNode currentTreeNode = q.poll();

            System.out.println("Q poll data - " + currentTreeNode.data);

            int data = currentTreeNode.data;
            DoublyNode newNode = new DoublyNode(data);
            head = newNode;

            if(currentTreeNode.left != null){
                System.out.println("Left data - " + currentTreeNode.left.data);
                q.add(currentTreeNode.left);
                newNode = new DoublyNode(currentTreeNode.left.data);
                head.next = newNode;
                newNode.prev = head;
                head = newNode;
            }

            if(currentTreeNode.right != null){
                System.out.println("Right data - " + currentTreeNode.right.data);
                q.add(currentTreeNode.right);
                newNode = new DoublyNode(currentTreeNode.right.data);
                head.next = newNode;
                newNode.prev = head;
                head = newNode;
            }

        }

        return head;
    }


}
