package it.epicode.mediaPlayer;

public interface ElementiRiproducibili  {

    /* interfaccia che definisce tre metodi :
    - il primo  è progettato per aumentare il volume dell'elemento , che sia un video o un audio ;
    - il secondo è progettato per diminuire il volume dell'elemento , che sia un video o un audio ;
    - il terzo è progettato per riprodurre l'elemento che sia un video o un audio;
*/
    void alzaVolume();
    void abbassaVolume ();
    void play ();

}
