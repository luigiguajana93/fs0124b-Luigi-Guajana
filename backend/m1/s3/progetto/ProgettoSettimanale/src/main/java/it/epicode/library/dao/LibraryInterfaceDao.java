package main.java.it.epicode.library.dao;

import main.java.it.epicode.library.entities.LibraryItem;
import main.java.it.epicode.library.entities.Loan;

import java.util.List;
import java.util.Optional;

public interface LibraryInterfaceDao
{
    public void save(LibraryItem prod);

    public void removeByISBN(Integer ISBN);

    public Optional<LibraryItem> getByISBN(Integer ISBN);

    public List<LibraryItem> getByAnno(Integer anno);

    public List<LibraryItem > getByAutore(String autore);

    public LibraryItem getByTitolo(String titolo);

    public List<LibraryItem> getElementiInPrestito(Integer numeroTessera);

    public List<Loan> getPrestitiScadutiNonRestituiti();

}

