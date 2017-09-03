package Chapter3QueueandStacks.Q6AnimalShelter;

/**
 * Created by ameyp on 6/17/2017.
 */
public abstract class Animal {
    private String name;
    private int order;

    Animal(String name){
        this.name = name;
    }

    public abstract String name();

    public void setOrder(int ord){
        order = ord;
    }

    private int getOrder(){
        return order;
    }

    public boolean isOlder(Animal a){
        return this.order < a.getOrder();
    }
}
