package Chapter4TreesandGraphs.Q1;

/**
 * Created by ameyp on 6/22/2017.
 */
public class Node {

    private String vertex;
    private Node[] adjacentNodes;
    private int adjacentCount;
    private boolean visited;

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String getVertex() {
        return vertex;
    }

    public void setVertex(String vertex) {
        this.vertex = vertex;
    }

    public Node[] getAdjacentNodes() {
        return adjacentNodes;
    }

    public void setAdjacentNodes(Node[] adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    }

    public Node(int adjacentCount, String s){
        this.vertex = s;
        this.adjacentCount = 0;
        adjacentNodes = new Node[adjacentCount];
    }

    public void addAdjacentNode(Node node){
        if(adjacentCount < adjacentNodes.length){
            this.adjacentNodes[adjacentCount] = node;
            adjacentCount++;
        }
        else{
            System.out.print("Maximum limit reached");
        }
    }


}
