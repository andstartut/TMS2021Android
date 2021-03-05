package menu;

import exceptions.StorageException;
import inputs.Console;
import store.Storage;
import store.Store;

public class BuyProductsSubmenu extends Menu {
    public BuyProductsSubmenu(Store store) {
        super(store);
    }

    protected void getSubmenu() {
        System.out.println("Input id:");
        int id = Console.getInt();
        System.out.println("Input number of products do you want to buy:");
        int quantity = Console.getInt();
        try {
            store.getStorage().takeFromStorage(id, quantity);
        } catch (StorageException e) {
            System.out.println(e);
        }
    }
}
