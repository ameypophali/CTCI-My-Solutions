package Chapter3QueueandStacks.Q6AnimalShelter;

/**
 * Created by ameyp on 6/17/2017.
 */
public class Cat extends Animal {
    String name;

    public Cat(String n){
        super(n);
    }

    public String name(){
        return "Cat is - " + name;
    }

}
