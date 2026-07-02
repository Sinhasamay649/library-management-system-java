public class Book {

    private int bookId;
    private String title;
    private String author;
    private boolean issued;

    // Constructor
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    // Getters
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return issued;
    }

    // Setter
    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    @Override
    public String toString() {
        return "Book ID : " + bookId +
               "\nTitle   : " + title +
               "\nAuthor  : " + author +
               "\nStatus  : " + (issued ? "Issued" : "Available");
    }
}