package menu;

import exceptions.ConsoleException;
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
        try {
            int id = Console.getInt();
            System.out.println("Input number of products do you want to buy:");
            int quantity = Console.getInt();
            store.getStorage().takeFromStorage(id, quantity);
        } catch (StorageException e) {
            System.out.println(e);
        } catch (ConsoleException e) {
            System.out.println(e);
        }
    }
}
