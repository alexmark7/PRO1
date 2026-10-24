package session11;

import java.util.ArrayList;
import java.util.List;

public class Case {

    private String caseNumber;
    private String crimeType;
    private List<String> evidence;
    private String status;

    public Case(String caseNumber, String crimeType){
        this.caseNumber = caseNumber;
        this.crimeType = crimeType;
        this.evidence = new ArrayList<>();
        this.status = "Under Investigation";

    }

    public String getCaseNumber(){
        return caseNumber;
    }

    public String getCrimeType(){
        return crimeType;
    }

    public void addEvidence(String evidence){
       this.evidence.add(evidence);
    }

    public List<String> getEvidence() {
        return evidence;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString(){
        return  caseNumber + " + " + crimeType + " + " + status;
    }

}
