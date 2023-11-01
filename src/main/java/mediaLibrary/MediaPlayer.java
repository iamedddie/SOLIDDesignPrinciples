package mediaLibrary;

public interface MediaPlayer {

    default void printInfo() {
        System.out.println("Print Media info......");
    }

    default void loadMedia(String filename) {
        System.out.println("Loading Media from "+ filename);
    }
}
