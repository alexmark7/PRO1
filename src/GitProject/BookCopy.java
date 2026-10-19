package GitProject;

public class BookCopy {

    private String title;
    private boolean borrowed;

    public BookCopy(String title) {
        this.title = title;
        this.borrowed = false; // et nyt eksemplar er ledigt
    }

    public String getTitle() {
        return title;
    }

    // true = udlånt, false = ledig
    public boolean isBorrowed() {
        return borrowed;
    }

    public boolean borrow() {
        if (borrowed) {
            return false;
        } else {
            borrowed = true;
            return true;
        }
    }

    public boolean returnBook() {
        if (borrowed) {
            borrowed = false;
            return true;
        } else {
            return false;
        }
    }
}
