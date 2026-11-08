package session12_inheritance.MagicalCreatureZoo;

public class MagicalCreatureMain {
    public static void main(String[] args) {

        MagicalCreature creature1 = new Dragon("Smaug", 100, 90);
        MagicalCreature creature2 = new Unicorn("Twilight Sparkle", 50, 80);
        MagicalCreature creature3 = new Phoenix("Fawkes", 200, 95);

        creature1.makeSound();
        creature1.useMagic();

        creature2.makeSound();
        creature2.useMagic();

        creature3.makeSound();
        creature3.useMagic();

    }
}
