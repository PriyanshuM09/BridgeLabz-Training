package librarymanagementsystem;

public class Book {
    public String title;
    public String author;
    public String genre;
    public int bookId;
    public boolean isAvailable;

    public Book(int bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }
}
