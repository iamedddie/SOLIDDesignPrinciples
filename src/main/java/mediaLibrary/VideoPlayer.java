package mediaLibrary;

public class VideoPlayer implements VisualMedia,AudioMedia {
    // Implementation skipped for brevity

    public void zoom() {
        System.out.println("Zooming video......");
    }

    public void play() {
        System.out.println("Playing Video....");
    }
    public void mute() {
        System.out.println("muting video....");
    }
}