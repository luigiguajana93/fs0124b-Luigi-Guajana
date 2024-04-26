package it.epicode.biblioteca;

public class Libri extends Lettura{

    private String autore;
    private String genere;


    public Libri(Long isbn ,String titolo,int anno,int numeroPagine ,String autore, String genere) {

        this.autore = autore;
        this.genere = genere;

        super.setIsbn(isbn);
        super.setTitolo(titolo);
        super.setAnno(anno);
        super.setNumeroPagine(numeroPagine);


    }







    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    @Override
    public String toString() {
        return "Libri{" +
                "autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }
}
