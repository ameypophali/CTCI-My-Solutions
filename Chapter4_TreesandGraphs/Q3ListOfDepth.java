package Chapter4TreesandGraphs;

import Chapter4TreesandGraphs.Q2CreateTree.Vertex;
import sun.awt.image.ImageWatched;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ameyp on 6/26/2017.
 */
public class Q3ListOfDepth {

    static class DoublyNode{
        int data;
        DoublyNode next;
        DoublyNode prev;

        public DoublyNode(int d){
            this.data = d;
        }

    }

    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int d){
            this.data = d;
        }
    }

    public static ArrayList<LinkedList<TreeNode>> listofDepth(TreeNode root) {
        ArrayList<LinkedList<TreeNode>> result = new ArrayList<>();

        LinkedList<TreeNode> current = new LinkedList<>();

        current.add(root);

        while(current.size() != 0){
            result.add(current);

            LinkedList<TreeNode> parents = current;

            current = new LinkedList<>();

            for(TreeNode parent : parents){
                if(parent.left != null){
                    current.add(parent.left);
                }
                if(parent.right != null){
                    current.add(parent.right);
                }
            }


        }
        return result;

    }


}
