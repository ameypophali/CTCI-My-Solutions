package Chapter2_LinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by ameyp on 6/1/2017.
 */
public class C4Q3Sol {

    class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int v){
            value = v;
            left = right = null;
        }
    }

    public ArrayList<LinkedList<TreeNode>> depthList(TreeNode root){
        ArrayList<LinkedList<TreeNode>> result = new ArrayList<>();

        LinkedList<TreeNode> current = new LinkedList<>();

        current.add(root);

        while(!current.isEmpty()){
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

    public static ArrayList<LinkedList<TreeNode>> convertBTreeLinkedList(TreeNode root){

        ArrayList<LinkedList<TreeNode>> result = new ArrayList<>();

        LinkedList<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(q.size() != 0){

            result.add(q);

            LinkedList<TreeNode> parent = q;

            q =  new LinkedList<>();

            for(TreeNode t : parent){
                if(t.left != null){
                    q.add(t.left);
                }

                if(t.right != null){
                    q.add(t.right);
                }
            }
        }


    return result;
    }

}
