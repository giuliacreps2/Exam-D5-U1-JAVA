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



