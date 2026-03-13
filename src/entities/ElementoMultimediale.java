package entities;

public abstract class ElementoMultimediale {
    private String titolo;

    //COSTRUTTORE
    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    //GETTER
    public String getTitolo() {
        return titolo;
    }
}
