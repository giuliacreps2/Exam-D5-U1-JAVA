import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immagine;
import entities.Video;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Video v1 = new Video("Ciao belli", 5, 5, 3);

        //L'UTENTE SELEZIONA LA CLASSE E COMPILA L'OGGETTO VUOTO
        System.out.println("Cosa vuoi guardare o riprodurre oggi? 1.Immagine 2.Video 3.Audio");
        int scelta = Integer.parseInt(scanner.nextLine());

        ElementoMultimediale multimedia;

//        switch (scelta) {
//            case 1:
//                multimedia = new Immagine();
//                multimedia.inserisciDati(scanner);
//                break;
//            case 2:
//                multimedia = new Video();
//                multimedia.inserisciDati(scanner);
//                break;
//            case 3:
//                multimedia = new Audio();
//                multimedia.inserisciDati(scanner);
//                break;
//            default:
//                multimedia = null;
//                System.out.println("Scelta non valida");
//        }

        //INSERISCO L'OGGETTO VUOTO NELL'ARRAY

        ArrayList<ElementoMultimediale> catalogoMultimediale = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
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

