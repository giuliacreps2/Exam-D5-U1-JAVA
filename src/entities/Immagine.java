package entities;

public class Immagine extends ElementoMultimediale {
    private int luminosità;

    //COSTRUTTORE
    public Immagine(String titolo, int luminosità) {
        super(titolo);
        this.luminosità = luminosità;
    }
}
