package session12.SuperHeroes;

public class Superhero {
    private int powerLevel;

    public Superhero() {
        this(0);
    }

    public Superhero(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void attack() {
        System.out.println(getClass().getSimpleName() + " attacks!");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{powerLevel=" + powerLevel + "}";
    }
}
