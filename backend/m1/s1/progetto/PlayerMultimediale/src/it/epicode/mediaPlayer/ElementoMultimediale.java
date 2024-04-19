package it.epicode.mediaPlayer;

//elementoMultimediale è il genitore di tutti . Definisco una classe astratta chiamata ElementoMultimediale.

public abstract class ElementoMultimediale{

    /* Questa è la classe astratta che rappresenta un elemento multimediale generico.
     È dichiarata come astratta, il che significa che non può essere istanziata direttamente, ma può essere estesa da altre classi.*/

    // Questo è un campo privato della classe ElementoMultimediale che memorizza il titolo dell'elemento multimediale.
    private String titolo;

 // Questo è un metodo pubblico che restituisce il titolo dell'elemento multimediale.
    public String getTitolo() {
        return titolo;
    }

    //Questo è un metodo pubblico che imposta il titolo dell'elemento multimediale con il valore passato come argomento.
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }



}
