package it.epicode.biblioteca.services;
import it.epicode.biblioteca.Lettura;
import it.epicode.biblioteca.Libri;
import it.epicode.biblioteca.Periodo;
import it.epicode.biblioteca.Riviste;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// faccio l'implements di LetturaService dove troverò  i metodi per la lettura e la rimozione
public class FileLetturaService implements LetturaService{

    private static final Logger logger = LoggerFactory.getLogger(FileLetturaService.class); //logger per la registrazione dei messaggi
    private static final String STORAGE = "./lettura.csv"; //percorso del file di archiviazione
    private final ArrayList<Lettura> letture = new ArrayList<>(); // Lista per memorizzare le letture

    //costruttore per caricare i dati dal file al momento dell'inizializzazione
    public FileLetturaService(){
        carica();
    }

    //metodo per salvare i dati nel file
    public void salva() {
        File f = new File(STORAGE);

        try {
            //crea un nuovo file vuoto
            FileUtils.write(f, "", StandardCharsets.ISO_8859_1);
            for (Lettura l : letture) {
               // Crea una lista di stringhe per rappresentare ogni lettura come una riga nel file
                List<String> lines = new ArrayList<>();
                // Aggiunge il nome della classe
                lines.add(l.getClass().getSimpleName());
                // Aggiunge l'ISBN
                lines.add(l.getIsbn().toString());
                // Aggiunge il titolo
                lines.add(l.getTitolo());
                // Aggiunge l'anno di pubblicazione
                lines.add(String.valueOf(l.getAnno()));
                // Aggiunge il numero di pagine
                lines.add(String.valueOf(l.getNumeroPagine()));
                // Se la lettura è un libro, aggiunge autore e genere
                if (l instanceof Libri) {
                    lines.add(((Libri) l).getAutore());
                    lines.add(((Libri) l).getGenere());
                }
                // Se la lettura è una rivista, aggiunge il periodo di pubblicazione
                else if (l instanceof Riviste) {
                    Riviste r = (Riviste) l;
                    lines.add(r.getPeriodo().toString());
                }
                // Scrive la riga nel file
                FileUtils.writeStringToFile(f, String.join(",", lines) + System.lineSeparator(), StandardCharsets.ISO_8859_1, true);
            }
        }
        // Gestisce le eccezioni di I/O
        catch (IOException e) {
            logger.error("Eccezione durante il salvataggio del file di storage", e);
        }


    }

    //metodo per caricare i dati dal file
    private void carica(){
        File f = new File (STORAGE);
        if (!f.exists()) return; // se non esiste il file termina il caricamento
        try {
            // Legge tutte le righe del file
            List<String> l = FileUtils.readLines(f, StandardCharsets.ISO_8859_1);
            for (String line : l) {
                // Divide la riga in parti separate dalla virgola
                String[] parts = line.split(",");
                // Estrae i dati dalle parti
                Long isbn = Long.parseLong(parts[1]);
                String titolo = parts[2];
                int anno = Integer.parseInt(parts[3]);
                int numeroPagine = Integer.parseInt(parts[4]);
                // Se la parte 0 è "Libri", crea un nuovo oggetto Libri e lo aggiunge alla lista di letture
                if ("Libri".equals(parts[0])) {
                    String autore = parts[5];
                    String genere = parts[6];
                    letture.add(new Libri(isbn, titolo, anno, numeroPagine, autore, genere));
                }
                // Se la parte 0 è "Riviste", crea un nuovo oggetto Riviste e lo aggiunge alla lista di letture
                else if ("Riviste".equals(parts[0])) {
                    Periodo periodo = Periodo.valueOf(parts[5]);
                    letture.add(new Riviste(periodo, isbn, titolo, anno, numeroPagine));
                }

            }
        }
        // Gestisce le eccezioni di I/O
        catch (IOException var4){
            IOException e = var4;
            logger.error("Eccezione durante il caricamento",e);
        }

        }

    //con questo metodo effettuiamo la ricerca dell'elemento  filtrato con l'isbn e lo aggiunge
    public void aggiungiLettura(Lettura lettura) {
        letture.add(lettura);
    }
// con questo metodo effettuiamo la ricerca dell'elemento  filtrato con l'isbn e lo rimuoviamo
    public void rimuoviLettura(Long isbn) {
        letture.removeIf(l -> l.getIsbn().equals(isbn));
    }

    // con questa operazione effettuiamo la ricerca dell'elemento  filtrato con ISBN

    public List<Lettura> CercaPerIsbn(Long isbn) {
        return letture.stream()
                .filter(l -> l.getIsbn().equals(isbn))
                .collect(Collectors.toList());
    }


    // con questa operazione effettuiamo la ricerca dell'elemento  filtrato con l'anno di pubblicazione
    public List<Lettura> CercaPerAnno(int anno) {
        return letture.stream()
                .filter(l -> l.getAnno() == anno)
                .collect(Collectors.toList());
    }


    // con questa operazione effettuiamo la ricerca dell'elemento  filtrato con l'autore per poter accedere ai metodi del figlio Libri  utilizzo instaceof
    public List<Lettura> CercaPerAutore(String autore) {
        return letture.stream()
                .filter(l -> l instanceof Libri && ((Libri) l).getAutore().equals(autore))
                .collect(Collectors.toList());
    }


}






