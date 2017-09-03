package RandomStuff;

import java.util.*;

public class GraphAdj{
        private int V;
        private List<LinkedList<Integer>> adjList;

public GraphAdj(int v){
        this.V = v;
        adjList = new ArrayList<>();
        for(int i=0;i<v;i++){
            adjList.set(i, new LinkedList<>());
        }
        }

public void addEdge(int value, int value1){
        adjList.get(value).add(value1);
        }

public void BFSSearch(int root){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];

        visited[root] = true;
        q.add(root);

        while(!q.isEmpty()){

            int current = q.poll();
            System.out.println(current);

            visited[current] = true;

            Iterator<Integer> iterator = adjList.get(current).listIterator();

            while(iterator.hasNext()){
                int next = iterator.next();
                if(!visited[next]){
                    visited[next] = true;
                    q.add(next);
                }
            }

        }

        }


        }