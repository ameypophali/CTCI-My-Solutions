package Chapter3QueueandStacks;

import java.util.Stack;

public class Q2MinElementBetter extends Stack<NodeWithin> {

    public void push(int value){
        int newMin = Math.min(value, min());

        super.push(new NodeWithin(value, newMin));
    }

    private int min(){
        if(this.isEmpty()){
            return Integer.MAX_VALUE;
        }
        else{
            return peek().min;
        }
    }
}

class NodeWithin{
    int value;
    int min;

    NodeWithin(int value, int min){
        this.value = value;
        this.min = min;
    }
}
