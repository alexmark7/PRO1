package session14_interfaces;

import java.util.ArrayList;

public class ReversedPrinterStrategy implements ListPrinterStrategy {
    @Override
    public void printList(ArrayList<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
