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

    public Immagine() {

    }


    //SETTER
    public void setLuminosità(int luminosità) {
        this.luminosità = luminosità;
    }

    //METODI
    public void show(String titolo, int luminosità) {
        String str = "*";
        System.out.println(titolo + (str.repeat(luminosità)));
    }


    @Override
    public void inserisciDati(Scanner scanner) {
        System.out.println("Scrivi il titolo");
        this.setTitolo(scanner.nextLine());
        System.out.println("Inserisci il valore della luminosità da 1 a 10");
        this.luminosità = Integer.parseInt(scanner.nextLine());
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
                "titolo=" + getTitolo() +
                "luminosità=" + luminosità +
                '}';
    }
}

