package it.epicode.mediaPlayer;

//definisco una classe astratta chiamata Riproducibile, che estende la classe ElementoMultimediale e implementa l'interfaccia ElementiRiproducibili.
public abstract class Riproducibile extends ElementoMultimediale implements ElementiRiproducibili{

    // la classe Riproducibile ha due metodi di accesso ovvero getDurata dove ci darà la durata e getVolume dove ci darà il volume e un metodo di modifica setDurata.

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getVolume() {
        return volume;
    }



    private int durata;
    private int volume;

    @Override
    public void alzaVolume() {
        if (volume< 5) {
            volume++;
        }
        else System.out.println("volume già al massimo");
    }

    @Override
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
        else System.out.println("volume già al minimo");

    }

    @Override
    public void play() {

    }
}

