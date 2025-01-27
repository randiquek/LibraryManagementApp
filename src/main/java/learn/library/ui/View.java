package learn.library.ui;

import learn.library.data.model.Book;
import learn.library.data.model.Category;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class View {

    private Scanner console = new Scanner(System.in);

    public Book getBookDetails() {
        System.out.println("Please enter the book title: ");
        String title = console.nextLine();
        System.out.println("Please enter the author name: ");
        String author = console.nextLine();
        System.out.println("Please enter the ISBN: ");
        int isbn = console.nextInt();

        return new Book(title, author, isbn);

    }

    public int getIsbn() {
        System.out.println("Please enter the ISBN: ");
        return console.nextInt();
    }

    public Category getCategory() {
        System.out.println("Please enter the category you'd like to view: ");
        console.nextLine();
    }

    public void displayBook(Book book) {

    }

    public void displayAllBooks(List<Book> books) {

    }

    public void displayMessage(String message) {

    }
}
