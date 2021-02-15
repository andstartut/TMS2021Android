package exceptions;

public class CantSpeakException extends Exception {
    public CantSpeakException() {
    }

    public CantSpeakException(String message) {
        super(message);
    }
}
