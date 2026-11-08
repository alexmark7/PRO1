package session13_abstraction;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Labrador");
        Cat cat = new Cat("Mittens", 2, true);
        Bird bird = new Bird("Pip", 1, true);

        dog.makeSound();
        dog.move();
        dog.eat();
        dog.fetch();

        cat.makeSound();
        cat.move();
        cat.eat();
        cat.climb();

        bird.makeSound();
        bird.move();
        bird.eat();
        bird.fly();
    }
}
