package interfaces;

import exceptions.CantSpeakException;
import exceptions.NoAddressException;
import model.Address;

public interface IPerson {
    int getAge();
    String getName();
    String getSurname();
    String getSex();
    int getHeight();
    Address getAddress() throws NoAddressException;
    void speak() throws CantSpeakException;
}
