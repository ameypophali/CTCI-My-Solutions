package Chapter3QueueandStacks.Q6AnimalShelter;

import java.util.LinkedList;


public class AnimalQueue {
    private LinkedList<Dog> dogList = new LinkedList<>();
    private LinkedList<Cat> catList  = new LinkedList<>();
    private int order = 0;

    public void enqueue(Animal a){
        a.setOrder(order);
        order++;

        if(a instanceof Dog){
            dogList.add((Dog) a);
        }
        else if(a instanceof Cat){
            catList.add((Cat) a);
        }
    }

    public Animal dequeueAny(){
        if(dogList.size() == 0){
            return dequeueCat();
        }
        else if(catList.size() == 0){
            return dequeueDog();
        }

        Dog d = dogList.peek();
        Cat c = catList.peek();

        if(c.isOlder(d)){
            return dequeueCat();
        }
        else{
            return dequeueDog();
        }
    }

    private Animal peek(){
        if(dogList.size() == 0){
            return peekCat();
        }
        else if(catList.size() == 0){
            return peekDog();
        }

        Dog d = dogList.peek();
        Cat c = catList.peek();

        if(c.isOlder(d)){
            return peekCat();
        }
        else{
            return peekDog();
        }

    }

    private Animal peekDog() {
        return dogList.peek();
    }

    private Animal peekCat() {
        return catList.peek();
    }

    private Animal dequeueDog() {
        return dogList.poll();
    }

    private Animal dequeueCat() {
        return catList.poll();
    }



}
