import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immagine;
import entities.Video;

import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Video v1 = new Video("Ciao belli", 5, 5, 3);

        //L'UTENTE SELEZIONA LA CLASSE
        System.out.println("Cosa vuoi guardare o riprodurre oggi? 1.Immagine 2.Video 3.Audio");
        int scelta = scanner.nextInt();
        ElementoMultimediale multimedia = null;

        switch (scelta) {
            case 1:
                multimedia = new Immagine();
                System.out.println(multimedia);
                break;
            case 2:
                multimedia = new Video();
                System.out.println(multimedia);
                break;
            case 3:
                multimedia = new Audio();
                System.out.println(multimedia);
                break;
            default:
                multimedia = null;
                System.out.println("Scelta non valida");

        }

        //L'UTENTE COMPILA L'OGGETTO VUOTO
          public void inserisciDati(){
            if (multimedia == new Video()){
            System.out.println("Scrivi il titolo");
            String titolo = scanner.nextLine();
            System.out.println("Inserisci la durata del video da 1 a 10");
            int durata = scanner.nextInt();
            System.out.println("Inserisci il volume da 1 a 10");
            int volume = scanner.nextInt();
            System.out.println("Inserisci il valore della luminosità da 1 a 10");
            int luminosità = scanner.nextInt();
        }

//        System.out.println("Inserisci il titolo");
//        String titolo = scanner.nextLine();
//
//
//        ArrayList<ElementoMultimediale> catalogoMultimediale = new ArrayList<>();


//
//        Video v1 = new Video("Ciao belli", 5, 5, 3);
//        Immagine img1 = new Immagine("Patate", 8);
//        Audio a1 = new Audio("mare profumo di mare", 5, 6);
//
//        a1.play("mare profumo di mare", 5, 6);
        //img1.show("Patate", 8);
        //v1.play("Ciao belli", 5, 5, 3);

        //v1.play("Ciao belli", 5, 5, 3);

        //System.out.println(v1);


//
//        public void setVolume(int volume) {
//            if (volume < 0) System.out.println("Errore nella scelta del volume del video. Usa un nuovo valore da 1 a 10");
//            Scanner scanner = new Scanner(System.in);
//            volume = scanner.nextInt();
//            System.out.println("Nuova durata inserita" + volume);
//        }


    }
}

