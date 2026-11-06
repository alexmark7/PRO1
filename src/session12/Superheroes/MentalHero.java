package session12.SuperHeroes;

public class MentalHero extends Superhero {
    protected int psychicPower;
    protected double telepathyRange;

    public MentalHero(String heroName, String secretIdentity, int powerLevel, int psychicPower, double telepathyRange) {
        super(heroName, secretIdentity, powerLevel);
        this.psychicPower = psychicPower;
        this.telepathyRange = telepathyRange;
    }

    public void readMind() {
        System.out.println(heroName + " reads minds within " + telepathyRange + " meters.");
    }

    public void telekinesis() {
        System.out.println(heroName + " moves objects with psychic power " + psychicPower + ".");
    }

    public void mentalAttack() {
        System.out.println(heroName + " launches a mental attack!");
    }
}
