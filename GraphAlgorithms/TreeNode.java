package GraphAlgorithms;

/**
 * Created by ameyp on 6/22/2017.
 */
public class TreeNode {
    private int data;
    private TreeNode right;
    private TreeNode left;
    private TreeNode parent;
    private boolean visited;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getRight() {
        return right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getParent() {
        return parent;
    }

    public TreeNode(int t){
        this.data = t;
    }

    public void setLeftChild(TreeNode node){
        this.left = node;
        if(left != null){
            left.parent = this;
        }
    }

    public void setRightChild(TreeNode node){
        this.right = node;
        if(right != null){
            right.parent = this;
        }
    }

    public void setAsParent(TreeNode child){
        child.parent = this;
    }

    public void setParent(TreeNode parent){
        this.parent = parent;
    }

    public void insertInOrder(TreeNode node){
        if(node.data <= this.data){
            if(this.left == null){
                setLeftChild(node);
            }
            else{
                left.insertInOrder(node);
            }
        }
        else{
            if(this.right == null){
                setRightChild(node);
            }
            else{
                right.insertInOrder(node);
            }
        }


    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
