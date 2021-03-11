package menu;

import exceptions.ConsoleException;
import exceptions.SearchProductException;
import exceptions.StorageException;
import inputs.Console;
import store.Store;

import java.util.InputMismatchException;

public class DeleteProductSubmenu extends Menu{
    protected DeleteProductSubmenu(Store store) {
        super(store);
    }

    protected void getSubmenu() {
        System.out.println("Input product ID what do you want to delete:");
        consoleListener();
    }

    private void consoleListener() {
        try {
            store.deleteProduct(Console.getInt());
            System.out.println("The product was deleted");
        } catch (InputMismatchException e) {
            System.out.println("You input wrong value");
            Console.getString();
        } catch (SearchProductException e) {
            System.out.println(e);
        } catch (ConsoleException e) {
            System.out.println(e);
        }
    }
}
