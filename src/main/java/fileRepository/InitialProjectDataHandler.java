package fileRepository;

public class InitialProjectDataHandler {

    private InitialFileRepository fileRepository;

    public InitialProjectDataHandler() {
        this.fileRepository = new InitialFileRepository();
    }

    public void saveData(String data) {
        fileRepository.save(data);
        // This high-level class is dependent on a low-level class.
    }
}
