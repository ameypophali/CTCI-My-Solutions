package Chapter4TreesandGraphs.Q5CheckBST;

/**
 * Created by ameyp on 7/6/2017.
 */
public class InOrderCheck {
    private int index = 0;
        class Node{
            int data;
            Node left;
            Node right;
            public Node(int d){
                this.data = d;
            }
        }

        private void isBSTInOrder(Node node, int[] array){
            if(node == null){
                return;
            }

            isBSTInOrder(node.left, array);
            array[index] = node.data;
            index++;
            isBSTInOrder(node.left, array);
        }

        public boolean isBSTInOrder(Node root){
            int[] array = new int[100];
            isBSTInOrder(root,array);

            for(int i=0;i<array.length-1;i++){
                if(array[i] > array[i+1]){
                    return false;
                }
            }

            return true;
        }

}
