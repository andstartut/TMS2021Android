package exceptions;

import java.io.IOException;

public class ConsoleException extends IOException {
    public ConsoleException(String message) {
        super(message);
    }
}
