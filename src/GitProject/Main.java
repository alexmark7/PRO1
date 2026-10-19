package GitProject;

public class Main {
    public static void main(String[] args) {

        BookCopy copy = new BookCopy("The Hobbit");

        System.out.println("Bog: " + copy.getTitle());
        System.out.println("Ledig fra start, isBorrowed(): " + copy.isBorrowed() + " (forventet: false)");
        System.out.println();

        // Forløb 1: første udlån skal lykkes
        System.out.println("1. udlån, borrow(): " + copy.borrow() + " (forventet: true)");
        System.out.println("   isBorrowed(): " + copy.isBorrowed() + " (forventet: true)");
        System.out.println();

        // Forløb 2: nyt udlån af samme eksemplar skal afvises
        System.out.println("2. udlån, borrow(): " + copy.borrow() + " (forventet: false)");
        System.out.println("   isBorrowed(): " + copy.isBorrowed() + " (forventet: true)");
        System.out.println();

        // Forløb 3: aflevering af udlånt eksemplar skal lykkes, og derefter kan den lånes igen
        System.out.println("Aflevering, returnBook(): " + copy.returnBook() + " (forventet: true)");
        System.out.println("   isBorrowed(): " + copy.isBorrowed() + " (forventet: false)");
        System.out.println("3. udlån, borrow(): " + copy.borrow() + " (forventet: true)");
        System.out.println("   isBorrowed(): " + copy.isBorrowed() + " (forventet: true)");
        System.out.println();

        // Forløb 4 (ny regel): aflevering af et eksemplar, der allerede er ledigt, skal afvises
        System.out.println("Aflevering, returnBook(): " + copy.returnBook() + " (forventet: true)");
        System.out.println("   isBorrowed(): " + copy.isBorrowed() + " (forventet: false)");
        System.out.println("Aflevering igen, returnBook(): " + copy.returnBook() + " (forventet: false)");
        System.out.println("   isBorrowed(): " + copy.isBorrowed() + " (forventet: false)");
    }
}
