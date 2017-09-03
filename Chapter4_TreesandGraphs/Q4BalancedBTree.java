package Chapter4TreesandGraphs;

import Chapter3QueueandStacks.Q3SetofStacks.Stack;

import java.util.LinkedList;

/**
 * Created by ameyp on 6/27/2017.
 */
public class Q4BalancedBTree {

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int d){
            this.data = d;
        }
    }

   public static int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }

        return Math.max(getHeight(root.left), getHeight(root.right));
    }

    public static boolean checkIsBST(TreeNode root){
       if(root == null){
           return true;
       }
        if(Math.abs(getHeight(root.left) - getHeight(root.right)) > 1){
           return false;
        }
        else{
            return checkIsBST(root.left) && checkIsBST(root.right);
        }

    }

}
