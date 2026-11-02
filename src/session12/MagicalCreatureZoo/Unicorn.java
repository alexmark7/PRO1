package session12.MagicalCreatureZoo;

public class Unicorn extends MagicalCreature {

    private double hornLength;
    private int healingPower;

    public Unicorn(String name, int age, int magicLevel) {
        super(name, age, magicLevel);
        this.hornLength = 1.5;
        this.healingPower = 100;
    }

    public void heal() {
        IO.println(name + " heals with its magical horn!");
    }

    public void sparkle() {
        IO.println(name + " sparkles with magical energy!");
    }


    @Override
    public void makeSound() {
        IO.println(name + " cries out in a melodious voice!");
    }

    @Override
    public void useMagic() {
        IO.println(name + " unleashes its healing power!");
    }

}
