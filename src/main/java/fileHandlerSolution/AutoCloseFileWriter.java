package fileHandlerSolution;

import java.io.FileWriter;
import java.io.IOException;

public class AutoCloseFileWriter {
    private String filename;

    public AutoCloseFileWriter(String filename) {
        this.filename = filename;
    }

    public void write(String content) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        }
    }
}
