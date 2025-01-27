package learn.library;

//import learn.library.data.BookFileRepository;
import learn.library.domain.BookService;
import learn.library.ui.Controller;
import learn.library.ui.View;

public class Main {
    public static void main(String[] args) {

        //BookFileRepository repository = new BookFileRepository(".data/books.csv");
        //BookService service = new BookService(repository);
        Controller controller = new Controller();

        controller.run();

    }
}
