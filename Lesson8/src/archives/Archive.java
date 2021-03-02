package archives;

import interfaces.IArchive;

import java.io.*;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Archive implements IArchive {
private static final int BUFFER = 1024;
    @Override
    public void createZip(String path, List<File> files) throws IOException {
        try (ZipOutputStream archiveOut = new ZipOutputStream(new FileOutputStream(path))) {
            ZipEntry entry;
            for (File file : files) {
                entry = new ZipEntry(file.getName());
                archiveOut.putNextEntry(entry);
                byte[] bytes = new byte[BUFFER];
                FileInputStream inputStream = new FileInputStream(file);
                int length;
                while((length = inputStream.read(bytes)) >= 0) {
                    archiveOut.write(bytes, 0, length);
                }
                inputStream.close();
            }
        }
    }
}
