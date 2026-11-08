package session13_abstraction;

abstract class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep(){
        IO.println(name + " is sleeping");
    }

    public abstract void makeSound();

    public abstract void move();

    public abstract void eat();


}
