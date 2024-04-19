package it.epicode.mediaPlayer;

public class Immagine extends ElementoMultimediale implements ElementiVisibili {

    //dichiaro in private l'attributo luminosita
    private int luminosita;

    //creiamo il costruttore l'immagine
    public Immagine(String titolo){

        this.setTitolo(titolo);
    }

    //metodo per la luminosità dell'immagine
    public int getLuminosita() {
        return luminosita;
    }



    //metodo per mostrare l'immagine
    public void show() {

        System.out.print(this.getTitolo() + " - ");
        for (int i = 0; i < this.getLuminosita(); i++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }


    @Override
    //metodo per alzare la luminosità
    public void alzaLuminosita() {
        if (this.getLuminosita() < 5) {
            luminosita++;
        } else {
            System.out.println("la Luminosità è al massimo ");
        }
    }

    @Override
    //metodo per abbassare la luminosità
    public void abbassaLuminosita() {
        if (this.getLuminosita() > 10) {
            luminosita--;
        } else {
            System.out.println("la Luminosità è al minimo");
        }
    }

}

