package Chapter1Strings;

import java.util.ArrayList;

/**
 * Created by ameyp on 5/18/2017.
 */
public class Hasher<K, V> {

    private class LinkedListnode<K, V>{

        LinkedListnode next;
        LinkedListnode prev;
        K key;
        V value;

        LinkedListnode(K k, V v){
            key = k;
            value = v;
        }
    }
    private ArrayList<LinkedListnode<K, V>> arraylist;
    public Hasher(int capacity){
                arraylist = new ArrayList<>(capacity);

                for(int i=0; i<capacity;i++){
                    arraylist.add(i, null);
                }
    }

    public void put(K key, V value) {

        LinkedListnode<K, V> node = getLinkedListNode(key);

        if(node != null){
            node.value = value;
        }
        else{
            LinkedListnode<K, V> newNode = new LinkedListnode<K, V>(key, value);

            int index = getIndex(key);

            LinkedListnode<K, V> current = arraylist.get(index);

            if(current != null){
               current.prev = newNode;
               newNode.next = current;
            }
            arraylist.set(index, newNode);

        }
    }

    public void remove(K key, V value) {

        LinkedListnode<K, V> node = getLinkedListNode(key);

        if(node.prev != null){
            node.prev.next = node.next;
        }
        else{
            int index = getIndex(key);
            arraylist.set(index, node);
        }

        if(node.next != null){
            node.next.prev = node.prev;
        }
    }


    private LinkedListnode<K, V> getLinkedListNode(K key) {
        int index;
        index = getIndex(key);

        LinkedListnode current = arraylist.get(index);

        while(current != null){

            if(current.key == key){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()%arraylist.size());
    }

}
