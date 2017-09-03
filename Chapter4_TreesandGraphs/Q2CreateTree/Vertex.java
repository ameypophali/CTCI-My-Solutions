package Chapter4TreesandGraphs.Q2CreateTree;

import java.util.ArrayList;

/**
 * Created by ameyp on 6/26/2017.
 */
public class Vertex {
    int value;
    Vertex right;
    Vertex left;
    Vertex parent;

    public Vertex(int val){
        this.value = val;
    }

    public void addLeftChild(Vertex v){
        this.left = v;
    }


}
