package session13;

public class Bird extends Animal {

    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        IO.println("Chirp");
    }

    @Override
    public void move() {
        IO.println(name + " moved around");
    }

    @Override
    public void eat() {
        IO.println(name + " ate food");
    }

    public void fly() {
        if (canFly) {
            IO.println(name + " flew away");
        } else {
            IO.println(name + " cannot fly");
        }
    }
}
