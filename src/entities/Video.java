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

    //SETTER
    public void setDurata(int durata) {
        if (durata < 0) System.out.println("Errore nella scelta della durata del video. Usa un nuovo valore da 1 a 10");
        Scanner scanner = new Scanner(System.in);
        durata = scanner.nextInt();
        System.out.println("Nuova durata inserita" + durata);
    }

    public void setVolume(int volume) {
        if (volume < 0) System.out.println("Errore nella scelta del volume del video. Usa un nuovo valore da 1 a 10");
        Scanner scanner = new Scanner(System.in);
        volume = scanner.nextInt();
        System.out.println("Nuova durata inserita" + volume);
    }

    public void setLuminosità()


    //METODI
    public void play(String titolo, int durata, int volume, int luminosità) {
        for (int i = 0; i <= durata; i++) {
            System.out.println(titolo.repeat(i));
            for (int j = 0; j <= volume; i++) {
                String str = "|";
                System.out.println(str.repeat(j));
            }
        }
    }


    @Override
    public void abbassaVolume(int durata, int volume) {
        Volume.super.abbassaVolume(durata, volume);
    }

    @Override
    public void alzaVolume(int durata, int volume) {
        Volume.super.alzaVolume(durata, volume);
    }

    @Override
    public void aumentaLuminosità() {

    }

    @Override
    public void diminuisciLuminosità() {

    }

    @Override
    public String toString() {
        return "Video{" +
                "durata=" + durata +
                ", volume=" + volume +
                ", luminosità=" + luminosità +
                '}';
    }
}

