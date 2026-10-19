package session9;

public class BookTester {
    public static void main() {

        Book book = new Book("The hobbit", "jj", 125, 24);


        System.out.println("Title: " + book.getTitle());
        System.out.println("Price: " + book.getPrice());
        System.out.println("Pages: " + book.getPages());
    }
}