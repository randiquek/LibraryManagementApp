package learn.library.domain;

import learn.library.data.BookRepository;
import learn.library.data.DataAccessException;
import learn.library.data.model.Book;

import java.util.List;

public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

//    public List<Book> findAll() throws DataAccessException {
//        return repository.findAll();
//    }
//
//    private boolean validate(Book) {
//
//    }
//
//    public Book update(Book) {
//
//    }
//
//    public boolean isValidCategory() {
//
//    }
//
//    public boolean isAvailable() {
//
//    }
}
