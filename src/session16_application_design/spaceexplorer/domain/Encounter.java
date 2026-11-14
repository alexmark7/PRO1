package session16_application_design.spaceexplorer.domain;

public class Encounter {

    private String date;
    private Alien alienEncountered;
    private Planet onPlanet;
    private Explorer byExplorer;
    private String descriptionOfTheEncounter;

    public Encounter(String date, Alien alienEncountered, Planet onPlanet, Explorer byExplorer, String descriptionOfTheEncounter) {
        this.date = date;
        this.alienEncountered = alienEncountered;
        this.onPlanet = onPlanet;
        this.byExplorer = byExplorer;
        this.descriptionOfTheEncounter = descriptionOfTheEncounter;
    }


}
