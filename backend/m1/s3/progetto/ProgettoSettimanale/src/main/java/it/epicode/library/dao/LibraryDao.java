package main.java.it.epicode.library.dao;

import main.java.it.epicode.library.entities.LibraryItem;
import java.util.List;


public interface LibraryDao {


    boolean isValidIsbn(String code);

    void addItem(LibraryItem item);


    void removeItemByISBN(String isbn);

    LibraryItem getItemByISBN(String isbn);

    List<LibraryItem> getItemsByPublicationYear(int publicationYear);

    List<LibraryItem> getItemsByAuthor(String author);

    List<LibraryItem> getItemsByTitle(String title);
}
