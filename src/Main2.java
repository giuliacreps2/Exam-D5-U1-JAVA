import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immagine;
import entities.Video;

import java.util.ArrayList;
import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //     Video v1 = new Video("Ciao belli", 5, 5, 3);

        //L'UTENTE SELEZIONA LA CLASSE E COMPILA L'OGGETTO VUOTO
        ElementoMultimediale multimedia = null;

        ArrayList<ElementoMultimediale> catalogoMultimediale = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Cosa vuoi aggiungere? 1.Immagine 2.Video 3.Audio 0.Esci");
            int scelta = Integer.parseInt(scanner.nextLine());

            if (scelta == 0) break;

            switch (scelta) {
                case 1:
                    multimedia = new Immagine();
                    multimedia.inserisciDati(scanner);
                    break;
                case 2:
                    multimedia = new Video();
                    multimedia.inserisciDati(scanner);
                    break;
                case 3:
                    multimedia = new Audio();
                    multimedia.inserisciDati(scanner);
                    break;
                default:
                    multimedia = null;
                    System.out.println("Scelta non valida");
            }
            catalogoMultimediale.add(multimedia);
        }

        System.out.println(catalogoMultimediale);

        //L'UTENTE FA AGIRE I SUOI ELEMENTI MULTIMEDIALI
        while (true) {
            System.out.println("Quale elemento vuoi riprodurre? (1,2,3,4,5. Clicca 0 se vuoi uscire)");
            int scelta = Integer.parseInt(scanner.nextLine());

            if (scelta == 0) break;

            multimedia = catalogoMultimediale.get(scelta - 1);

            if (multimedia instanceof Video) {
                ((Video) multimedia).play();
            } else if (multimedia instanceof Audio) {
                ((Audio) multimedia).play();
            } else if (multimedia instanceof Immagine) {
                ((Immagine) multimedia).show();
            }
        }
    }
}
