package main.java.it.epicode.library.entities;


import jakarta.persistence.*;
import main.java.it.epicode.library.entities.constants.Tables;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

@DiscriminatorColumn(name = "elementi_catalogo")
@NamedQuery(name = "GET_BY_ISBN", query = "SELECT r FROM Prodotti r WHERE isbn = :ISBN")
@NamedQuery(name = "GET_BY_AUTORE",query = "SELECT r FROM Prodotti r WHERE autore = :AUTORE")
@NamedQuery(name = "GET_BY_ANNO",query = "SELECT r FROM Prodotti r WHERE annopubblicazione = :ANNOPUBBLICAZIONE")
public abstract class LibraryItem extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer isbn;

    private String title;
    private int publicationYear;
    private int pages;

    public LibraryItem( String title, int publicationYear, int pages) {

        this.title = title;
        this.publicationYear = publicationYear;
        this.pages = pages;
    }

    public LibraryItem() {
    }

    public Integer getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getPages() {
        return pages;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return String.format("LibraryItem [isbn=%s, title=%s, publicationYear=%s, pages=%s, insertedAt=%s, id=%s]",
                isbn, title, publicationYear, pages, getInsertedAt(), getId());
    }

}
