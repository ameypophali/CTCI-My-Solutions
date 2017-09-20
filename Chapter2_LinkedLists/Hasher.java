package Chapter2_LinkedLists;

import java.util.ArrayList;

public class Hasher<K, V> {

    private ArrayList<LinkedListNodes> arrayList;

    public class LinkedListNodes{
        K key;
        V value;
        LinkedListNodes next;
        LinkedListNodes prev;

        LinkedListNodes(K k, V v){
            value = v;
            next = prev = null;
        }
    }

    public Hasher(int capacity){
        arrayList = new ArrayList<>(capacity);
        for(int i=0;i<arrayList.size();i++){
            arrayList.set(i, null);
        }
    }

    public void push(K k, V v){
        LinkedListNodes node = getNode(k);

        if(node != null){
            node.value = v;
            return;
        }

        LinkedListNodes newNode = new LinkedListNodes(k,v);

        int index = getIndex(k);

        LinkedListNodes current = arrayList.get(index);

        if(current != null){
            newNode.next = current;
            current.prev = newNode;
        }
        arrayList.set(index, newNode);
    }

    private LinkedListNodes getNode(K k) {
        int index =  getIndex(k);
        LinkedListNodes node = arrayList.get(index);

        while(node != null){
            if(node.key == k){
                return node;
            }
            node = node.next;
        }

        return null;
    }

    private int getIndex(K k) {
        return Math.abs(k.hashCode() % arrayList.size());
    }


}
