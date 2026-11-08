package session12_inheritance.Superheroes;

public class PhysicalHero extends Superhero {
    protected int strength;
    protected int speed;

    public PhysicalHero(String heroName, String secretIdentity, int powerLevel, int strength, int speed) {
        super(heroName, secretIdentity, powerLevel);
        this.strength = strength;
        this.speed = speed;
    }

    public void superStrength() {
        System.out.println(heroName + " uses super strength: " + strength);
    }

    public void superSpeed() {
        System.out.println(heroName + " uses super speed: " + speed);
    }

    public void physicalAttack() {
        System.out.println(heroName + " launches a physical attack!");
    }
}
