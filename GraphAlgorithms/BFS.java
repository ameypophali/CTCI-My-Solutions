package GraphAlgorithms;

import java.util.*;

public class BFS {

    public void BFSSearch(Vertex rootVerTex){

        if(rootVerTex == null){
            return;
        }

        Queue<Vertex> vertexQueue = new LinkedList<>();

        vertexQueue.add(rootVerTex);
        System.out.print(rootVerTex.getName());

        while(!vertexQueue.isEmpty()){

            Vertex current = vertexQueue.poll();
            current.setVisited(true);

            List<Vertex> neighbours = current.getAdjList();

            for (Vertex neighbour : neighbours) {
                if (!neighbour.isVisited()) {
                    vertexQueue.add(neighbour);
                    neighbour.setVisited(true);
                }
            }
        }
    }

    public static void main(String[] args){
        Vertex v[] = new Vertex[10];

        for(int i : new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}) {
            v[i] = new Vertex(Integer.toString(i));
        }

        v[5].addEdge(v[3]);
        v[5].addEdge(v[7]);
        v[5].addEdge(v[3]);
        v[5].addEdge(v[7]);
        v[5].addEdge(v[3]);
        v[5].addEdge(v[7]);
        v[5].addEdge(v[3]);
        v[5].addEdge(v[7]);
        v[5].addEdge(v[7]);

    }

}
