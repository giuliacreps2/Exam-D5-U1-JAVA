package entities;

public abstract class ElementoMultimediale {
    private String titolo;

    //COSTRUTTORE
    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    public ElementoMultimediale() {

    }

    //GETTER
    public String getTitolo() {
        return titolo;
    }

    //SETTER
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
}
