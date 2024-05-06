package main.java.it.epicode.app;



import main.java.it.epicode.library.dao.LibraryDAO;
import main.java.it.epicode.library.entities.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Program {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(Program.class);

        var dao = new LibraryDAO();

        var libro1 = new Book("il signore degli anelli", 120, 2018,"alberto", "fantasy");


        dao.save(libro1);

        System.out.println(dao.getByAutore("mario"));
    }
}
