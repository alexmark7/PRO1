package session16_application_design.spaceexplorer.domain;

public class Explorer {

    private String name;
    private Planet currentPlanet;

    public Explorer(String name, Planet currentPlanet) {
        this.name = name;
        this.currentPlanet = currentPlanet;
    }

}
