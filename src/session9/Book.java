package session9;

public class Book {

    private String title;
    private String author;
    private int pages;
    private double price;

    public Book(String title, String author, int pages, double price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice (double price){
        this.price = price;
    }

    public int getPages(){
        return pages;
    }

}
