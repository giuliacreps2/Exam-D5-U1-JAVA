package entities;

import interfaces.Volume;

public class Video extends ElementoMultimediale implements Volume {
    private int durata;
    private int volume;
    private int luminosità;

    //COSTRUTTORE
    public Video(String titolo, int durata, int volume, int luminosità) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosità = luminosità;
    }

    @Override
    public void abbassaVolume(int durata, int volume) {
        Volume.super.abbassaVolume(durata, volume);
    }

    @Override
    public void alzaVolume(int durata, int volume) {
        Volume.super.alzaVolume(durata, volume);
    }

    //METODI
    public void play(int durata, int volume) {

    }
}
