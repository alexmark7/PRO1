package session12_inheritance.Superheroes;

public class IceHero extends ElementalHero {
    private int iceIntensity;
    private boolean iceResistance;

    public IceHero(String heroName, String secretIdentity, int powerLevel, String element, int elementalMastery, int iceIntensity, boolean iceResistance) {
        super(heroName, secretIdentity, powerLevel, element, elementalMastery);
        this.iceIntensity = iceIntensity;
        this.iceResistance = iceResistance;
    }

    public void iceBlast() {
        System.out.println(heroName + " launches an ice blast with intensity " + iceIntensity + "!");
    }

    public void iceBarrier() {
        System.out.println(heroName + " creates an ice barrier. Ice resistance: " + iceResistance);
    }
}
