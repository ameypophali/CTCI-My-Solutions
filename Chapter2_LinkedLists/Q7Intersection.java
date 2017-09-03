package Chapter2LinkedLists;

public class Q7Intersection {

    private class LinkedListnode{

        LinkedListnode next;
        int value;

        LinkedListnode(int v){
            value = v;
        }
    }

    public class Result{
        LinkedListnode tail;
        int size;

        public Result(LinkedListnode n, int i){
            this.tail = n;
            this.size = i;
        }
    }

    public LinkedListnode checkIntersection(LinkedListnode n, LinkedListnode n1){

        if(n == null || n1 == null){
            return null;
        }

        Result result = getTailLength(n);
        Result result1 = getTailLength(n1);

        if(result.tail != result1.tail){
            return null;
        }

        LinkedListnode shorter = result.size < result1.size ? n : n1;
        LinkedListnode longer = result.size < result1.size ? n1 : n;

        longer = getKthNode(longer, Math.abs(result.size - result1.size));

        while(shorter != longer){
            shorter = shorter.next;
            longer = longer.next;
        }

        return shorter;

    }

    private LinkedListnode getKthNode(LinkedListnode longer, int abs) {
        LinkedListnode current = longer;
        while(current != null && abs > 0){
            abs--;
            current = current.next;
        }
        return current;
    }


    private Result getTailLength(LinkedListnode n) {
       if(n == null){
           return null;
       }

       int size = 1;

       while(n.next != null){
           size++;
           n= n.next;
       }

        return new Result(n, size);
    }

}
