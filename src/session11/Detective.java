package session11;

public class Detective {

    private String name;
    private String badgeNumber;
    private Case currentCase;

    public Detective(String name, String badgeNumber){
        this.name = name;
        this.badgeNumber = badgeNumber;

    }

    public void takeCase(Case newCase){
        this.currentCase = newCase;
    }

    public void takeOffCase(){
        currentCase = null;
    }

    public void addEvidence(String evidence){
        currentCase.addEvidence(evidence);
    }

    public void solveCase(){
        IO.println("Case Solved");
    }

    @Override
    public String toString() {
        return name + " - " + badgeNumber + " - Reporting for duty";
    }


}
