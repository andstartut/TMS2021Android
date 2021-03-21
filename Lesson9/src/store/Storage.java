package store;

import exceptions.StorageException;
import interfaces.IStorage;

import java.util.HashMap;
import java.util.Map;

public class Storage implements IStorage {
    private Map<Integer, Integer> storageOfProductsMap = new HashMap<>();

    @Override
    public void addNewProductToStorage(int id, int count) throws StorageException {
        if (storageOfProductsMap.containsKey(id)) {
            throw new StorageException("The product with ID:" + id + " is exist");
        }
        storageOfProductsMap.put(id, count);
    }

    @Override
    public void addMoreToStorage(int id, int count) throws StorageException {
        if (!storageOfProductsMap.containsKey(id)) {
            throw new StorageException("The product with this ID:" + id + " not found");
        }
        storageOfProductsMap.put(id, storageOfProductsMap.get(id) + count);
    }

    @Override
    public void takeFromStorage(int id, int count) throws StorageException {
        int howMuchLeft = getCountOfProduct(id) - count;
        if (howMuchLeft < 0) {
            throw new StorageException("You want to buy too much quantity. We have:" + storageOfProductsMap.get(id));
        } else if (howMuchLeft == 0) {
            deleteFromStorage(id);
        } else {
            storageOfProductsMap.put(id, howMuchLeft);
        }
    }

    public int getCountOfProduct(int id) throws StorageException {
        if (!storageOfProductsMap.containsKey(id)) {
            throw new StorageException("The product with ID:" + id + " not found");
        }
        return storageOfProductsMap.get(id);
    }

    @Override
    public void deleteFromStorage(int id) {
        storageOfProductsMap.remove(id);
    }

    public Map<Integer, Integer> getStorageOfProductsMap() {
        return storageOfProductsMap;
    }
}
