void main () {
    //select exercise to run
    E1();

}
record Book(String title, String author, int pages, int year) {}

//Exercise 1
void E1 () {

    Book book = new Book("1984","James Orwell",380,1935);
    book = new Book(book.title,book.author,book.pages,1937);
    Book updated = new Book(book.title(), book.author(),390, 1938);

    IO.println(book);    // still year 1935
    IO.println(updated); // year 1938

}

//Exercise 2
void E2 () {



}
//Exercise 3
void E3 () {


}
//Exercise 4
void E4 () {


}