package session14_interfaces;

import java.util.ArrayList;

public class NameList {
    private ArrayList<String> names;

    public NameList() {
        names = new ArrayList<>();
    }

    public void addName(String name) {
        names.add(name);
    }

    public void printNames(ListPrinterStrategy printer) {
        printer.printList(names);
    }

    public ArrayList<String> getNames() {
        return names;
    }
}
