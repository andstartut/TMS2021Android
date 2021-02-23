package interfaces;

import exceptions.CantSpeakException;

public interface Speaker {
    void speak() throws CantSpeakException;
}
