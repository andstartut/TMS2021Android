package model;

import exceptions.CantSpeakException;

import java.io.IOException;

public class MutePerson extends Person {


    public MutePerson(String sex, Integer age, String name, Integer height) {
        super(sex, age, name, height);
    }

    public MutePerson(Integer age, String name) {
        super(age, name);
    }

    @Override
    public void speak() throws CantSpeakException {
        throw new CantSpeakException("Error");
    }
}
