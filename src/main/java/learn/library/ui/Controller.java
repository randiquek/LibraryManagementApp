package learn.library.ui;

import learn.library.data.DataAccessException;
import learn.library.domain.BookService;

public class Controller {

    private final BookService service;
    private final View view;

    public Controller(BookService service, View view) {
        this.service = service;
        this.view = view;
    }

    public void run() throws DataAccessException {

    }

    private void addBook() throws DataAccessException {

    }

    private void updateBook() throws DataAccessException{

    }

    private void deleteBook() throws DataAccessException {

    }

    private void viewBooksByCategory() throws DataAccessException {

    }

    private void getBookByIsbn() throws DataAccessException {

    }
}
