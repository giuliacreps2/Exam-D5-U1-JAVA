package entities;

import interfaces.Luminosità;

import java.util.Scanner;

public class Immagine extends ElementoMultimediale implements Luminosità {
    private int luminosità;

    //COSTRUTTORE
    public Immagine(String titolo, int luminosità) {
        super(titolo);
        this.luminosità = luminosità;
    }

    //SETTER
    public void setLuminosità(int luminosità) {
        if (luminosità < 0)
            System.out.println("Errore nella scelta della luminosità del video. Usa un nuovo valore da 1 a 10");
        Scanner scanner = new Scanner(System.in);
        luminosità = scanner.nextInt();
        System.out.println("Nuova durata inserita" + luminosità);
    }

    //METODI
    public void show(String titolo, int luminosità) {
        String str = "*";
        System.out.println(titolo + (str.repeat(luminosità)));
    }

    @Override
    public void aumentaLuminosità() {

    }

    @Override
    public void diminuisciLuminosità() {

    }

    @Override
    public String toString() {
        return "Immagine{" +
                "luminosità=" + luminosità +
                '}';
    }
}

