package entities;

public class Audio extends ElementoMultimediale {
    private int durata;
    private int volume;

    //COSTRUTTORE
    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }
}
