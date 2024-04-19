package it.epicode;
import it.epicode.mediaPlayer.Audio;
import it.epicode.mediaPlayer.Immagine;
import it.epicode.mediaPlayer.Video;

public class Main {
    public static void main(String[] args) {
    Video video = new Video ("partita", 5);
    Audio canzone = new Audio("DreamOn",10);
    Immagine fotoTessera = new Immagine("foto presente nella carta d'identità");

        //prove per il video dove alziamo il volume
        video.play();
        video.alzaVolume();
        video.play();
        video.alzaVolume();
        video.play();
        video.alzaVolume();
        video.play();
        video.alzaVolume();
        video.play();
        video.alzaVolume();
        video.play();
        video.alzaVolume(); // arrivato al massimo del volume stampa in console l'errore "VOLUME GIA AL MASSIMO"
        video.play();

        //prove per l'audio dove verifichiamo
        canzone.play();
        canzone.alzaVolume();
        canzone.play();
        canzone.alzaVolume();
        canzone.play();
        canzone.alzaVolume();
        canzone.play();
        canzone.abbassaVolume();
        canzone.play();
        canzone.alzaVolume();
        canzone.play();
        canzone.alzaVolume();
        canzone.play();
        canzone.alzaVolume();
        canzone.play();
        canzone.alzaVolume(); // arrivato al massimo del volume stampa in console l'errore "VOLUME GIA AL MASSIMO"
        canzone.play();


        //prove per l'immagine
        fotoTessera.show();
        fotoTessera.alzaLuminosita();
        fotoTessera.show();
        fotoTessera.alzaLuminosita();
        fotoTessera.show();
        fotoTessera.alzaLuminosita();
        fotoTessera.show();
        fotoTessera.abbassaLuminosita();
        fotoTessera.show();
        fotoTessera.alzaLuminosita();
        fotoTessera.show();
        fotoTessera.alzaLuminosita();
        fotoTessera.show();
        fotoTessera.alzaLuminosita();
        fotoTessera.show();
        fotoTessera.alzaLuminosita(); // arrivato al massimo della luminosità stampa in console l'errore "LA LUMINOSITA E' AL MASSIMO"
        fotoTessera.show();



    }
}
