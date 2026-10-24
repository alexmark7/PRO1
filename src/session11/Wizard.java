package session11;

public class Wizard {

    private String name;
    private WizardWand wand;

    public Wizard(String name, WizardWand wand){
        this.name = name;
        this.wand = wand;
    }

    public void castSpell(String spellName, int requiredPower){

        IO.println(name + " casts '" + spellName + "' with his "
                + wand.getWoodType() + " wand (" + wand.getCoreMaterial()
                + ", Power: " + wand.getPowerLevel() + ")");
    }

    public void changeWand (WizardWand newWand){
        this.wand = newWand;
        IO.println("Wand changed! " + name + " now wields the " + newWand);
    }

    @Override
    public String toString() {
        return name  + " using the " + wand ;
    }

}
