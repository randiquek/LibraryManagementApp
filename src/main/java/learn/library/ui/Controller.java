package learn.library.ui;

import learn.library.data.DataAccessException;
import learn.library.data.model.Category;
import learn.library.domain.BookService;

public class Controller {

//    private final BookService service;
//    private final View view;
    View view = new View();
    boolean isRunning = false;

//    public Controller(BookService service, View view) {
//        this.service = service;
//        this.view = view;
//    }
    public Controller() {

    }

    public void run() {

        boolean isRunning = true;

        while(isRunning) {

            view.printMainMenu();
            int choice = view.getInteger("Enter a number");

            switch(choice) {

                case 0:
                    view.displayMessage("Exiting application. Thank you!");
                    isRunning = false;
                    break;
                case 1:
                    //findBooksByCategory()
                    System.out.println("Find books by category");
                    break;
                case 2:
                    //addBook()
                    System.out.println("Adding book");
                    break;
                case 3:
                    //updateBook()
                    System.out.println("Updating book");
                    break;
                case 4:
                    //deleteBook()
                    System.out.println("Deleting book");
                    break;

            }

        }
    }

    private void addBook() throws DataAccessException {

    }

    private void updateBook() throws DataAccessException{

    }

    private void deleteBook() throws DataAccessException {

    }

    private void findBooksByCategory() throws DataAccessException {

    }

    private void getBookByIsbn() throws DataAccessException {

    }


}
