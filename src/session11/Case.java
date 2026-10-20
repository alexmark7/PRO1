package session11;

import java.util.Collections;
import java.util.List;

public class Case {

    private String caseNumber;
    private String crimeType;
    private List<String> evidence;
    private String status;

    public Case(String caseNumber, String crimeType){
        this.caseNumber = caseNumber;
        this.crimeType = crimeType;

    }

    public String getCaseNumber(){
        return caseNumber;
    }

    public String getCrimeType(){
        return crimeType;
    }

    public void addEvidence(String evidence){
       this.evidence = Collections.singletonList(evidence);
    }

    public List<String> getEvidence() {
        return evidence;
    }

    public void setStatus(String Status){
        return;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString(){
        return  caseNumber + " + " + crimeType + " + " + status;
    }

}
