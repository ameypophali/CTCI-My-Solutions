package Chapter4TreesandGraphs;

/**
 * Created by ameyp on 7/8/2017.
 */
public class Q6InOrderSuccessor {

    public class TreeNode{
        int data;
        TreeNode left, right;
        TreeNode parent;

        public TreeNode(int d){
            this.data = d;
        }
    }

    public TreeNode inorderSuccessor(TreeNode node){
        if(node == null){
            return null;
        }

        if(node.right != null){
            return getFarLeft(node.right);
        }
        else{
            TreeNode child = node;
            TreeNode parent = child.parent;

            while(parent != null && child != parent.right){
                child = parent;
                parent = child.parent;
            }
            return parent;
        }

    }

    private TreeNode getFarLeft(TreeNode right) {
        if(right == null){
            return null;
        }

        while(right != null){
            right = right.left;
        }

        return right;
    }

}
