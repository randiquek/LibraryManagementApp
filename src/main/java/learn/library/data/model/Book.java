package learn.library.data.model;

public class Book {
    private String title;
    private String author;
    private int isbn;
    private int shelfNumber;
    private int position;
    private int yearPublished;

    public Book(String title, String author, int isbn, int shelfNumber, int position, int yearPublished) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.shelfNumber = shelfNumber;
        this.position = position;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getShelfNumber() {
        return shelfNumber;
    }

    public void setShelfNumber(int shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public boolean isAvailable() {
    return true;
    }
    public void markAsCheckedOut() {

    }
    public void markAsReturned() {

    }

}

