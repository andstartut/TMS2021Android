package src.interfaces;

import model.Person;

import java.util.List;

public interface IImportData {
    List<Person> createCitizens(int count);

    List<Person> createCitizens();
}
