package service;

import exceptions.CantSpeakException;
import interfaces.Speaker;

public class SpeakerHandler {
    public void makeSpeakerSpeak(Speaker speaker) throws CantSpeakException {
        speaker.speak();
    }
}
