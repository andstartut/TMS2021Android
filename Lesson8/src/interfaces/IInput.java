package interfaces;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public interface IInput {
    byte[] read() throws IOException;
    byte[] readLine() throws IOException;
}
