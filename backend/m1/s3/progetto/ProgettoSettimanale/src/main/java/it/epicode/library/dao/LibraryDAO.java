package main.java.it.epicode.library.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import main.java.it.epicode.library.entities.LibraryItem;
import main.java.it.epicode.library.entities.Loan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.List;
import java.util.Optional;

public class LibraryDAO implements LibraryInterfaceDao{

    private static final Logger logger = LoggerFactory.getLogger(LibraryDAO.class);

    protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");

    protected EntityManager em = emf.createEntityManager();

    @Override
    public void save(LibraryItem prod) {

        var transaction = em.getTransaction();

        transaction.begin();

        em.persist(prod);

        transaction.commit();
    }

    @Override
    public void removeByISBN(Integer ISBN) {


    }

    @Override
    public Optional<LibraryItem> getByISBN(Integer ISBN) {

        try {
            var query = em.createNamedQuery("GET_BY_ISBN");

            query.setParameter("ISBN", ISBN);

            var prod = (LibraryItem) query.getSingleResult();

            return Optional.of(prod);

        }catch (Exception e) {
            logger.error("Elemento con ISBN specificato inesistente", e);
            return Optional.empty();
        }

    }

    @Override
    public List<LibraryItem> getByAnno(Integer anno) {
        try {
            var query = em.createNamedQuery("GET_BY_ANNO");

            query.setParameter("AUTORE", anno);

            List<LibraryItem> result = query.getResultList();

            return result;

        }catch (Exception e) {
            logger.error("Nessun libro uscito in questo anno nel catalogo", e);
            return null;
        }
    }

    @Override
    public List<LibraryItem> getByAutore(String autore) {
        try {
            var query = em.createNamedQuery("GET_BY_AUTORE");

            query.setParameter("AUTORE", autore);

            List<LibraryItem> result = query.getResultList();

            return result;

        }catch (Exception e) {
            logger.error("Elemento con ISBN specificato inesistente", e);
            return null;
        }
    }

    @Override
    public LibraryItem getByTitolo(String titolo) {
        return null;
    }

    @Override
    public List<LibraryItem> getElementiInPrestito(Integer numeroTessera) {
        return List.of();
    }

    @Override
    public List<Loan> getPrestitiScadutiNonRestituiti() {
        return List.of();
    }
}
