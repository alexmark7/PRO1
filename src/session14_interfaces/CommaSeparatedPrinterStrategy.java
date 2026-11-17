package session14_interfaces;

import java.util.ArrayList;

public class CommaSeparatedPrinterStrategy implements ListPrinterStrategy {
    @Override
    public void printList(ArrayList<String> list) {
        System.out.println(String.join(", ", list));
    }
}
