package RandomStuff;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFSandDFSGraph {

    private int capacity;
    private LinkedList<Integer>[] ajdList;

    public BFSandDFSGraph(int c){
        capacity = c;
        ajdList =  new LinkedList[c];
        for(int i = 0;i<c;i++){
            ajdList[i] = new LinkedList<>();
        }
    }

    public void addNode(int i, int j){
        ajdList[i].add(j);
    }

    public void BFSSearch(int root){

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[capacity];

        q.add(root);
        visited[root] = true;

        while(!q.isEmpty()){

            int current = q.poll();

            System.out.print(root);

            for (Integer next : ajdList[current]) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.add(next);
                }
            }
        }
    }

    public void DFS(int root){
        boolean[] visited = new boolean[capacity];

        DFSUtil(root, visited);
    }

    private void DFSUtil(int root, boolean[] visited) {
        visited[root] = true;

        Iterator<Integer> i = ajdList[root].listIterator();
        while(i.hasNext()){
            int n = i.next();
            if(!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }
}