package main.java.it.epicode.app;

import main.java.it.epicode.library.dao.LibraryDaoImpl;
import main.java.it.epicode.library.dao.UserDaoImpl;
import main.java.it.epicode.library.entities.Book;
import main.java.it.epicode.library.entities.LibraryItem;
import main.java.it.epicode.library.entities.Magazine;
import main.java.it.epicode.library.entities.User;
import main.java.it.epicode.library.entities.enums.Frequency;
import java.util.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class Program {
    public static void main(String[] args) throws ParseException {
        LibraryDaoImpl biblio = new LibraryDaoImpl();
        UserDaoImpl user = new UserDaoImpl();

        LibraryItem libro1 = new Book("999999999", "Harry Potter e la pietra filosofale", 1999, 1100, "J K Rowling", "Fantasy");
        LibraryItem libro2 = new Book("888888888", "Il signore degli anelli", 2005, 1100, "Tolkien", "Fantasy");
        LibraryItem libro3 = new Book("777777777", "Vita di Domani", 1996, 685, "George Stewart", "Horror");
        LibraryItem libro4 = new Book("666666666", "Il buono e il cattivo ", 1985, 200, " Pippo Baudo", "Horror");
        LibraryItem mag1 = new Magazine("321654987", "Come diventare sviluppatore", 2021, 50,Frequency.MENSILE);
        LibraryItem mag2 = new Magazine("123456789", "Chi vuole essere milionario", 2020, 30, Frequency.SEMESTRALE);
        LibraryItem mag3 = new Magazine("987654321", "Chi", 2024, 60, Frequency.SETTIMANALE);



        String isbn = "888888888";
        LibraryItem isbnTrovato = biblio.getItemByISBN(isbn);

        System.out.println(isbnTrovato);

        int annoPub = 1949;
        List<LibraryItem> pubAnno = biblio.getItemsByPublicationYear(annoPub);
        System.out.println("Libri pubblicati nel " + annoPub + ":" + pubAnno );


        String autore = "George Orwell";
        List<LibraryItem> autoreTrovato = biblio.getItemsByAuthor(autore);
        System.out.println("Libri dell'autore " + autore + ":" + autoreTrovato );


        String titolo = "1984";
        List<LibraryItem> titoloTrovato = biblio.getItemsByTitle(titolo);
        System.out.println("Libri con il titolo " + titolo + ":" + titoloTrovato + ":");


        String libroDaRimuovere = "999999999";



        Date dataDiNascita1 = new SimpleDateFormat("yyyy-MM-dd").parse("1992-05-08");
        User utente1 = new User("Anna", "Rossi", dataDiNascita1, 1);

        user.addUser(utente1);
    }
}