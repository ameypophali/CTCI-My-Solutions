package RandomStuff;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;


public class GraphAjacencyList {

    private int V;   // No. of vertices
    private static HashMap<Node,LinkedList<Node>> adjList;

    public GraphAjacencyList(int v){
        this.V = v;
        adjList = new HashMap<>(v);
    }

    private void addNode(Node v1, Node v2){
        LinkedList<Node> list = adjList.get(v1);
        if(list == null) {
            LinkedList<Node> v1List = new LinkedList<>();
            adjList.put(v1, v1List);
            v1List.add(v2);
        }
        else{
            list.add(v2);
        }
    }

    public int size(){
        return V;
    }

    public static void main(String args[]){

        GraphAjacencyList g = new GraphAjacencyList(9);

        Node[] n = new Node[10];
        for(int i=0;i<10;i++){
            n[i] = new Node(i);
        }

        g.addNode(n[6], n[8]);
        g.addNode(n[6], n[5]);
        g.addNode(n[5], n[4]);
        g.addNode(n[4], n[2]);
        g.addNode(n[4], n[3]);
        g.addNode(n[8], n[9]);
        g.addNode(n[8], n[7]);
        g.addNode(n[3], n[1]);

        for(Node node : n)
        { System.out.print("node is -" + node.getData() + "\n");
            LinkedList<Node> list = adjList.get(node);
            while(list != null){
                Iterator<Node> iterator = list.iterator();
                while(iterator.hasNext()){
                    System.out.print(iterator);
                }
            }
        }
    }
}
