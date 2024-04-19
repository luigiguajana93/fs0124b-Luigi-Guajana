package it.epicode.mediaPlayer;

public  class Audio extends Riproducibile {

    //creiamo il costruttore per Audio
    public Audio ( String titolo, int durata){

        this.setTitolo(titolo);
        this.setDurata(durata);

    }

//metodo per il play degli audio

    @Override

    /* questo metodo riproduce l'audio stampando il suo titolo seguito da un numero di simboli '!' che rappresenta il volume dell'audio
     per ogni unità di durata dell'elemento. Questo ciclo viene ripetuto per la durata totale dell'audio. */

    public void play() {
        for (int i =0; i < this.getDurata(); i++){

            System.out.print(this.getTitolo() + " - ");
            for(int j = 0; j < this.getVolume(); j++)
            {
                System.out.print("!");
            }
            System.out.println(".");
        }
    }
}
