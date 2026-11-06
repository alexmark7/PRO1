package session12.SuperHeroes;

public class FireHero extends ElementalHero {
    private int flameIntensity;
    private boolean fireResistance;

    public FireHero(String heroName, String secretIdentity, int powerLevel, String element, int elementalMastery, int flameIntensity, boolean fireResistance) {
        super(heroName, secretIdentity, powerLevel, element, elementalMastery);
        this.flameIntensity = flameIntensity;
        this.fireResistance = fireResistance;
    }

    public void fireball() {
        System.out.println(heroName + " throws a fireball with intensity " + flameIntensity + "!");
    }

    public void fireShield() {
        System.out.println(heroName + " creates a fire shield. Fire resistance: " + fireResistance);
    }
}
