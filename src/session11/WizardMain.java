package session11;

public class WizardMain {

    static void main() {

        WizardWand wand = new WizardWand(
                WoodType.ELDER,
                "Phoenix feather core",
                9000);

        Wizard Harry = new Wizard("Harry", wand);

        Harry.castSpell("Fireball", 90);

        Harry.changeWand(new WizardWand(WoodType.OAK, "Dragon Heart Core", 10000));

    }
}
