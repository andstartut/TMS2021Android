package interfaces;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface IArchive {
    void createZip(String path, List<File> files) throws IOException;
}
