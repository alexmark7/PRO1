package session13;

public class Cat extends Animal {

    private boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    @Override
    public void makeSound() {
        IO.println("Meow");
    }

    @Override
    public void move() {
        IO.println(name + " walked around");
    }

    @Override
    public void eat() {
        IO.println(name + " ate food");
    }

    public void climb() {
        IO.println(name + (isIndoor ? " climbed a scratching post" : " climbed a tree"));
    }
}
