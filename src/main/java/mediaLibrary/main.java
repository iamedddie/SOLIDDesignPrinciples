package mediaLibrary;


public class main {

    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        VideoPlayer vp = new VideoPlayer();
        ImageViewer iv = new ImageViewer();

        vp.zoom();
        iv.zoom();
        ap.mute();
        ap.play();
        vp.loadMedia("Jurassic park.mkv");
        ap.printInfo();

    }
}
