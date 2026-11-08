package session12_inheritance.Superheroes;

public class ElementalHero extends Superhero {
    protected String element;
    protected int elementalMastery;

    public ElementalHero(String heroName, String secretIdentity, int powerLevel, String element, int elementalMastery) {
        super(heroName, secretIdentity, powerLevel);
        this.element = element;
        this.elementalMastery = elementalMastery;
    }

    public void controlElement() {
        System.out.println(heroName + " controls " + element + " with mastery " + elementalMastery + ".");
    }

    public void elementalAttack() {
        System.out.println(heroName + " attacks with " + element + "!");
    }
}
