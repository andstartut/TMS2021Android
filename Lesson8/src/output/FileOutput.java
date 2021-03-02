package output;

import interfaces.IOutput;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutput implements IOutput {
    private final String filePath;

    public FileOutput(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void write(String text) throws IOException {
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(text);
        }
    }

    @Override
    public void append(String text) throws IOException {
        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            fileWriter.write(text);
        }
    }
}
