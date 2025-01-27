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
        System.out.println("Please enter the category you'd like to view: (FANTASY, MYSTERY, SCI-FI");
        String response = console.nextLine().toUpperCase();

        return Category.valueOf(response);
    }

    public void displayBook(Book book) {
        if( book != null) {
            System.out.printf("Title: %s, Author: %s, ISBN: %d%n", book.getTitle(), book.getAuthor(), book.getIsbn());
        }
        else {
            System.out.println("Book does not exist");
        }
    }

    public void displayAllBooks(List<Book> books) {
        for(Book book : books) {
            if(books != null) {
                displayBook(book);
            }
            else {
                System.out.println("No books available to display");
            }
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
