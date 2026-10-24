package session11;

public class DetectiveMain {

    static void main() {

    Detective DavidMills = new Detective("David Mills", "Detective");

    Case theftCase = new Case("2026-001","Theft");
    Case murderCase = new Case("2026-002","Murder");

    IO.print(DavidMills + " working on Case " + theftCase.getCaseNumber());
    IO.println();
    IO.println("Crime: " + theftCase.getCrimeType() + ", Status: " + theftCase.getStatus());

    DavidMills.takeCase(theftCase);
    DavidMills.addEvidence("FingerPrints");
    DavidMills.addEvidence("CellPhone");

    IO.print("Evidence found: " + theftCase.getEvidence());
    IO.println();

    DavidMills.solveCase();

    IO.print(theftCase.getCaseNumber() + " " + theftCase.getStatus() + " " + DavidMills + " Can new take on Case " + murderCase.getCaseNumber());

    IO.println();

    }
}
