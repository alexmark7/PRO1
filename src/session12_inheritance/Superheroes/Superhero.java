package session12_inheritance.Superheroes;

public class Superhero {
    protected String heroName;
    protected String secretIdentity;
    protected int powerLevel;

    public Superhero(String heroName, String secretIdentity, int powerLevel) {
        this.heroName = heroName;
        this.secretIdentity = secretIdentity;
        this.powerLevel = powerLevel;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void attack() {
        System.out.println(heroName + " attacks!");
    }

    public void saveDay() {
        System.out.println(heroName + "'s saves the day!");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{heroName='" + heroName + "', powerLevel=" + powerLevel + "}";
    }
}
