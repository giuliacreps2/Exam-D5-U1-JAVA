import entities.Audio;
import entities.Immagine;
import entities.Video;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Video v1 = new Video("Ciao belli", 5, 5, 3);
        Immagine img1 = new Immagine("Patate", 8);
        Audio a1 = new Audio("mare profumo di mare", 5, 6);

        a1.play("mare profumo di mare", 5, 6);
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

