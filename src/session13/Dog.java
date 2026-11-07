package session13;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound(){
        IO.println("Woof");
    }

    @Override
    public void move(){
        IO.println(name + " went to the bed");
    }

    @Override
    public void eat() {
        IO.println(name + " ate food");
    }

    public void fetch() {
        IO.println(name + " fetches a branch");
    }
}
