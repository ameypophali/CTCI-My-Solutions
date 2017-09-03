package RandomStuff;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by ameyp on 5/31/2017.
 */
public class InOrderTransversal {

    public static class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int data){
            val = data;
            left = null;
            right = null;
        }
    }

    public static ArrayList<Integer> inOrderTransversal(TreeNode root){
        if(root == null){
            return null;
        }

        ArrayList<Integer> arr = new ArrayList<>();

        TreeNode node = root;

        Stack<TreeNode> s = new Stack<>();

        //Loop till stack is not empty(all lefts processed) and node is not null (all
        while(!s.empty() || node != null){

            if(node != null){
                s.push(node);
                node = node.left;
            }
            else {
                TreeNode node1 = s.pop();
                arr.add(node1.val);
                node = node1.right;
            }

        }

        return arr;
    }

    public static void main(String[] args){
        TreeNode n0 = new TreeNode(0);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);

        n3.left = n1;
        n3.right = n5;
        n1.left = n0;
        n1.right = n2;
        n5.left = n4;
        n5.right = n6;

        LinkedList<Integer> linkedList;

        ArrayList<Integer> arr = new ArrayList<>();

        arr = inOrderTransversal(n3);

        for(int i=0; i< arr.size();i++){
            System.out.print(arr.get(i));
        }

    }


}
