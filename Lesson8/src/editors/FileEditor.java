package editors;

import output.FileOutput;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileEditor {
    private final String fileName = "/File";
    private final String fileExtension = ".txt";
    private List<File> files = new ArrayList<>();

    public List<File> createFiles(String filesPath, int count) throws IOException {
        for (int i = 1; i <= count; i++) {
            files.add(new File(filesPath, fileName + i + fileExtension));
        }
        for (File file : files) {
            file.createNewFile();
        }
        return files;
    }

    public static void fillFilesRandomNumbers(List<File> list) throws IOException {
        Random random = new Random();
        for (File file : list) {
            new FileOutput(file.getPath()).write(String.valueOf(random.nextLong()));
        }
    }
}
