package Chapter4TreesandGraphs.Q5CheckBST;

/**
 * Created by ameyp on 7/6/2017.
 */
public class CheckBST {

    public static Integer last_printed = null;

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int d) {
            this.data = d;
        }
    }

    public boolean checkBST(Node node, boolean isLeft) {
        if (node == null) {
            return true;
        }

        if (!checkBST(node.left, true)) {
            return false;
        }

        if (last_printed != null) {
            if (isLeft) {
                if (node.data < last_printed) {
                    return false;
                }
            } else {
                if (node.data <= last_printed) {
                    return false;
                }
            }
        }

        last_printed = node.data;


        if (!checkBST(node.right, false)) {
                return false;
            }


        return true;
    }

}
