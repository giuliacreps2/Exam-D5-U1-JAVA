package interfaces;

public interface Volume {
    default void alzaVolume(int durata, int volume) {
        for (int i = 0; i <= 10; i++) {
            String str = "|";
            System.out.println(str.repeat(i));
        }
    }

    default void abbassaVolume(int durata, int volume) {
        for (int i = 10; i >= 0; i--) {
            String str = "|";
            System.out.println(str.repeat(i));
        }
    }
}

