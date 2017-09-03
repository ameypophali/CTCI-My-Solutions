package Chap8DynamicProgAndRecursion.TowersOFHanoi;

import java.util.Stack;

public class Tower {
    private Stack<Integer> disks;
    private int id;

    public Tower(int i){
        this.id = i;
        disks = new Stack<>();
    }

    public void add(int num){
        if(!disks.isEmpty() && disks.peek() <= num){
            System.out.println("Error here");
        }
        disks.add(num);
    }

    private void addToTop(Tower tower){
        int top = disks.pop();
        tower.add(top);
    }

    private void moveDisks(int n, Tower destination, Tower buffer){
        if(n > 0){
            moveDisks(n-1, buffer, destination);
            addToTop(destination);
            buffer.moveDisks(n-1, destination,this);
        }
    }

}
