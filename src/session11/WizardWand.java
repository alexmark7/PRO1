package session11;

public class WizardWand {

    private WoodType woodType;
    private String CoreMaterial;
    private int powerLevel;

    public WizardWand (WoodType woodType, String coreMaterial, int powerLevel){
        this.woodType = woodType;
        this.CoreMaterial = coreMaterial;
        this.powerLevel = powerLevel;

    }

    public WoodType getWoodType(){
        return woodType;
    }

    public String getCoreMaterial(){
        return CoreMaterial;
    }

    public int getPowerLevel(){
        return powerLevel;
    }

    public String getWandDescription(){
        return "A great flame lives within";
    }

    @Override
    public String toString(){
        return woodType + " wand (" + CoreMaterial + ", Power: " + powerLevel + ")";
    }

}
