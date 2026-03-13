package entities;

import interfaces.Luminosità;
import interfaces.Volume;

public class Video extends ElementoMultimediale implements Volume, Luminosità {
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

    //SETTER
    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setLuminosità(int luminosità) {
        this.luminosità = luminosità;
    }


    //METODI
    public void play(String titolo, int durata, int volume, int luminosità) {
        for (int i = 1; i <= durata; i++) {
            String str = "|";
            String str1 = "*";
            System.out.println(titolo.concat(str.repeat(volume) + str1.repeat(luminosità)));
        }
    }

    @Override
    public String toString() {
        return "Video{" +
                "durata=" + durata +
                ", volume=" + volume +
                ", luminosità=" + luminosità +
                '}';
    }

    @Override
    public void aumentaLuminosità() {

    }

    @Override
    public void diminuisciLuminosità() {

    }

    @Override
    public void alzaVolume() {

    }

    @Override
    public void abbassaVolume() {

    }
}