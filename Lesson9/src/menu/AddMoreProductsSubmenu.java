package menu;

import exceptions.ConsoleException;
import exceptions.StorageException;
import inputs.Console;
import store.Storage;
import store.Store;

public class AddMoreProductsSubmenu extends Menu {
    public AddMoreProductsSubmenu(Store store) {
        super(store);
    }

    protected void getSubmenu() {
        System.out.println("Input ID:");
        try {int id = Console.getInt();
        System.out.println("Input quantity:");
        int quantity = Console.getInt();
        store.getStorage().addMoreToStorage(id, quantity);
        } catch (StorageException e) {
            System.out.println(e);
        } catch (ConsoleException e) {
            System.out.println(e);
        }
    }
}
