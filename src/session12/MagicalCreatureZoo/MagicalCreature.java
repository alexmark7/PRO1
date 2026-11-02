package session12.MagicalCreatureZoo;

public class MagicalCreature {

    protected String name;
    private int age;
    private int magicLevel;

    public MagicalCreature(String name, int age, int magicLevel) {
        this.name = name;
        this.age = age;
        this.magicLevel = magicLevel;
    }

    public void makeSound() {
        IO.println(name + " makes a sound!");
    }

    public void useMagic() {
        IO.println(name + " uses its magic!");
    }

    public void rest(){
        IO.println(name + " is resting to regain magic.");
    }

}
