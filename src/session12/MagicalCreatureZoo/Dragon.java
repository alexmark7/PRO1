package session12.MagicalCreatureZoo;

public class Dragon extends MagicalCreature {

    private boolean fireBreath;
    private double wingSpan;

    public Dragon(String name, int age, int magicLevel) {
        super(name, age, magicLevel);
        this.fireBreath = true;
        this.wingSpan = 10.0;
    }

    public void breatheFire() {
        IO.println(name + " breathes fire!");
    }

    public void fly() {
        IO.println(name + " takes to the skies!");
    }


    @Override
    public void makeSound() {
        IO.println(name + " unleashes a huge roar!");
    }

    @Override
    public void useMagic() {
        IO.println(name + " shoots out fire from its mouth!");
    }
}
