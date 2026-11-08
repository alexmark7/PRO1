package session12_inheritance.MagicalCreatureZoo;

public class Phoenix extends MagicalCreature {

    private int rebirthCycle;
    private String flameColor;

    public Phoenix(String name, int age, int magicLevel) {
        super(name, age, magicLevel);
        this.rebirthCycle = 0;
        this.flameColor = "red";
    }

    public void resurrect() {
        IO.println(name + " rises from the ashes!");
    }

    public void soar() {
        IO.println(name + " takes to the skies!");
    }


    @Override
    public void makeSound() {
        IO.println(name + " sqeeks loudly!");
    }

    @Override
    public void useMagic() {
        IO.println(name + " unleashes its fiery power!");
    }
}
