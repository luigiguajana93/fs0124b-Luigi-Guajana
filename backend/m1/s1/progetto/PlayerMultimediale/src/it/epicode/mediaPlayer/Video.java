package it.epicode.mediaPlayer;

public class Video extends Riproducibile implements ElementiVisibili {

    //creiamo il costruttore per Video
    public  Video ( String titolo, int durata){

        this.setTitolo(titolo);
        this.setDurata(durata);
    }

    //inizializzo la luminosità a 5 poichè ipotizziamo che un video abbia la luminosità a metà e non a zero.
     private int luminosita = 5;

    //metodo per la luminosità del video
     public int getLuminosita(){
      return luminosita;
    }




    @Override
    //metodo per riprodurre i video
    public void play() {
        for (int i =0; i < this.getDurata(); i++){
            System.out.print(this.getTitolo() + " - ");
            for(int j = 0; j < this.getVolume(); j++)
            {
                System.out.print("!");
            }
            System.out.print( " - ");
            for(int k = 0; k < this.getLuminosita(); k++)
            {
                System.out.print("*");
            }
            System.out.println(".");
        }
    }


    @Override
    //metodo per alzare la luminosità
    public void alzaLuminosita() {
        if (luminosita < 10) {
            luminosita++;
        }
        else System.out.println("luminosità già al minimo");
    }



    @Override
    //metodo per abbassare la luminosità
    public void abbassaLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
        else System.out.println("luminosità già al minimo");
    }

}
