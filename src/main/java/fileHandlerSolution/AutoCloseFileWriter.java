package fileHandlerSolution;

import java.io.IOException;

public class AutoCloseFileWriter {
    private String filename;

    public AutoCloseFileWriter(String filename) {
        this.filename = filename;
    }

    public void write(String content) throws IOException {
        try (java.io.FileWriter writer = new java.io.FileWriter(filename)) {
            writer.write(content);
        }
    }
}
