package input;

import interfaces.IInput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileInput implements IInput {
    private final String filePath;
    private static final int BUFFER_LENGTH = 10;
    private FileReader readFile;

    public FileInput(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public byte[] read() throws IOException {
        try (FileReader reader = new FileReader(filePath)) {
            int i;
            StringBuilder text = new StringBuilder();
            char[] buffer = new char[BUFFER_LENGTH];
            while ((i = reader.read(buffer)) > -1) {
                if (i < BUFFER_LENGTH) {
                    buffer = Arrays.copyOf(buffer, i);
                }
                text.append(buffer);
            }
            return text.toString().getBytes();
        }
    }

    @Override
    public byte[] readLine() throws IOException {
        readFile = new FileReader(filePath);
        int i;
        StringBuilder text = new StringBuilder();
        while ((i = readFile.read()) != -1 && i != 10) {
            text.append((char) i);
        }
        readFile.close();
        return text.toString().getBytes();
    }
}
