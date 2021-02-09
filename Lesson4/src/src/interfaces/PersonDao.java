package src.interfaces;

import model.Address;
import model.Person;

import java.util.List;

public interface PersonDao {
    List<Person> list();
    List<Person> list(Address address);
}
