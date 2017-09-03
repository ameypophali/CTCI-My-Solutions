package GraphAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;

    public Vertex(String n){
        this.name = n;
        adjList = new ArrayList<>();
    }

    public List<Vertex> getAdjList() {
        return adjList;
    }

    private List<Vertex> adjList;
    private boolean visited;

    public void addEdge(Vertex vertex){
        this.adjList.add(vertex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited(){
        return this.visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
