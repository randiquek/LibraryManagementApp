package learn.library.data;

import learn.library.data.model.Book;

import java.util.List;

public class BookFileRepository implements BookRepository {

    private static final String DELIMITER = "~";
    private final String filePath;

    public BookFileRepository(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public Book add() throws DataAccessException {

    }

    @Override
    public Book findByIsbn() throws DataAccessException {

    }

    @Override
    public boolean deleteById() throws DataAccessException {

    }

    @Override
    public List<Book> findAll() throws DataAccessException {

    }

    @Override
    public Book update() throws DataAccessException {

    }

    private void saveAll() {

    }
}

