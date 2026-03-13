package entities;

import interfaces.Volume;

public class Audio extends ElementoMultimediale implements Volume {
    private int durata;
    private int volume;

    //COSTRUTTORE
    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    //SETTER
    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //METODI
    public void play(String titolo, int durata, int volume) {
        for (int i = 0; i <= durata; i++) {
            String str = "|";
            System.out.println(titolo.concat(str.repeat(volume)));
        }
    }

    @Override
    public void alzaVolume() {

    }

    @Override
    public void abbassaVolume() {

    }

    @Override
    public String toString() {
        return "Audio{" +
                "durata=" + durata +
                ", volume=" + volume +
                '}';
    }
}



