package Chapter3QueueandStacks.Q6AnimalShelter;

/**
 * Created by ameyp on 6/17/2017.
 */
public class Dog extends Animal {
    String name;

    public Dog(String name){
        super(name);
    }

    public String name(){
        return "Dog is - " + name;
    }

}
