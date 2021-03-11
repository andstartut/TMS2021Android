package menu;

import exceptions.ConsoleException;
import exceptions.SearchProductException;
import exceptions.StorageException;
import inputs.Console;
import products.Product;
import store.Store;

import java.util.InputMismatchException;

class AddProductSubmenu extends Menu {

    protected AddProductSubmenu(Store store) {
        super(store);
    }

    protected void getSubmenu() {
        System.out.println("Example: (id:5 name:Toyota Avensis type:sedan price:15000, quantity:2)");
        System.out.println("Input id:");
        try {
            int id = Console.getInt();
            System.out.println("Input name:");
            String name = Console.getString();
            MenuProductType.outputTypesToList();
            System.out.println("Chose type:");
            int type = Console.getInt();
            System.out.println("Input price:");
            int price = Console.getInt();
            System.out.println("Input quantity:");
            int quantity = Console.getInt();
            store.addProduct(new Product(id, name, MenuProductType.giveOutTypeByNumber(type), price), quantity);
            System.out.println("The product added successfully");
        } catch (SearchProductException | StorageException | ConsoleException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (InputMismatchException e) {
            System.out.println("You input wrong value");
            Console.getString();
        }
    }
}
