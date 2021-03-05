package interfaces;

import exceptions.StorageException;

public interface IStorage {
    void addToStorage(int id, int count) throws StorageException;

    void takeFromStorage(int id, int count) throws StorageException;

    void deleteFromStorage(int id) throws StorageException;
}
