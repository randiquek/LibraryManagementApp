package learn.library.data;

import learn.library.data.model.Book;

import java.util.List;

public interface BookRepository {

    Book add() throws DataAccessException;
    Book findByIsbn() throws DataAccessException;
    boolean deleteBook() throws DataAccessException;
    List<Book> findAll() throws DataAccessException;
    Book update() throws DataAccessException;
}
