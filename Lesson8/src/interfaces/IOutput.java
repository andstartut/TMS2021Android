package interfaces;

import java.io.IOException;

public interface IOutput {
    void write(String text) throws IOException;
    void append(String text) throws IOException;
}
