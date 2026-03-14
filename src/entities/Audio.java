package entities;

import interfaces.Volume;

import java.util.Scanner;

public class Audio extends ElementoMultimediale implements Volume {
    private int durata;
    private int volume;

    //COSTRUTTORE
    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public Audio() {

    }

    @Override
    public void inserisciDati(Scanner scanner) {
        System.out.println("Scrivi il titolo");
        this.setTitolo(scanner.nextLine());
        System.out.println("Inserisci il volume da 1 a 10");
        this.volume = Integer.parseInt(scanner.nextLine());
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

    public void play() {
        for (int i = 0; i <= durata; i++) {
            String str = "|";
            System.out.println(this.getTitolo().concat(str.repeat(volume)));
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
                "titolo=" + getTitolo() +
                "durata=" + durata +
                ", volume=" + volume +
                '}';
    }
}



