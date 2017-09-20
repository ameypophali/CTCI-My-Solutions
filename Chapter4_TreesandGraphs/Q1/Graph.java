package Chapter4_TreesandGraphs.Q1;

/**
 * Created by ameyp on 6/22/2017.
 */
public class Graph {
    public Node[] getVertices() {
        return vertices;
    }

    private Node[] vertices;
    private int vertexCount;

    public Graph(int totalVertices){
        vertexCount = 0;
        vertices = new Node[totalVertices];
    }

    public void addNodetoGraph(Node n){
        if(vertexCount < vertices.length){
            vertices[vertexCount] = n;
            vertexCount++;
        }
        else{
            System.out.print("Max vertices limit reached for the Graph");
        }
    }



}
