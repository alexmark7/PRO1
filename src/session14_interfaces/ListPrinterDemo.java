package session14_interfaces;

public class ListPrinterDemo {
    public static void main(String[] args) {
        NameList nameList = new NameList();
        nameList.addName("Alice");
        nameList.addName("Bob");
        nameList.addName("Charlie");

        System.out.println("Simple:");
        nameList.printNames(new SimplePrinterStrategy());

        System.out.println("\nComma separated:");
        nameList.printNames(new CommaSeparatedPrinterStrategy());

        System.out.println("\nReversed:");
        nameList.printNames(new ReversedPrinterStrategy());
    }
}
