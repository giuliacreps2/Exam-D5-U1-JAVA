package entities;

import interfaces.Luminosità;
import interfaces.Volume;

import java.util.Scanner;

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

    public Video() {

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
    public void inserisciDati(Scanner scanner) {
        System.out.println("Scrivi il titolo");
        this.setTitolo(scanner.nextLine());
        System.out.println("Inserisci la durata del video da 1 a 10");
        this.durata = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci il volume da 1 a 10");
        this.volume = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci il valore della luminosità da 1 a 10");
        this.luminosità = Integer.parseInt(scanner.nextLine());

    }

    @Override
    public String toString() {
        return "Video{" +
                "titolo=" + getTitolo() +
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