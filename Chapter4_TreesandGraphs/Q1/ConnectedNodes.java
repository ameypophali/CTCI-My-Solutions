package Chapter4TreesandGraphs.Q1;

import GraphAlgorithms.Vertex;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ameyp on 6/22/2017.
 */
public class ConnectedNodes {
    public boolean checkConnected(Graph g, Node n1, Node n2){
        Queue<Node> q = new LinkedList<>();

        for(Node node : g.getVertices()){
            node.setVisited(false);
        }

        q.add(n1);
        n1.setVisited(true);

        while(!q.isEmpty()){
            Node current = q.poll();

            for(Node n : current.getAdjacentNodes()){
                if(n == n2){
                    return true;
                }
                else{
                    if(!n.isVisited()){
                        n.setVisited(true);
                        q.add(n);
                    }
                }
            }
        }
    return false;
    }

    public static void main(String[] args){
        Graph g = createNewGraph();

    }

    private static Graph createNewGraph() {
        Vertex v0 = new Vertex("0");
        Vertex v1 = new Vertex("1");
        Vertex v2= new Vertex("2");
        Vertex v3 = new Vertex("3");

        Graph g = new Graph(4);

        v0.addEdge(v1);



        return g;
    }

}
