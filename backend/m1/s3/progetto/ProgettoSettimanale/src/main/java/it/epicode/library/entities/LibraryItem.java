package main.java.it.epicode.library.entities;


import jakarta.persistence.*;
import main.java.it.epicode.library.entities.constants.Tables;

@Entity
@Table(name = Tables.Names.LIBRARY_BASE)
@Inheritance(strategy = InheritanceType.JOINED)

@DiscriminatorColumn(name = "item_type", discriminatorType = DiscriminatorType.STRING)

public abstract class LibraryItem extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 13, nullable = false)
    private String isbn;
    @Column(length = 125, nullable = false)
    private String title;
    private int publicationYear;
    private int pages;

    public LibraryItem(String isbn, String title, int publicationYear, int pages) {
        this.isbn = isbn;
        this.title = title;
        this.publicationYear = publicationYear;
        this.pages = pages;
    }

    public LibraryItem() {
    }

    public String getIsbn() {
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

    public void setIsbn(String isbn) {
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
