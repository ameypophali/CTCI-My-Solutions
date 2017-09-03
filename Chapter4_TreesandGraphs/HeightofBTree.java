package Chapter4TreesandGraphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ameyp on 6/28/2017.
 */
public class HeightofBTree {

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int d){
            this.data = d;
        }
    }

    private static int getHeight(TreeNode root){
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

    public static int getHeightIterative(TreeNode root){

        if(root == null){
            return 0;
        }

        int height = 0;
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode current = q.poll();

            if(current == null){
                height++;
                if(!q.isEmpty()) {
                    q.add(null);
                }
            }
            else{
                if(current.left != null){
                    q.add(current.left);
                }
                if(current.right != null){
                    q.add(current.right);
                }
            }
        }
        return height;
    }
}
