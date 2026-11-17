package session14_interfaces;

import java.util.ArrayList;

public class SimplePrinterStrategy implements ListPrinterStrategy {
    @Override
    public void printList(ArrayList<String> list) {
        for (String name : list) {
            System.out.println(name);
        }
    }
}
